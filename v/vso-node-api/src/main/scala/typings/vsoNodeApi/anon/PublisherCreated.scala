package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublisherCreated extends js.Object {
  var none: scala.Double
  var publisherCreated: scala.Double
  var userEditable: scala.Double
}

object PublisherCreated {
  @scala.inline
  def apply(none: scala.Double, publisherCreated: scala.Double, userEditable: scala.Double): PublisherCreated = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], publisherCreated = publisherCreated.asInstanceOf[js.Any], userEditable = userEditable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublisherCreated]
  }
}

