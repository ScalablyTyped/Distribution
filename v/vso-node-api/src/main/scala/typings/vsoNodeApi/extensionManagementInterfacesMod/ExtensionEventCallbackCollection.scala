package typings.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionEventCallbackCollection extends js.Object {
  /**
    * Optional.  Defines an endpoint that gets called via a POST reqeust to notify that an extension disable has occurred.
    */
  var postDisable: ExtensionEventCallback = js.native
  /**
    * Optional.  Defines an endpoint that gets called via a POST reqeust to notify that an extension enable has occurred.
    */
  var postEnable: ExtensionEventCallback = js.native
  /**
    * Optional.  Defines an endpoint that gets called via a POST reqeust to notify that an extension install has completed.
    */
  var postInstall: ExtensionEventCallback = js.native
  /**
    * Optional.  Defines an endpoint that gets called via a POST reqeust to notify that an extension uninstall has occurred.
    */
  var postUninstall: ExtensionEventCallback = js.native
  /**
    * Optional.  Defines an endpoint that gets called via a POST reqeust to notify that an extension update has occurred.
    */
  var postUpdate: ExtensionEventCallback = js.native
  /**
    * Optional.  Defines an endpoint that gets called via a POST reqeust to notify that an extension install is about to occur.  Response indicates whether to proceed or abort.
    */
  var preInstall: ExtensionEventCallback = js.native
  /**
    * For multi-version extensions, defines an endpoint that gets called via an OPTIONS request to determine the particular version of the extension to be used
    */
  var versionCheck: ExtensionEventCallback = js.native
}

object ExtensionEventCallbackCollection {
  @scala.inline
  def apply(
    postDisable: ExtensionEventCallback,
    postEnable: ExtensionEventCallback,
    postInstall: ExtensionEventCallback,
    postUninstall: ExtensionEventCallback,
    postUpdate: ExtensionEventCallback,
    preInstall: ExtensionEventCallback,
    versionCheck: ExtensionEventCallback
  ): ExtensionEventCallbackCollection = {
    val __obj = js.Dynamic.literal(postDisable = postDisable.asInstanceOf[js.Any], postEnable = postEnable.asInstanceOf[js.Any], postInstall = postInstall.asInstanceOf[js.Any], postUninstall = postUninstall.asInstanceOf[js.Any], postUpdate = postUpdate.asInstanceOf[js.Any], preInstall = preInstall.asInstanceOf[js.Any], versionCheck = versionCheck.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionEventCallbackCollection]
  }
  @scala.inline
  implicit class ExtensionEventCallbackCollectionOps[Self <: ExtensionEventCallbackCollection] (val x: Self) extends AnyVal {
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
    def setPostDisable(value: ExtensionEventCallback): Self = this.set("postDisable", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostEnable(value: ExtensionEventCallback): Self = this.set("postEnable", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostInstall(value: ExtensionEventCallback): Self = this.set("postInstall", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostUninstall(value: ExtensionEventCallback): Self = this.set("postUninstall", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostUpdate(value: ExtensionEventCallback): Self = this.set("postUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreInstall(value: ExtensionEventCallback): Self = this.set("preInstall", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersionCheck(value: ExtensionEventCallback): Self = this.set("versionCheck", value.asInstanceOf[js.Any])
  }
  
}

