package typings.vsoNodeApi.galleryInterfacesMod

import typings.vsoNodeApi.anon.KeyValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionVersion extends StObject {
  
  var assetUri: String
  
  var badges: js.Array[ExtensionBadge]
  
  var fallbackAssetUri: String
  
  var files: js.Array[ExtensionFile]
  
  var flags: ExtensionVersionFlags
  
  var lastUpdated: js.Date
  
  var properties: js.Array[KeyValue]
  
  var validationResultMessage: String
  
  var version: String
  
  var versionDescription: String
}
object ExtensionVersion {
  
  inline def apply(
    assetUri: String,
    badges: js.Array[ExtensionBadge],
    fallbackAssetUri: String,
    files: js.Array[ExtensionFile],
    flags: ExtensionVersionFlags,
    lastUpdated: js.Date,
    properties: js.Array[KeyValue],
    validationResultMessage: String,
    version: String,
    versionDescription: String
  ): ExtensionVersion = {
    val __obj = js.Dynamic.literal(assetUri = assetUri.asInstanceOf[js.Any], badges = badges.asInstanceOf[js.Any], fallbackAssetUri = fallbackAssetUri.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], lastUpdated = lastUpdated.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], validationResultMessage = validationResultMessage.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], versionDescription = versionDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionVersion]
  }
  
  extension [Self <: ExtensionVersion](x: Self) {
    
    inline def setAssetUri(value: String): Self = StObject.set(x, "assetUri", value.asInstanceOf[js.Any])
    
    inline def setBadges(value: js.Array[ExtensionBadge]): Self = StObject.set(x, "badges", value.asInstanceOf[js.Any])
    
    inline def setBadgesVarargs(value: ExtensionBadge*): Self = StObject.set(x, "badges", js.Array(value*))
    
    inline def setFallbackAssetUri(value: String): Self = StObject.set(x, "fallbackAssetUri", value.asInstanceOf[js.Any])
    
    inline def setFiles(value: js.Array[ExtensionFile]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesVarargs(value: ExtensionFile*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setFlags(value: ExtensionVersionFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setLastUpdated(value: js.Date): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: js.Array[KeyValue]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesVarargs(value: KeyValue*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setValidationResultMessage(value: String): Self = StObject.set(x, "validationResultMessage", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionDescription(value: String): Self = StObject.set(x, "versionDescription", value.asInstanceOf[js.Any])
  }
}
