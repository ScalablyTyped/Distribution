package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Abusive extends js.Object {
  var abusive: scala.Double
  var general: scala.Double
  var spam: scala.Double
}

object Abusive {
  @scala.inline
  def apply(abusive: scala.Double, general: scala.Double, spam: scala.Double): Abusive = {
    val __obj = js.Dynamic.literal(abusive = abusive.asInstanceOf[js.Any], general = general.asInstanceOf[js.Any], spam = spam.asInstanceOf[js.Any])
    __obj.asInstanceOf[Abusive]
  }
}

