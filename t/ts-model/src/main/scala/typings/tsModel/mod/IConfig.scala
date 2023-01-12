package typings.tsModel.mod

import typings.tsModel.anon.GenerateImplementation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConfig extends StObject {
  
  /**
    * generate asynchronous client
    **/
  var async: Boolean
  
  /**
    * If this option is set to true .get() will be collapsed to ()
    */
  var collapseGet: Boolean
  
  /**
    * If this option is set to true media type parameters will be removed from declarations
    */
  var collapseMediaTypes: Boolean
  
  /**
    * If this option is set to true method references will be collapsed if it is only method in the resource
    * foo.get() => foo()
    */
  var collapseOneMethod: Boolean
  
  /**
    * If it set to true system will create named interfaces for parameters defenition otherwise,
    * it will use structural types
    * Use named interfaces
    */
  var createTypesForParameters: Any
  
  /**
    * If it set to true system will create named interfaces for parameters defenition otherwise,
    * it will use structural types
    * Use named interfaces
    */
  var createTypesForResources: Boolean
  
  /**
    * If true will not reuse structural types for schemas
    */
  var createTypesForSchemaElements: Boolean
  
  var debugOptions: GenerateImplementation
  
  /**
    * For example, let resource 'somerRes' have GET, POST and PUT methods.
    * If 'false', generates get(), post() and put() for 'someResource'
    * If 'true', generates getSomeRes(), postSomeRes() and putSomeRes() for
    * parent of 'someRes'. If 'someRes' does not itself has child resources, it is not generated.
    * @type {boolean}
    */
  var methodNamesAsPrefixes: Boolean
  
  /**
    * if set to true it will be possible to pass numbers to string parameters
    * @type {boolean}
    */
  var numberIsString: Boolean
  
  /**
    * Whether to overwrite the 'node_modules' folder for the generated notebook.
    * If the folder is known to be consistent, the option may be set to 'false'
    * in order to save time.
    */
  var overwriteModules: Boolean
  
  /**
    * If this option is set to true query parameters will be placed as second argument when method has body
    */
  var queryParametersSecond: Boolean
  
  /**
    * It true geneartor will try to reuse parameter types when possible
    * and redeclare using type =
    */
  var reuseTypeForParameters: Boolean
  
  var reuseTypesForSchemaElements: Boolean
  
  /**
    * If this option is set to 'true', the executor combines request and response into a HAR entry
    * and places it into the '__$harEntry__' field of ramlscript response.
    */
  var storeHarEntry: Boolean
  
  /**
    * If 'true', exception is thrown for statuses > 399
    */
  var throwExceptionOnIncorrectStatus: Boolean
}
object IConfig {
  
  inline def apply(
    async: Boolean,
    collapseGet: Boolean,
    collapseMediaTypes: Boolean,
    collapseOneMethod: Boolean,
    createTypesForParameters: Any,
    createTypesForResources: Boolean,
    createTypesForSchemaElements: Boolean,
    debugOptions: GenerateImplementation,
    methodNamesAsPrefixes: Boolean,
    numberIsString: Boolean,
    overwriteModules: Boolean,
    queryParametersSecond: Boolean,
    reuseTypeForParameters: Boolean,
    reuseTypesForSchemaElements: Boolean,
    storeHarEntry: Boolean,
    throwExceptionOnIncorrectStatus: Boolean
  ): IConfig = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], collapseGet = collapseGet.asInstanceOf[js.Any], collapseMediaTypes = collapseMediaTypes.asInstanceOf[js.Any], collapseOneMethod = collapseOneMethod.asInstanceOf[js.Any], createTypesForParameters = createTypesForParameters.asInstanceOf[js.Any], createTypesForResources = createTypesForResources.asInstanceOf[js.Any], createTypesForSchemaElements = createTypesForSchemaElements.asInstanceOf[js.Any], debugOptions = debugOptions.asInstanceOf[js.Any], methodNamesAsPrefixes = methodNamesAsPrefixes.asInstanceOf[js.Any], numberIsString = numberIsString.asInstanceOf[js.Any], overwriteModules = overwriteModules.asInstanceOf[js.Any], queryParametersSecond = queryParametersSecond.asInstanceOf[js.Any], reuseTypeForParameters = reuseTypeForParameters.asInstanceOf[js.Any], reuseTypesForSchemaElements = reuseTypesForSchemaElements.asInstanceOf[js.Any], storeHarEntry = storeHarEntry.asInstanceOf[js.Any], throwExceptionOnIncorrectStatus = throwExceptionOnIncorrectStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IConfig] (val x: Self) extends AnyVal {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setCollapseGet(value: Boolean): Self = StObject.set(x, "collapseGet", value.asInstanceOf[js.Any])
    
    inline def setCollapseMediaTypes(value: Boolean): Self = StObject.set(x, "collapseMediaTypes", value.asInstanceOf[js.Any])
    
    inline def setCollapseOneMethod(value: Boolean): Self = StObject.set(x, "collapseOneMethod", value.asInstanceOf[js.Any])
    
    inline def setCreateTypesForParameters(value: Any): Self = StObject.set(x, "createTypesForParameters", value.asInstanceOf[js.Any])
    
    inline def setCreateTypesForResources(value: Boolean): Self = StObject.set(x, "createTypesForResources", value.asInstanceOf[js.Any])
    
    inline def setCreateTypesForSchemaElements(value: Boolean): Self = StObject.set(x, "createTypesForSchemaElements", value.asInstanceOf[js.Any])
    
    inline def setDebugOptions(value: GenerateImplementation): Self = StObject.set(x, "debugOptions", value.asInstanceOf[js.Any])
    
    inline def setMethodNamesAsPrefixes(value: Boolean): Self = StObject.set(x, "methodNamesAsPrefixes", value.asInstanceOf[js.Any])
    
    inline def setNumberIsString(value: Boolean): Self = StObject.set(x, "numberIsString", value.asInstanceOf[js.Any])
    
    inline def setOverwriteModules(value: Boolean): Self = StObject.set(x, "overwriteModules", value.asInstanceOf[js.Any])
    
    inline def setQueryParametersSecond(value: Boolean): Self = StObject.set(x, "queryParametersSecond", value.asInstanceOf[js.Any])
    
    inline def setReuseTypeForParameters(value: Boolean): Self = StObject.set(x, "reuseTypeForParameters", value.asInstanceOf[js.Any])
    
    inline def setReuseTypesForSchemaElements(value: Boolean): Self = StObject.set(x, "reuseTypesForSchemaElements", value.asInstanceOf[js.Any])
    
    inline def setStoreHarEntry(value: Boolean): Self = StObject.set(x, "storeHarEntry", value.asInstanceOf[js.Any])
    
    inline def setThrowExceptionOnIncorrectStatus(value: Boolean): Self = StObject.set(x, "throwExceptionOnIncorrectStatus", value.asInstanceOf[js.Any])
  }
}
