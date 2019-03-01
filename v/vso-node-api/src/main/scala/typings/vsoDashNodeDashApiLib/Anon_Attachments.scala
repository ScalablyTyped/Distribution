package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attachments extends js.Object {
  var attachments: scala.Double
  var custom: scala.Double
  var history: scala.Double
  var links: scala.Double
}

object Anon_Attachments {
  @scala.inline
  def apply(attachments: scala.Double, custom: scala.Double, history: scala.Double, links: scala.Double): Anon_Attachments = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attachments")(attachments)
    __obj.updateDynamic("custom")(custom)
    __obj.updateDynamic("history")(history)
    __obj.updateDynamic("links")(links)
    __obj.asInstanceOf[Anon_Attachments]
  }
}

