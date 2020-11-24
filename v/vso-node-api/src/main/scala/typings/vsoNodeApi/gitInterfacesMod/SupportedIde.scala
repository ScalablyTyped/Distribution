package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SupportedIde extends js.Object {
  
  /**
    * The download URL for the IDE.
    */
  var downloadUrl: String = js.native
  
  /**
    * The type of the IDE.
    */
  var ideType: SupportedIdeType = js.native
  
  /**
    * The name of the IDE.
    */
  var name: String = js.native
  
  /**
    * The URL to open the protocol handler for the IDE.
    */
  var protocolHandlerUrl: String = js.native
  
  /**
    * A list of SupportedPlatforms.
    */
  var supportedPlatforms: js.Array[String] = js.native
}
object SupportedIde {
  
  @scala.inline
  def apply(
    downloadUrl: String,
    ideType: SupportedIdeType,
    name: String,
    protocolHandlerUrl: String,
    supportedPlatforms: js.Array[String]
  ): SupportedIde = {
    val __obj = js.Dynamic.literal(downloadUrl = downloadUrl.asInstanceOf[js.Any], ideType = ideType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], protocolHandlerUrl = protocolHandlerUrl.asInstanceOf[js.Any], supportedPlatforms = supportedPlatforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportedIde]
  }
  
  @scala.inline
  implicit class SupportedIdeOps[Self <: SupportedIde] (val x: Self) extends AnyVal {
    
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
    def setDownloadUrl(value: String): Self = this.set("downloadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdeType(value: SupportedIdeType): Self = this.set("ideType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolHandlerUrl(value: String): Self = this.set("protocolHandlerUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedPlatformsVarargs(value: String*): Self = this.set("supportedPlatforms", js.Array(value :_*))
    
    @scala.inline
    def setSupportedPlatforms(value: js.Array[String]): Self = this.set("supportedPlatforms", value.asInstanceOf[js.Any])
  }
}
