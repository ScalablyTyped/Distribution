package typings.winrt.WindowsNs.ApplicationModelNs.ContactsNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference
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

