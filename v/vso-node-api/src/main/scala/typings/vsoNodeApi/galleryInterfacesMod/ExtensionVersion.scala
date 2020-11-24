package typings.vsoNodeApi.galleryInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.anon.KeyValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtensionVersion extends js.Object {
  
  var assetUri: String = js.native
  
  var badges: js.Array[ExtensionBadge] = js.native
  
  var fallbackAssetUri: String = js.native
  
  var files: js.Array[ExtensionFile] = js.native
  
  var flags: ExtensionVersionFlags = js.native
  
  var lastUpdated: Date = js.native
  
  var properties: js.Array[KeyValue] = js.native
  
  var validationResultMessage: String = js.native
  
  var version: String = js.native
  
  var versionDescription: String = js.native
}
object ExtensionVersion {
  
  @scala.inline
  def apply(
    assetUri: String,
    badges: js.Array[ExtensionBadge],
    fallbackAssetUri: String,
    files: js.Array[ExtensionFile],
    flags: ExtensionVersionFlags,
    lastUpdated: Date,
    properties: js.Array[KeyValue],
    validationResultMessage: String,
    version: String,
    versionDescription: String
  ): ExtensionVersion = {
    val __obj = js.Dynamic.literal(assetUri = assetUri.asInstanceOf[js.Any], badges = badges.asInstanceOf[js.Any], fallbackAssetUri = fallbackAssetUri.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], lastUpdated = lastUpdated.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], validationResultMessage = validationResultMessage.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], versionDescription = versionDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionVersion]
  }
  
  @scala.inline
  implicit class ExtensionVersionOps[Self <: ExtensionVersion] (val x: Self) extends AnyVal {
    
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
    def setAssetUri(value: String): Self = this.set("assetUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgesVarargs(value: ExtensionBadge*): Self = this.set("badges", js.Array(value :_*))
    
    @scala.inline
    def setBadges(value: js.Array[ExtensionBadge]): Self = this.set("badges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbackAssetUri(value: String): Self = this.set("fallbackAssetUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesVarargs(value: ExtensionFile*): Self = this.set("files", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[ExtensionFile]): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: ExtensionVersionFlags): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdated(value: Date): Self = this.set("lastUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesVarargs(value: KeyValue*): Self = this.set("properties", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: js.Array[KeyValue]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationResultMessage(value: String): Self = this.set("validationResultMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionDescription(value: String): Self = this.set("versionDescription", value.asInstanceOf[js.Any])
  }
}
