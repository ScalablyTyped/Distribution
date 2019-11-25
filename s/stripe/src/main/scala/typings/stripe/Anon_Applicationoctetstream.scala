package typings.stripe

import typings.node.Buffer
import typings.stripe.stripeStrings.`application/octet-stream`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Applicationoctetstream extends js.Object {
  var data: String | Buffer
  var name: String
  var `type`: String | `application/octet-stream`
}

object Anon_Applicationoctetstream {
  @scala.inline
  def apply(data: String | Buffer, name: String, `type`: String | `application/octet-stream`): Anon_Applicationoctetstream = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Applicationoctetstream]
  }
}

