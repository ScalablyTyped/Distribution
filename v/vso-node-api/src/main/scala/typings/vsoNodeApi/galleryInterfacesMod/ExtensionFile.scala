package typings.vsoNodeApi.galleryInterfacesMod

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
    val __obj = js.Dynamic.literal(assetType = assetType.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionFile]
  }
}

