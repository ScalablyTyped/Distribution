package typings
package winrtLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContact extends js.Object {
  var fields: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[IContactField]
  var name: java.lang.String
  var thumbnail: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference
}

object IContact {
  @scala.inline
  def apply(
    fields: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[IContactField],
    name: java.lang.String,
    thumbnail: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference
  ): IContact = {
    val __obj = js.Dynamic.literal(fields = fields, name = name, thumbnail = thumbnail)
  
    __obj.asInstanceOf[IContact]
  }
}

