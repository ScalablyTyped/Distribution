package typings.yamlAstParser

import typings.yamlAstParser.distSrcYamlASTMod.YAMLNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcLoaderMod {
  
  @JSImport("yaml-ast-parser/dist/src/loader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def load(input: String): YAMLNode = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(input.asInstanceOf[js.Any]).asInstanceOf[YAMLNode]
  inline def load(input: String, options: LoadOptions): YAMLNode = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[YAMLNode]
  
  inline def loadAll(input: String, iterator: js.Function1[/* document */ YAMLNode, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadAll")(input.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def loadAll(input: String, iterator: js.Function1[/* document */ YAMLNode, Unit], options: LoadOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadAll")(input.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def safeLoad(input: String): YAMLNode = ^.asInstanceOf[js.Dynamic].applyDynamic("safeLoad")(input.asInstanceOf[js.Any]).asInstanceOf[YAMLNode]
  inline def safeLoad(input: String, options: LoadOptions): YAMLNode = (^.asInstanceOf[js.Dynamic].applyDynamic("safeLoad")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[YAMLNode]
  
  inline def safeLoadAll(input: String, output: js.Function1[/* document */ YAMLNode, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("safeLoadAll")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def safeLoadAll(input: String, output: js.Function1[/* document */ YAMLNode, Unit], options: LoadOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("safeLoadAll")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait LoadOptions extends StObject {
    
    var allowAnyEscape: js.UndefOr[Boolean] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
    
    var ignoreDuplicateKeys: js.UndefOr[Boolean] = js.undefined
    
    var legacy: js.UndefOr[Boolean] = js.undefined
    
    var onWarning: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var schema: js.UndefOr[Any] = js.undefined
  }
  object LoadOptions {
    
    inline def apply(): LoadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadOptions]
    }
    
    extension [Self <: LoadOptions](x: Self) {
      
      inline def setAllowAnyEscape(value: Boolean): Self = StObject.set(x, "allowAnyEscape", value.asInstanceOf[js.Any])
      
      inline def setAllowAnyEscapeUndefined: Self = StObject.set(x, "allowAnyEscape", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setIgnoreDuplicateKeys(value: Boolean): Self = StObject.set(x, "ignoreDuplicateKeys", value.asInstanceOf[js.Any])
      
      inline def setIgnoreDuplicateKeysUndefined: Self = StObject.set(x, "ignoreDuplicateKeys", js.undefined)
      
      inline def setLegacy(value: Boolean): Self = StObject.set(x, "legacy", value.asInstanceOf[js.Any])
      
      inline def setLegacyUndefined: Self = StObject.set(x, "legacy", js.undefined)
      
      inline def setOnWarning(value: () => Any): Self = StObject.set(x, "onWarning", js.Any.fromFunction0(value))
      
      inline def setOnWarningUndefined: Self = StObject.set(x, "onWarning", js.undefined)
      
      inline def setSchema(value: Any): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    }
  }
}
