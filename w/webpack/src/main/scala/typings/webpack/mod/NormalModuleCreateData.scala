package typings.webpack.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalModuleCreateData extends StObject {
  
  /**
  	 * context directory for resolving
  	 */
  var context: String
  
  /**
  	 * the generator used
  	 */
  var generator: typings.std.Generator[Any, Any, Any]
  
  /**
  	 * the options of the generator used
  	 */
  var generatorOptions: js.UndefOr[Record[String, Any]] = js.undefined
  
  /**
  	 * an optional layer in which the module is
  	 */
  var layer: js.UndefOr[String] = js.undefined
  
  /**
  	 * list of loaders
  	 */
  var loaders: js.Array[LoaderItem]
  
  /**
  	 * path + query of the matched resource (virtual)
  	 */
  var matchResource: js.UndefOr[String] = js.undefined
  
  /**
  	 * the parser used
  	 */
  var parser: Parser
  
  /**
  	 * the options of the parser used
  	 */
  var parserOptions: js.UndefOr[Record[String, Any]] = js.undefined
  
  /**
  	 * request without resolving
  	 */
  var rawRequest: String
  
  /**
  	 * request string
  	 */
  var request: String
  
  /**
  	 * options used for resolving requests from this module
  	 */
  var resolveOptions: js.UndefOr[ResolveOptionsWebpackOptions] = js.undefined
  
  /**
  	 * path + query of the real resource
  	 */
  var resource: String
  
  /**
  	 * resource resolve data
  	 */
  var resourceResolveData: js.UndefOr[Record[String, Any]] = js.undefined
  
  /**
  	 * module type
  	 */
  var `type`: String
  
  /**
  	 * request intended by user (without loaders from config)
  	 */
  var userRequest: String
}
object NormalModuleCreateData {
  
  inline def apply(
    context: String,
    generator: typings.std.Generator[Any, Any, Any],
    loaders: js.Array[LoaderItem],
    parser: Parser,
    rawRequest: String,
    request: String,
    resource: String,
    `type`: String,
    userRequest: String
  ): NormalModuleCreateData = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], loaders = loaders.asInstanceOf[js.Any], parser = parser.asInstanceOf[js.Any], rawRequest = rawRequest.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], userRequest = userRequest.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalModuleCreateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NormalModuleCreateData] (val x: Self) extends AnyVal {
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setGenerator(value: typings.std.Generator[Any, Any, Any]): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
    
    inline def setGeneratorOptions(value: Record[String, Any]): Self = StObject.set(x, "generatorOptions", value.asInstanceOf[js.Any])
    
    inline def setGeneratorOptionsUndefined: Self = StObject.set(x, "generatorOptions", js.undefined)
    
    inline def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    inline def setLoaders(value: js.Array[LoaderItem]): Self = StObject.set(x, "loaders", value.asInstanceOf[js.Any])
    
    inline def setLoadersVarargs(value: LoaderItem*): Self = StObject.set(x, "loaders", js.Array(value*))
    
    inline def setMatchResource(value: String): Self = StObject.set(x, "matchResource", value.asInstanceOf[js.Any])
    
    inline def setMatchResourceUndefined: Self = StObject.set(x, "matchResource", js.undefined)
    
    inline def setParser(value: Parser): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
    
    inline def setParserOptions(value: Record[String, Any]): Self = StObject.set(x, "parserOptions", value.asInstanceOf[js.Any])
    
    inline def setParserOptionsUndefined: Self = StObject.set(x, "parserOptions", js.undefined)
    
    inline def setRawRequest(value: String): Self = StObject.set(x, "rawRequest", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResolveOptions(value: ResolveOptionsWebpackOptions): Self = StObject.set(x, "resolveOptions", value.asInstanceOf[js.Any])
    
    inline def setResolveOptionsUndefined: Self = StObject.set(x, "resolveOptions", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceResolveData(value: Record[String, Any]): Self = StObject.set(x, "resourceResolveData", value.asInstanceOf[js.Any])
    
    inline def setResourceResolveDataUndefined: Self = StObject.set(x, "resourceResolveData", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUserRequest(value: String): Self = StObject.set(x, "userRequest", value.asInstanceOf[js.Any])
  }
}
