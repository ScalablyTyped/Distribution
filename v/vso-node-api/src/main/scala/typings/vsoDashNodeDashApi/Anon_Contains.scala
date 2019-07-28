package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Contains extends js.Object {
  var contains: Double
  var exact: Double
  var startsWith: Double
}

object Anon_Contains {
  @scala.inline
  def apply(contains: Double, exact: Double, startsWith: Double): Anon_Contains = {
    val __obj = js.Dynamic.literal(contains = contains, exact = exact, startsWith = startsWith)
  
    __obj.asInstanceOf[Anon_Contains]
  }
}

