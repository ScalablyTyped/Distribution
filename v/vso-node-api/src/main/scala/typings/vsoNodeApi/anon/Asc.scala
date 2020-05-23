package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Asc extends js.Object {
  var asc: scala.Double
  var desc: scala.Double
}

object Asc {
  @scala.inline
  def apply(asc: scala.Double, desc: scala.Double): Asc = {
    val __obj = js.Dynamic.literal(asc = asc.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Asc]
  }
}

