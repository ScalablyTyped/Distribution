package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContext extends js.Object {
  var context: Double
  var fullyQualified: Double
  var webApplication: Double
}

object AnonContext {
  @scala.inline
  def apply(context: Double, fullyQualified: Double, webApplication: Double): AnonContext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], fullyQualified = fullyQualified.asInstanceOf[js.Any], webApplication = webApplication.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContext]
  }
}

