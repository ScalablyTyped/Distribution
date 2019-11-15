package typings.wegameDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_X extends js.Object {
  /**
    * x 轴的角速度
    */
  var x: Double
  /**
    * y 轴的角速度
    */
  var y: Double
  /**
    * z 轴的角速度
    */
  var z: Double
}

object Anon_X {
  @scala.inline
  def apply(x: Double, y: Double, z: Double): Anon_X = {
    val __obj = js.Dynamic.literal(x = x, y = y, z = z)
  
    __obj.asInstanceOf[Anon_X]
  }
}

