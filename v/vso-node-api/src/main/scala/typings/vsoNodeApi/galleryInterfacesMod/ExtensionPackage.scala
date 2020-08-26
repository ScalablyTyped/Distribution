package typings.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionPackage extends js.Object {
  /**
    * Base 64 encoded extension package
    */
  var extensionManifest: String = js.native
}

object ExtensionPackage {
  @scala.inline
  def apply(extensionManifest: String): ExtensionPackage = {
    val __obj = js.Dynamic.literal(extensionManifest = extensionManifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionPackage]
  }
  @scala.inline
  implicit class ExtensionPackageOps[Self <: ExtensionPackage] (val x: Self) extends AnyVal {
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
    def setExtensionManifest(value: String): Self = this.set("extensionManifest", value.asInstanceOf[js.Any])
  }
  
}

