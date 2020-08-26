package typings.stripe.anon

import typings.node.Buffer
import typings.stripe.stripeStrings.`applicationSlashoctet-stream`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data extends js.Object {
  var data: String | Buffer = js.native
  var name: String = js.native
  var `type`: String | `applicationSlashoctet-stream` = js.native
}

object Data {
  @scala.inline
  def apply(data: String | Buffer, name: String, `type`: String | `applicationSlashoctet-stream`): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setData(value: String | Buffer): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String | `applicationSlashoctet-stream`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

