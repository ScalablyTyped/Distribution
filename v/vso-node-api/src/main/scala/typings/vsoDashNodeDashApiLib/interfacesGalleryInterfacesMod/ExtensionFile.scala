package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionFile extends js.Object {
  var assetType: java.lang.String
  var language: java.lang.String
  var source: java.lang.String
}

object ExtensionFile {
  @scala.inline
  def apply(assetType: java.lang.String, language: java.lang.String, source: java.lang.String): ExtensionFile = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("assetType")(assetType)
    __obj.updateDynamic("language")(language)
    __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[ExtensionFile]
  }
}

