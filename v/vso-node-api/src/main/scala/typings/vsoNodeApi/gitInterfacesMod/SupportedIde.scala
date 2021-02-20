package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SupportedIde extends StObject {
  
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
  implicit class SupportedIdeMutableBuilder[Self <: SupportedIde] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDownloadUrl(value: String): Self = StObject.set(x, "downloadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdeType(value: SupportedIdeType): Self = StObject.set(x, "ideType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolHandlerUrl(value: String): Self = StObject.set(x, "protocolHandlerUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedPlatforms(value: js.Array[String]): Self = StObject.set(x, "supportedPlatforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedPlatformsVarargs(value: String*): Self = StObject.set(x, "supportedPlatforms", js.Array(value :_*))
  }
}
