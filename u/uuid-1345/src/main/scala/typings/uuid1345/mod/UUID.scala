package typings.uuid1345.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UUID extends js.Object {
  var variant: String = js.native
  var version: String = js.native
  def toBuffer(): Buffer = js.native
}

object UUID {
  @scala.inline
  def apply(toBuffer: () => Buffer, variant: String, version: String): UUID = {
    val __obj = js.Dynamic.literal(toBuffer = js.Any.fromFunction0(toBuffer), variant = variant.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[UUID]
  }
  @scala.inline
  implicit class UUIDOps[Self <: UUID] (val x: Self) extends AnyVal {
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
    def setToBuffer(value: () => Buffer): Self = this.set("toBuffer", js.Any.fromFunction0(value))
    @scala.inline
    def setVariant(value: String): Self = this.set("variant", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

