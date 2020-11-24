package typings.tweenjsTweenJs.mod

import typings.tweenjsTweenJs.anon.Bernstein
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  */
@JSImport("@tweenjs/tween.js", "Interpolation")
@js.native
object Interpolation extends js.Object {
  
  def Bezier(v: js.Array[Double], k: Double): Double = js.native
  
  def CatmullRom(v: js.Array[Double], k: Double): Double = js.native
  
  def Linear(v: js.Array[Double], k: Double): Double = js.native
  
  var Utils: Bernstein = js.native
}
