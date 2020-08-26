package typings.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionPolicy extends js.Object {
  /**
    * Permissions on 'Install' operation
    */
  var install: ExtensionPolicyFlags = js.native
  /**
    * Permission on 'Request' operation
    */
  var request: ExtensionPolicyFlags = js.native
}

object ExtensionPolicy {
  @scala.inline
  def apply(install: ExtensionPolicyFlags, request: ExtensionPolicyFlags): ExtensionPolicy = {
    val __obj = js.Dynamic.literal(install = install.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionPolicy]
  }
  @scala.inline
  implicit class ExtensionPolicyOps[Self <: ExtensionPolicy] (val x: Self) extends AnyVal {
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
    def setInstall(value: ExtensionPolicyFlags): Self = this.set("install", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ExtensionPolicyFlags): Self = this.set("request", value.asInstanceOf[js.Any])
  }
  
}

