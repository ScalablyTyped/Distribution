package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait YamlProcess
  extends StObject
     with BuildProcess {
  
  var errors: js.Array[String]
  
  /**
    * The resources used by the build definition.
    */
  var resources: BuildProcessResources
  
  /**
    * The YAML filename.
    */
  var yamlFilename: String
}
object YamlProcess {
  
  inline def apply(errors: js.Array[String], resources: BuildProcessResources, `type`: Double, yamlFilename: String): YamlProcess = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], yamlFilename = yamlFilename.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[YamlProcess]
  }
  
  extension [Self <: YamlProcess](x: Self) {
    
    inline def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setResources(value: BuildProcessResources): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setYamlFilename(value: String): Self = StObject.set(x, "yamlFilename", value.asInstanceOf[js.Any])
  }
}
