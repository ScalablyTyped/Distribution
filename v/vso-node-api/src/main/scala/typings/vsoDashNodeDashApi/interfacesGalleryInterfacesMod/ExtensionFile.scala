package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionFile extends js.Object {
  var assetType: String
  var language: String
  var source: String
}

object ExtensionFile {
  @scala.inline
  def apply(assetType: String, language: String, source: String): ExtensionFile = {
    val __obj = js.Dynamic.literal(assetType = assetType, language = language, source = source)
  
    __obj.asInstanceOf[ExtensionFile]
  }
}

