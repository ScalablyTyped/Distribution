package typings.webpack.anon

import typings.std.Generator
import typings.std.Record
import typings.webpack.mod.LoaderItem
import typings.webpack.mod.ModuleSettings
import typings.webpack.mod.Parser
import typings.webpack.mod.ResolveOptionsWebpackOptions
import typings.webpack.webpackStrings._empty
import typings.webpack.webpackStrings.javascriptSlashauto
import typings.webpack.webpackStrings.javascriptSlashdynamic
import typings.webpack.webpackStrings.javascriptSlashesm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<webpack.webpack.NormalModuleCreateData & {  settings :webpack.webpack.ModuleSettings}> */
trait PartialNormalModuleCreate extends StObject {
  
  var context: js.UndefOr[String] = js.undefined
  
  var generator: js.UndefOr[Generator[Any, Any, Any]] = js.undefined
  
  var generatorOptions: js.UndefOr[Record[String, Any]] = js.undefined
  
  var layer: js.UndefOr[String] = js.undefined
  
  var loaders: js.UndefOr[js.Array[LoaderItem]] = js.undefined
  
  var matchResource: js.UndefOr[String] = js.undefined
  
  var parser: js.UndefOr[Parser] = js.undefined
  
  var parserOptions: js.UndefOr[Record[String, Any]] = js.undefined
  
  var rawRequest: js.UndefOr[String] = js.undefined
  
  var request: js.UndefOr[String] = js.undefined
  
  var resolveOptions: js.UndefOr[ResolveOptionsWebpackOptions] = js.undefined
  
  var resource: js.UndefOr[String] = js.undefined
  
  var resourceResolveData: js.UndefOr[Record[String, Any]] = js.undefined
  
  var settings: js.UndefOr[ModuleSettings] = js.undefined
  
  var `type`: js.UndefOr[_empty | javascriptSlashauto | javascriptSlashdynamic | javascriptSlashesm] = js.undefined
  
  var userRequest: js.UndefOr[String] = js.undefined
}
object PartialNormalModuleCreate {
  
  inline def apply(): PartialNormalModuleCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialNormalModuleCreate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialNormalModuleCreate] (val x: Self) extends AnyVal {
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setGenerator(value: Generator[Any, Any, Any]): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
    
    inline def setGeneratorOptions(value: Record[String, Any]): Self = StObject.set(x, "generatorOptions", value.asInstanceOf[js.Any])
    
    inline def setGeneratorOptionsUndefined: Self = StObject.set(x, "generatorOptions", js.undefined)
    
    inline def setGeneratorUndefined: Self = StObject.set(x, "generator", js.undefined)
    
    inline def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    inline def setLoaders(value: js.Array[LoaderItem]): Self = StObject.set(x, "loaders", value.asInstanceOf[js.Any])
    
    inline def setLoadersUndefined: Self = StObject.set(x, "loaders", js.undefined)
    
    inline def setLoadersVarargs(value: LoaderItem*): Self = StObject.set(x, "loaders", js.Array(value*))
    
    inline def setMatchResource(value: String): Self = StObject.set(x, "matchResource", value.asInstanceOf[js.Any])
    
    inline def setMatchResourceUndefined: Self = StObject.set(x, "matchResource", js.undefined)
    
    inline def setParser(value: Parser): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
    
    inline def setParserOptions(value: Record[String, Any]): Self = StObject.set(x, "parserOptions", value.asInstanceOf[js.Any])
    
    inline def setParserOptionsUndefined: Self = StObject.set(x, "parserOptions", js.undefined)
    
    inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
    
    inline def setRawRequest(value: String): Self = StObject.set(x, "rawRequest", value.asInstanceOf[js.Any])
    
    inline def setRawRequestUndefined: Self = StObject.set(x, "rawRequest", js.undefined)
    
    inline def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setResolveOptions(value: ResolveOptionsWebpackOptions): Self = StObject.set(x, "resolveOptions", value.asInstanceOf[js.Any])
    
    inline def setResolveOptionsUndefined: Self = StObject.set(x, "resolveOptions", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceResolveData(value: Record[String, Any]): Self = StObject.set(x, "resourceResolveData", value.asInstanceOf[js.Any])
    
    inline def setResourceResolveDataUndefined: Self = StObject.set(x, "resourceResolveData", js.undefined)
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setSettings(value: ModuleSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setType(value: _empty | javascriptSlashauto | javascriptSlashdynamic | javascriptSlashesm): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUserRequest(value: String): Self = StObject.set(x, "userRequest", value.asInstanceOf[js.Any])
    
    inline def setUserRequestUndefined: Self = StObject.set(x, "userRequest", js.undefined)
  }
}
