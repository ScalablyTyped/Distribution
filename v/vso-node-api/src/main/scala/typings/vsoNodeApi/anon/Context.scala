package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var context: scala.Double
  var fullyQualified: scala.Double
  var webApplication: scala.Double
}

object Context {
  @scala.inline
  def apply(context: scala.Double, fullyQualified: scala.Double, webApplication: scala.Double): Context = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], fullyQualified = fullyQualified.asInstanceOf[js.Any], webApplication = webApplication.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

