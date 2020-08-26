package typings.winrt.Windows.ApplicationModel.Contacts

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContact extends js.Object {
  var fields: IVector[IContactField] = js.native
  var name: String = js.native
  var thumbnail: IRandomAccessStreamReference = js.native
}

object IContact {
  @scala.inline
  def apply(fields: IVector[IContactField], name: String, thumbnail: IRandomAccessStreamReference): IContact = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContact]
  }
  @scala.inline
  implicit class IContactOps[Self <: IContact] (val x: Self) extends AnyVal {
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
    def setFields(value: IVector[IContactField]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setThumbnail(value: IRandomAccessStreamReference): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
  }
  
}

