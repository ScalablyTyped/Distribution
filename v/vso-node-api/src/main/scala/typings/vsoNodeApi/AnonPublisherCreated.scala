package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPublisherCreated extends js.Object {
  var none: Double
  var publisherCreated: Double
  var userEditable: Double
}

object AnonPublisherCreated {
  @scala.inline
  def apply(none: Double, publisherCreated: Double, userEditable: Double): AnonPublisherCreated = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], publisherCreated = publisherCreated.asInstanceOf[js.Any], userEditable = userEditable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPublisherCreated]
  }
}

