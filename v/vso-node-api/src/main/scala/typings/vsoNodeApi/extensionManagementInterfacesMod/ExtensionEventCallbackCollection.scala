package typings.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionEventCallbackCollection extends js.Object {
  /**
    * Optional.  Defines an endpoint that gets called via a POST reqeust to notify that an extension disable has occurred.
    */
  var postDisable: ExtensionEventCallback
  /**
    * Optional.  Defines an endpoint that gets called via a POST reqeust to notify that an extension enable has occurred.
    */
  var postEnable: ExtensionEventCallback
  /**
    * Optional.  Defines an endpoint that gets called via a POST reqeust to notify that an extension install has completed.
    */
  var postInstall: ExtensionEventCallback
  /**
    * Optional.  Defines an endpoint that gets called via a POST reqeust to notify that an extension uninstall has occurred.
    */
  var postUninstall: ExtensionEventCallback
  /**
    * Optional.  Defines an endpoint that gets called via a POST reqeust to notify that an extension update has occurred.
    */
  var postUpdate: ExtensionEventCallback
  /**
    * Optional.  Defines an endpoint that gets called via a POST reqeust to notify that an extension install is about to occur.  Response indicates whether to proceed or abort.
    */
  var preInstall: ExtensionEventCallback
  /**
    * For multi-version extensions, defines an endpoint that gets called via an OPTIONS request to determine the particular version of the extension to be used
    */
  var versionCheck: ExtensionEventCallback
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
}

