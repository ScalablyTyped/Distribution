package typings.winrtUwp.global.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manages a delayed set version operation. */
@JSGlobal("Windows.Storage.SetVersionDeferral")
@js.native
abstract class SetVersionDeferral ()
  extends StObject
     with typings.winrtUwp.Windows.Storage.SetVersionDeferral {
  
  /** Notifies the system that the app has set the version of the application data in its app data store. */
  /* CompleteClass */
  override def complete(): Unit = js.native
}
