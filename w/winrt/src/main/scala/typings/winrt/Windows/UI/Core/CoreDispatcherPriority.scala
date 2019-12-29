package typings.winrt.Windows.UI.Core

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CoreDispatcherPriority extends js.Object

@JSGlobal("Windows.UI.Core.CoreDispatcherPriority")
@js.native
object CoreDispatcherPriority extends js.Object {
  @js.native
  sealed trait high extends CoreDispatcherPriority
  
  @js.native
  sealed trait low extends CoreDispatcherPriority
  
  @js.native
  sealed trait normal extends CoreDispatcherPriority
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CoreDispatcherPriority with Double] = js.native
  /* 2 */ @js.native
  object high extends TopLevel[high with Double]
  
  /* 0 */ @js.native
  object low extends TopLevel[low with Double]
  
  /* 1 */ @js.native
  object normal extends TopLevel[normal with Double]
  
}

