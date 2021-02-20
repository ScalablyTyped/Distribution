package typings.winrt.Windows.UI.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EdgeGestureKind extends StObject
@JSGlobal("Windows.UI.Input.EdgeGestureKind")
@js.native
object EdgeGestureKind extends StObject {
  
  @js.native
  sealed trait keyboard extends EdgeGestureKind
  
  @js.native
  sealed trait mouse extends EdgeGestureKind
  
  @js.native
  sealed trait touch extends EdgeGestureKind
}
