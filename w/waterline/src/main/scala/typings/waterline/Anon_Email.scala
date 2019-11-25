package typings.waterline

import typings.waterline.waterlineStrings.email
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Email extends js.Object {
  var `type`: email
}

object Anon_Email {
  @scala.inline
  def apply(`type`: email): Anon_Email = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Email]
  }
}

