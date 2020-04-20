package typings.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionPackage extends js.Object {
  /**
    * Base 64 encoded extension package
    */
  var extensionManifest: String
}

object ExtensionPackage {
  @scala.inline
  def apply(extensionManifest: String): ExtensionPackage = {
    val __obj = js.Dynamic.literal(extensionManifest = extensionManifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionPackage]
  }
}

