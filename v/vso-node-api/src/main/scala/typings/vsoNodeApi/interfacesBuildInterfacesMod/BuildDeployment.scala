package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildDeployment extends StObject {
  
  var deployment: BuildSummary
  
  var sourceBuild: XamlBuildReference
}
object BuildDeployment {
  
  inline def apply(deployment: BuildSummary, sourceBuild: XamlBuildReference): BuildDeployment = {
    val __obj = js.Dynamic.literal(deployment = deployment.asInstanceOf[js.Any], sourceBuild = sourceBuild.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildDeployment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildDeployment] (val x: Self) extends AnyVal {
    
    inline def setDeployment(value: BuildSummary): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
    
    inline def setSourceBuild(value: XamlBuildReference): Self = StObject.set(x, "sourceBuild", value.asInstanceOf[js.Any])
  }
}
