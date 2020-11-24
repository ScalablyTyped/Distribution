package typings.winrt.Windows.UI.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EdgeGestureKind extends js.Object
@JSGlobal("Windows.UI.Input.EdgeGestureKind")
@js.native
object EdgeGestureKind extends js.Object {
  
  @js.native
  sealed trait keyboard extends EdgeGestureKind
  
  @js.native
  sealed trait mouse extends EdgeGestureKind
  
  @js.native
  sealed trait touch extends EdgeGestureKind
}
