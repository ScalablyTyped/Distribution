package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Applicationoctetstream extends js.Object {
  var data: java.lang.String | nodeLib.Buffer
  var name: java.lang.String
  var `type`: java.lang.String | stripeLib.stripeLibStrings.`application/octet-stream`
}

object Anon_Applicationoctetstream {
  @scala.inline
  def apply(
    data: java.lang.String | nodeLib.Buffer,
    name: java.lang.String,
    `type`: java.lang.String | stripeLib.stripeLibStrings.`application/octet-stream`
  ): Anon_Applicationoctetstream = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_Applicationoctetstream]
  }
}

