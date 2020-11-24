package typings.winrtUwp.global.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Programmatically initiates an exchange of content with other apps. */
@JSGlobal("Windows.ApplicationModel.DataTransfer.DataTransferManager")
@js.native
abstract class DataTransferManager ()
  extends typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataTransferManager
/* static members */
@JSGlobal("Windows.ApplicationModel.DataTransfer.DataTransferManager")
@js.native
object DataTransferManager extends js.Object {
  
  /**
    * Returns the DataTransferManager object associated with the current window.
    * @return The DataTransferManager object associated with the current window.
    */
  def getForCurrentView(): typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataTransferManager = js.native
  
  /** Programmatically initiates the user interface for sharing content with another app. */
  def showShareUI(): Unit = js.native
}
