package typings.winrt.Windows.UI.Core.AnimationMetrics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PropertyAnimationType extends js.Object
@JSGlobal("Windows.UI.Core.AnimationMetrics.PropertyAnimationType")
@js.native
object PropertyAnimationType extends js.Object {
  
  @js.native
  sealed trait opacity extends PropertyAnimationType
  
  @js.native
  sealed trait scale extends PropertyAnimationType
  
  @js.native
  sealed trait translation extends PropertyAnimationType
}
