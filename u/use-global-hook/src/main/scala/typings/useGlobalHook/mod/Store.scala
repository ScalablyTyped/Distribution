package typings.useGlobalHook.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Store[S, A] extends js.Object {
  
  var actions: A = js.native
  
  def setState(state: S): Unit = js.native
  def setState(state: S, afterUpdateCallback: js.Function0[Unit]): Unit = js.native
  
  var state: S = js.native
}
