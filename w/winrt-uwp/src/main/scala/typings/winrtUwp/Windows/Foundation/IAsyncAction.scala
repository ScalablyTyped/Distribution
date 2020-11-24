package typings.winrtUwp.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an asynchronous action. This is the return type for many Windows Runtime asynchronous methods that don't have a result object, and don't report ongoing progress. */
@js.native
trait IAsyncAction extends IAsyncInfo {
  
  /** Gets or sets the method that handles the action completed notification. */
  def completed(asyncInfo: IAsyncAction, asyncStatus: AsyncStatus): Unit = js.native
  /** Gets or sets the method that handles the action completed notification. */
  @JSName("completed")
  var completed_Original: AsyncActionCompletedHandler = js.native
  
  /** Returns the results of the action. */
  def getResults(): Unit = js.native
}
