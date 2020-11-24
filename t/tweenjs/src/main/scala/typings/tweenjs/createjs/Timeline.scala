package typings.tweenjs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Timeline extends AbstractTween {
  
  // method
  def addTween(tween: Tween): Tween = js.native
  
  def removeTween(tween: Tween): Boolean = js.native
  
  // properties
  var tweens: js.Array[Tween] = js.native
  
  def updateDuration(): Unit = js.native
}
