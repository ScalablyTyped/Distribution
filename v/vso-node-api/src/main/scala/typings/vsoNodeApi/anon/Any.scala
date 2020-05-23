package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Any extends js.Object {
  var any: scala.Double
  var file: scala.Double
  var folder: scala.Double
}

object Any {
  @scala.inline
  def apply(any: scala.Double, file: scala.Double, folder: scala.Double): Any = {
    val __obj = js.Dynamic.literal(any = any.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], folder = folder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Any]
  }
}

