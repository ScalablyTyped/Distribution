package typings.typedoc

import typings.std.Map
import typings.typedoc.typedocStrings.`object`
import typings.typedoc.typedocStrings.boolean
import typings.typedoc.typedocStrings.list
import typings.typedoc.typedocStrings.number
import typings.typedoc.typedocStrings.string
import typings.typescript.mod.DiagnosticMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsInternalMod {
  
  @JSImport("typedoc/dist/lib/ts-internal", "optionDeclarations")
  @js.native
  val optionDeclarations: js.Array[CommandLineOption] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.typedoc.tsInternalMod.CommandLineOptionOfCustomType
    - typings.typedoc.tsInternalMod.CommandLineOptionOfPrimitiveType
    - typings.typedoc.tsInternalMod.TsConfigOnlyOption
    - typings.typedoc.tsInternalMod.CommandLineOptionOfListType
  */
  trait CommandLineOption extends StObject
  object CommandLineOption {
    
    inline def CommandLineOptionOfCustomType(name: String, `type`: Map[Double | String, js.Any]): typings.typedoc.tsInternalMod.CommandLineOptionOfCustomType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typedoc.tsInternalMod.CommandLineOptionOfCustomType]
    }
    
    inline def CommandLineOptionOfListType(element: CommandLineOptionOfCustomType | CommandLineOptionOfPrimitiveType, name: String): typings.typedoc.tsInternalMod.CommandLineOptionOfListType = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("list")
      __obj.asInstanceOf[typings.typedoc.tsInternalMod.CommandLineOptionOfListType]
    }
    
    inline def CommandLineOptionOfPrimitiveType(name: String, `type`: string | number | boolean): typings.typedoc.tsInternalMod.CommandLineOptionOfPrimitiveType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typedoc.tsInternalMod.CommandLineOptionOfPrimitiveType]
    }
    
    inline def TsConfigOnlyOption(name: String): typings.typedoc.tsInternalMod.TsConfigOnlyOption = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("object")
      __obj.asInstanceOf[typings.typedoc.tsInternalMod.TsConfigOnlyOption]
    }
  }
  
  trait CommandLineOptionBase extends StObject {
    
    var description: js.UndefOr[DiagnosticMessage] = js.undefined
    
    var experimental: js.UndefOr[Boolean] = js.undefined
    
    var isFilePath: js.UndefOr[Boolean] = js.undefined
    
    var isTSConfigOnly: js.UndefOr[Boolean] = js.undefined
    
    var name: String
    
    var paramType: js.UndefOr[DiagnosticMessage] = js.undefined
    
    var shortName: js.UndefOr[String] = js.undefined
    
    var `type`: string | number | boolean | `object` | list | (Map[Double | String, js.Any])
  }
  object CommandLineOptionBase {
    
    inline def apply(name: String, `type`: string | number | boolean | `object` | list | (Map[Double | String, js.Any])): CommandLineOptionBase = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandLineOptionBase]
    }
    
    extension [Self <: CommandLineOptionBase](x: Self) {
      
      inline def setDescription(value: DiagnosticMessage): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setExperimental(value: Boolean): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
      
      inline def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
      
      inline def setIsFilePath(value: Boolean): Self = StObject.set(x, "isFilePath", value.asInstanceOf[js.Any])
      
      inline def setIsFilePathUndefined: Self = StObject.set(x, "isFilePath", js.undefined)
      
      inline def setIsTSConfigOnly(value: Boolean): Self = StObject.set(x, "isTSConfigOnly", value.asInstanceOf[js.Any])
      
      inline def setIsTSConfigOnlyUndefined: Self = StObject.set(x, "isTSConfigOnly", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParamType(value: DiagnosticMessage): Self = StObject.set(x, "paramType", value.asInstanceOf[js.Any])
      
      inline def setParamTypeUndefined: Self = StObject.set(x, "paramType", js.undefined)
      
      inline def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
      
      inline def setShortNameUndefined: Self = StObject.set(x, "shortName", js.undefined)
      
      inline def setType(value: string | number | boolean | `object` | list | (Map[Double | String, js.Any])): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommandLineOptionOfCustomType
    extends StObject
       with CommandLineOptionBase
       with CommandLineOption {
    
    @JSName("type")
    var type_CommandLineOptionOfCustomType: Map[Double | String, js.Any]
  }
  object CommandLineOptionOfCustomType {
    
    inline def apply(name: String, `type`: Map[Double | String, js.Any]): CommandLineOptionOfCustomType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandLineOptionOfCustomType]
    }
    
    extension [Self <: CommandLineOptionOfCustomType](x: Self) {
      
      inline def setType(value: Map[Double | String, js.Any]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommandLineOptionOfListType
    extends StObject
       with CommandLineOptionBase
       with CommandLineOption {
    
    var element: CommandLineOptionOfCustomType | CommandLineOptionOfPrimitiveType
    
    @JSName("type")
    var type_CommandLineOptionOfListType: list
  }
  object CommandLineOptionOfListType {
    
    inline def apply(element: CommandLineOptionOfCustomType | CommandLineOptionOfPrimitiveType, name: String): CommandLineOptionOfListType = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("list")
      __obj.asInstanceOf[CommandLineOptionOfListType]
    }
    
    extension [Self <: CommandLineOptionOfListType](x: Self) {
      
      inline def setElement(value: CommandLineOptionOfCustomType | CommandLineOptionOfPrimitiveType): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setType(value: list): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommandLineOptionOfPrimitiveType
    extends StObject
       with CommandLineOptionBase
       with CommandLineOption {
    
    @JSName("type")
    var type_CommandLineOptionOfPrimitiveType: string | number | boolean
  }
  object CommandLineOptionOfPrimitiveType {
    
    inline def apply(name: String, `type`: string | number | boolean): CommandLineOptionOfPrimitiveType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandLineOptionOfPrimitiveType]
    }
    
    extension [Self <: CommandLineOptionOfPrimitiveType](x: Self) {
      
      inline def setType(value: string | number | boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TsConfigOnlyOption
    extends StObject
       with CommandLineOptionBase
       with CommandLineOption {
    
    @JSName("type")
    var type_TsConfigOnlyOption: `object`
  }
  object TsConfigOnlyOption {
    
    inline def apply(name: String): TsConfigOnlyOption = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("object")
      __obj.asInstanceOf[TsConfigOnlyOption]
    }
    
    extension [Self <: TsConfigOnlyOption](x: Self) {
      
      inline def setType(value: `object`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object typescriptAugmentingMod {
    
    trait Node extends StObject {
      
      var localSymbol: js.UndefOr[typings.typescript.mod.Symbol] = js.undefined
      
      var symbol: js.UndefOr[typings.typescript.mod.Symbol] = js.undefined
    }
    object Node {
      
      inline def apply(): Node = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Node]
      }
      
      extension [Self <: Node](x: Self) {
        
        inline def setLocalSymbol(value: typings.typescript.mod.Symbol): Self = StObject.set(x, "localSymbol", value.asInstanceOf[js.Any])
        
        inline def setLocalSymbolUndefined: Self = StObject.set(x, "localSymbol", js.undefined)
        
        inline def setSymbol(value: typings.typescript.mod.Symbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
        
        inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
      }
    }
    
    trait Symbol extends StObject {
      
      var parent: js.UndefOr[typings.typescript.mod.Symbol] = js.undefined
    }
    object Symbol {
      
      inline def apply(): Symbol = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Symbol]
      }
      
      extension [Self <: Symbol](x: Self) {
        
        inline def setParent(value: typings.typescript.mod.Symbol): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
        
        inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      }
    }
  }
}
