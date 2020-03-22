package typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod

import typings.vscodeLanguageserverProtocol.protocolMod.StaticRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallHierarchyServerCapabilities extends js.Object {
  /**
    * The server provides Call Hierarchy support.
    */
  var callHierarchyProvider: js.UndefOr[
    Boolean | CallHierarchyOptions | (CallHierarchyRegistrationOptions with StaticRegistrationOptions)
  ] = js.undefined
}

object CallHierarchyServerCapabilities {
  @scala.inline
  def apply(
    callHierarchyProvider: Boolean | CallHierarchyOptions | (CallHierarchyRegistrationOptions with StaticRegistrationOptions) = null
  ): CallHierarchyServerCapabilities = {
    val __obj = js.Dynamic.literal()
    if (callHierarchyProvider != null) __obj.updateDynamic("callHierarchyProvider")(callHierarchyProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallHierarchyServerCapabilities]
  }
}

