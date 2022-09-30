package typings.testcafeHammerhead.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("testcafe-hammerhead", "StateSnapshot")
@js.native
open class StateSnapshot () extends StObject {
  
  /** The cookie part of snapshot **/
  var cookies: String = js.native
  
  /** The storages part of snapshot **/
  var storages: StoragesSnapshot = js.native
}
/* static members */
object StateSnapshot {
  
  @JSImport("testcafe-hammerhead", "StateSnapshot")
  @js.native
  val ^ : js.Any = js.native
  
  /** Creates a empty page state snapshot **/
  inline def empty(): StateSnapshot = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[StateSnapshot]
}
