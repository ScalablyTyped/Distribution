package typings.winrtUwp.global.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages a delayed set version operation. */
@JSGlobal("Windows.Storage.SetVersionDeferral")
@js.native
abstract class SetVersionDeferral ()
  extends typings.winrtUwp.Windows.Storage.SetVersionDeferral {
  /** Notifies the system that the app has set the version of the application data in its app data store. */
  /* CompleteClass */
  override def complete(): Unit = js.native
}

