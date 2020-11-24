package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobEnvironment extends js.Object {
  
  var endpoints: js.Array[ServiceEndpoint] = js.native
  
  var mask: js.Array[MaskHint] = js.native
  
  var options: StringDictionary[JobOption] = js.native
  
  var secureFiles: js.Array[SecureFile] = js.native
  
  /**
    * Gets or sets the endpoint used for communicating back to the calling service.
    */
  var systemConnection: ServiceEndpoint = js.native
  
  var variables: StringDictionary[String] = js.native
}
object JobEnvironment {
  
  @scala.inline
  def apply(
    endpoints: js.Array[ServiceEndpoint],
    mask: js.Array[MaskHint],
    options: StringDictionary[JobOption],
    secureFiles: js.Array[SecureFile],
    systemConnection: ServiceEndpoint,
    variables: StringDictionary[String]
  ): JobEnvironment = {
    val __obj = js.Dynamic.literal(endpoints = endpoints.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], secureFiles = secureFiles.asInstanceOf[js.Any], systemConnection = systemConnection.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobEnvironment]
  }
  
  @scala.inline
  implicit class JobEnvironmentOps[Self <: JobEnvironment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEndpointsVarargs(value: ServiceEndpoint*): Self = this.set("endpoints", js.Array(value :_*))
    
    @scala.inline
    def setEndpoints(value: js.Array[ServiceEndpoint]): Self = this.set("endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskVarargs(value: MaskHint*): Self = this.set("mask", js.Array(value :_*))
    
    @scala.inline
    def setMask(value: js.Array[MaskHint]): Self = this.set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: StringDictionary[JobOption]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureFilesVarargs(value: SecureFile*): Self = this.set("secureFiles", js.Array(value :_*))
    
    @scala.inline
    def setSecureFiles(value: js.Array[SecureFile]): Self = this.set("secureFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemConnection(value: ServiceEndpoint): Self = this.set("systemConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariables(value: StringDictionary[String]): Self = this.set("variables", value.asInstanceOf[js.Any])
  }
}
