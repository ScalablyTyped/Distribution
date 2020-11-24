package typings.xstream.tweenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Easings extends js.Object {
  
  def easeIn(x: Double, from: Double, to: Double): Double = js.native
  
  def easeInOut(x: Double, from: Double, to: Double): Double = js.native
  @JSName("easeInOut")
  var easeInOut_Original: Ease = js.native
  
  @JSName("easeIn")
  var easeIn_Original: Ease = js.native
  
  def easeOut(x: Double, from: Double, to: Double): Double = js.native
  @JSName("easeOut")
  var easeOut_Original: Ease = js.native
}
