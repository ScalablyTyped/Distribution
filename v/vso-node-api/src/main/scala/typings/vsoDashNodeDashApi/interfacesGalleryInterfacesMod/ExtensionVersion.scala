package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import typings.std.Date
import typings.vsoDashNodeDashApi.Anon_KeyValueString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionVersion extends js.Object {
  var assetUri: String
  var badges: js.Array[ExtensionBadge]
  var fallbackAssetUri: String
  var files: js.Array[ExtensionFile]
  var flags: ExtensionVersionFlags
  var lastUpdated: Date
  var properties: js.Array[Anon_KeyValueString]
  var validationResultMessage: String
  var version: String
  var versionDescription: String
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
    properties: js.Array[Anon_KeyValueString],
    validationResultMessage: String,
    version: String,
    versionDescription: String
  ): ExtensionVersion = {
    val __obj = js.Dynamic.literal(assetUri = assetUri, badges = badges, fallbackAssetUri = fallbackAssetUri, files = files, flags = flags, lastUpdated = lastUpdated, properties = properties, validationResultMessage = validationResultMessage, version = version, versionDescription = versionDescription)
  
    __obj.asInstanceOf[ExtensionVersion]
  }
}

