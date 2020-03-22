package typings.stripe

import typings.node.Buffer
import typings.stripe.stripeStrings.`applicationSlashoctet-stream`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: String | Buffer
  var name: String
  var `type`: String | `applicationSlashoctet-stream`
}

object AnonData {
  @scala.inline
  def apply(data: String | Buffer, name: String, `type`: String | `applicationSlashoctet-stream`): AnonData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData]
  }
}

