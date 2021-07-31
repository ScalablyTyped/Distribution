package typings.winrtUwp.global.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.IAsyncAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Performs license management operations. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyLicenseManagement")
@js.native
abstract class PlayReadyLicenseManagement ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadyLicenseManagement
object PlayReadyLicenseManagement {
  
  @JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyLicenseManagement")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Deletes licenses that match the specified content header.
    * @param contentHeader Content header with a key identifier with which to match licenses.
    * @return The asynchronous operation performing the deletion.
    */
  /* static member */
  @scala.inline
  def deleteLicenses(contentHeader: typings.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadyContentHeader): IAsyncAction = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteLicenses")(contentHeader.asInstanceOf[js.Any]).asInstanceOf[IAsyncAction]
}
