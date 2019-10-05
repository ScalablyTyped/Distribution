package typings.winrt.Windows.ApplicationModel.Contacts

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContact extends js.Object {
  var fields: IVector[IContactField]
  var name: String
  var thumbnail: IRandomAccessStreamReference
}

object IContact {
  @scala.inline
  def apply(fields: IVector[IContactField], name: String, thumbnail: IRandomAccessStreamReference): IContact = {
    val __obj = js.Dynamic.literal(fields = fields, name = name, thumbnail = thumbnail)
  
    __obj.asInstanceOf[IContact]
  }
}

