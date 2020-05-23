package typings.winrtUwp.Windows.ApplicationModel.Contacts

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents data about how to display a mini contact card. */
trait ContactCardOptions extends js.Object {
  /** Gets or sets a value that specifies the type of header to display on the contact card. */
  var headerKind: ContactCardHeaderKind
  /** Gets or sets a value that indicates which tab to display first on a mini contact card. */
  var initialTabKind: ContactCardTabKind
  /** Gets a list to which you can add ContactList.Id values to search for on the server. */
  var serverSearchContactListIds: IVector[String]
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
}

