package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cancelled extends js.Object {
  var cancelled: Double
  var error: Double
  var published: Double
  var unpublished: Double
}

object Anon_Cancelled {
  @scala.inline
  def apply(cancelled: Double, error: Double, published: Double, unpublished: Double): Anon_Cancelled = {
    val __obj = js.Dynamic.literal(cancelled = cancelled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], published = published.asInstanceOf[js.Any], unpublished = unpublished.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Cancelled]
  }
}

