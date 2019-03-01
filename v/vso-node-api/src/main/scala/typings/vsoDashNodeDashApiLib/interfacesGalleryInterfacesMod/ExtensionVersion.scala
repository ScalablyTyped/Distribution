package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionVersion extends js.Object {
  var assetUri: java.lang.String
  var badges: js.Array[ExtensionBadge]
  var fallbackAssetUri: java.lang.String
  var files: js.Array[ExtensionFile]
  var flags: ExtensionVersionFlags
  var lastUpdated: stdLib.Date
  var properties: js.Array[vsoDashNodeDashApiLib.Anon_KeyValueString]
  var validationResultMessage: java.lang.String
  var version: java.lang.String
  var versionDescription: java.lang.String
}

object ExtensionVersion {
  @scala.inline
  def apply(
    assetUri: java.lang.String,
    badges: js.Array[ExtensionBadge],
    fallbackAssetUri: java.lang.String,
    files: js.Array[ExtensionFile],
    flags: ExtensionVersionFlags,
    lastUpdated: stdLib.Date,
    properties: js.Array[vsoDashNodeDashApiLib.Anon_KeyValueString],
    validationResultMessage: java.lang.String,
    version: java.lang.String,
    versionDescription: java.lang.String
  ): ExtensionVersion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("assetUri")(assetUri)
    __obj.updateDynamic("badges")(badges)
    __obj.updateDynamic("fallbackAssetUri")(fallbackAssetUri)
    __obj.updateDynamic("files")(files)
    __obj.updateDynamic("flags")(flags)
    __obj.updateDynamic("lastUpdated")(lastUpdated)
    __obj.updateDynamic("properties")(properties)
    __obj.updateDynamic("validationResultMessage")(validationResultMessage)
    __obj.updateDynamic("version")(version)
    __obj.updateDynamic("versionDescription")(versionDescription)
    __obj.asInstanceOf[ExtensionVersion]
  }
}

