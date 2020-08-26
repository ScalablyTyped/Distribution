package typings.winrtUwp.Windows.ApplicationModel.Contacts

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents data about how to display a mini contact card. */
@js.native
trait ContactCardOptions extends js.Object {
  /** Gets or sets a value that specifies the type of header to display on the contact card. */
  var headerKind: ContactCardHeaderKind = js.native
  /** Gets or sets a value that indicates which tab to display first on a mini contact card. */
  var initialTabKind: ContactCardTabKind = js.native
  /** Gets a list to which you can add ContactList.Id values to search for on the server. */
  var serverSearchContactListIds: IVector[String] = js.native
}

object ContactCardOptions {
  @scala.inline
  def apply(
    headerKind: ContactCardHeaderKind,
    initialTabKind: ContactCardTabKind,
    serverSearchContactListIds: IVector[String]
  ): ContactCardOptions = {
    val __obj = js.Dynamic.literal(headerKind = headerKind.asInstanceOf[js.Any], initialTabKind = initialTabKind.asInstanceOf[js.Any], serverSearchContactListIds = serverSearchContactListIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactCardOptions]
  }
  @scala.inline
  implicit class ContactCardOptionsOps[Self <: ContactCardOptions] (val x: Self) extends AnyVal {
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
    def setHeaderKind(value: ContactCardHeaderKind): Self = this.set("headerKind", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialTabKind(value: ContactCardTabKind): Self = this.set("initialTabKind", value.asInstanceOf[js.Any])
    @scala.inline
    def setServerSearchContactListIds(value: IVector[String]): Self = this.set("serverSearchContactListIds", value.asInstanceOf[js.Any])
  }
  
}

