package typings.webgme.Gme

import typings.webgme.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodePropertyNames extends js.Object {
  var Attributes: Name = js.native
}

object NodePropertyNames {
  @scala.inline
  def apply(Attributes: Name): NodePropertyNames = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodePropertyNames]
  }
  @scala.inline
  implicit class NodePropertyNamesOps[Self <: NodePropertyNames] (val x: Self) extends AnyVal {
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
    def setAttributes(value: Name): Self = this.set("Attributes", value.asInstanceOf[js.Any])
  }
  
}

