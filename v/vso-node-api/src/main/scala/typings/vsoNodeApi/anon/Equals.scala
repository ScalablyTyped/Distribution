package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Equals extends js.Object {
  @JSName("equals")
  var equals_FEquals: scala.Double
  var notEquals: scala.Double
}

object Equals {
  @scala.inline
  def apply(equals: scala.Double, notEquals: scala.Double): Equals = {
    val __obj = js.Dynamic.literal(equals = equals.asInstanceOf[js.Any], notEquals = notEquals.asInstanceOf[js.Any])
    __obj.asInstanceOf[Equals]
  }
}

