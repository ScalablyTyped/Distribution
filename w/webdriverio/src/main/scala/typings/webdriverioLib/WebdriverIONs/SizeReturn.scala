package typings
package webdriverioLib.WebdriverIONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeReturn extends js.Object {
  var height: scala.Double
  var width: scala.Double
}

object SizeReturn {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double): SizeReturn = {
    val __obj = js.Dynamic.literal(height = height, width = width)
  
    __obj.asInstanceOf[SizeReturn]
  }
}

