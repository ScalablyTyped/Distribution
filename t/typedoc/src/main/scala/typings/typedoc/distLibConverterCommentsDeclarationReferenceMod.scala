package typings.typedoc

import typings.typedoc.typedocStrings.Dot
import typings.typedoc.typedocStrings.Numbersign
import typings.typedoc.typedocStrings.Tilde
import typings.typedoc.typedocStrings.`class`
import typings.typedoc.typedocStrings.`enum`
import typings.typedoc.typedocStrings.`new`
import typings.typedoc.typedocStrings.`type`
import typings.typedoc.typedocStrings.`var`
import typings.typedoc.typedocStrings.call
import typings.typedoc.typedocStrings.complex
import typings.typedoc.typedocStrings.constructor
import typings.typedoc.typedocStrings.event
import typings.typedoc.typedocStrings.function_
import typings.typedoc.typedocStrings.getter
import typings.typedoc.typedocStrings.global
import typings.typedoc.typedocStrings.index
import typings.typedoc.typedocStrings.interface
import typings.typedoc.typedocStrings.local
import typings.typedoc.typedocStrings.member
import typings.typedoc.typedocStrings.namespace
import typings.typedoc.typedocStrings.setter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibConverterCommentsDeclarationReferenceMod {
  
  @JSImport("typedoc/dist/lib/converter/comments/declarationReference", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("typedoc/dist/lib/converter/comments/declarationReference", "MeaningKeywords")
  @js.native
  val MeaningKeywords: js.Tuple16[
    `class`, 
    interface, 
    `type`, 
    `enum`, 
    namespace, 
    function_, 
    `var`, 
    constructor, 
    member, 
    event, 
    call, 
    `new`, 
    index, 
    complex, 
    getter, 
    setter
  ] = js.native
  
  inline def parseComponent(source: String, pos: Double, end: Double): js.UndefOr[js.Tuple2[String, Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseComponent")(source.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Tuple2[String, Double]]]
  
  inline def parseComponentPath(source: String, pos: Double, end: Double): js.UndefOr[js.Tuple2[js.Array[ComponentPath], Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseComponentPath")(source.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Tuple2[js.Array[ComponentPath], Double]]]
  
  inline def parseDeclarationReference(source: String, pos: Double, end: Double): js.UndefOr[js.Tuple2[DeclarationReference, Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDeclarationReference")(source.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Tuple2[DeclarationReference, Double]]]
  
  inline def parseMeaning(source: String, pos: Double, end: Double): js.UndefOr[js.Tuple2[Meaning, Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMeaning")(source.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Tuple2[Meaning, Double]]]
  
  inline def parseModuleSource(source: String, pos: Double, end: Double): js.UndefOr[js.Tuple2[String, Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseModuleSource")(source.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Tuple2[String, Double]]]
  
  inline def parseString(source: String, pos: Double, end: Double): js.UndefOr[js.Tuple2[String, Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseString")(source.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Tuple2[String, Double]]]
  
  inline def parseSymbolReference(source: String, pos: Double, end: Double): js.UndefOr[js.Tuple2[SymbolReference, Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSymbolReference")(source.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Tuple2[SymbolReference, Double]]]
  
  trait ComponentPath extends StObject {
    
    /**
      * How to resolve the `path`
      * - `.` - Navigate via `exports` of symbol
      * - `#` - Navigate via `members` of symbol
      * - `~` - Navigate via `locals` of symbol
      */
    var navigation: Dot | Numbersign | Tilde
    
    var path: String
  }
  object ComponentPath {
    
    inline def apply(navigation: Dot | Numbersign | Tilde, path: String): ComponentPath = {
      val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentPath]
    }
    
    extension [Self <: ComponentPath](x: Self) {
      
      inline def setNavigation(value: Dot | Numbersign | Tilde): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeclarationReference extends StObject {
    
    var moduleSource: js.UndefOr[String] = js.undefined
    
    var resolutionStart: global | local
    
    var symbolReference: js.UndefOr[SymbolReference] = js.undefined
  }
  object DeclarationReference {
    
    inline def apply(resolutionStart: global | local): DeclarationReference = {
      val __obj = js.Dynamic.literal(resolutionStart = resolutionStart.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeclarationReference]
    }
    
    extension [Self <: DeclarationReference](x: Self) {
      
      inline def setModuleSource(value: String): Self = StObject.set(x, "moduleSource", value.asInstanceOf[js.Any])
      
      inline def setModuleSourceUndefined: Self = StObject.set(x, "moduleSource", js.undefined)
      
      inline def setResolutionStart(value: global | local): Self = StObject.set(x, "resolutionStart", value.asInstanceOf[js.Any])
      
      inline def setSymbolReference(value: SymbolReference): Self = StObject.set(x, "symbolReference", value.asInstanceOf[js.Any])
      
      inline def setSymbolReferenceUndefined: Self = StObject.set(x, "symbolReference", js.undefined)
    }
  }
  
  trait Meaning extends StObject {
    
    var index: js.UndefOr[Double] = js.undefined
    
    var keyword: js.UndefOr[MeaningKeyword] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
  }
  object Meaning {
    
    inline def apply(): Meaning = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Meaning]
    }
    
    extension [Self <: Meaning](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setKeyword(value: MeaningKeyword): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      inline def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.typedoc.typedocStrings.`class`
    - typings.typedoc.typedocStrings.interface
    - typings.typedoc.typedocStrings.`type`
    - typings.typedoc.typedocStrings.`enum`
    - typings.typedoc.typedocStrings.namespace
    - typings.typedoc.typedocStrings.function_
    - typings.typedoc.typedocStrings.`var`
    - typings.typedoc.typedocStrings.constructor
    - typings.typedoc.typedocStrings.member
    - typings.typedoc.typedocStrings.event
    - typings.typedoc.typedocStrings.call
    - typings.typedoc.typedocStrings.`new`
    - typings.typedoc.typedocStrings.index
    - typings.typedoc.typedocStrings.complex
    - typings.typedoc.typedocStrings.getter
    - typings.typedoc.typedocStrings.setter
  */
  trait MeaningKeyword extends StObject
  
  trait SymbolReference extends StObject {
    
    var meaning: js.UndefOr[Meaning] = js.undefined
    
    var path: js.UndefOr[js.Array[ComponentPath]] = js.undefined
  }
  object SymbolReference {
    
    inline def apply(): SymbolReference = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SymbolReference]
    }
    
    extension [Self <: SymbolReference](x: Self) {
      
      inline def setMeaning(value: Meaning): Self = StObject.set(x, "meaning", value.asInstanceOf[js.Any])
      
      inline def setMeaningUndefined: Self = StObject.set(x, "meaning", js.undefined)
      
      inline def setPath(value: js.Array[ComponentPath]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPathVarargs(value: ComponentPath*): Self = StObject.set(x, "path", js.Array(value*))
    }
  }
}
