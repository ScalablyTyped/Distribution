package typings
package wepyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: stdLib.Uint8ClampedArray
  var height: scala.Double
  var width: scala.Double
}

object Anon_Data {
  @scala.inline
  def apply(data: stdLib.Uint8ClampedArray, height: scala.Double, width: scala.Double): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data, height = height, width = width)
  
    __obj.asInstanceOf[Anon_Data]
  }
}

