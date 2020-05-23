package typings.winrtUwp.Windows.UI.StartScreen

import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for creating and defining jump list items for an app's jump list. */
trait JumpListItem extends js.Object {
  /** Gets the command line arguments for the jump list item. */
  var arguments: String
  /** Gets or sets the jump list item task description. */
  var description: String
  /** Gets or sets the jump list item display name. The display name can also be specified as a parameter using the CreateWithArguments method when the jump list item is created. */
  var displayName: String
  /** Gets or sets the jump list item custom group name. If no name is specified, the item will be added to the Tasks group by default. */
  var groupName: String
  /** Gets the JumpListItemKind of a jump list item. */
  var kind: JumpListItemKind
  /** Gets or sets the jump list item's logo. */
  var logo: Uri
  /** Gets a boolean indicating whether the jump list item was removed from the app's jump list by the user. */
  var removedByUser: Boolean
}

object JumpListItem {
  @scala.inline
  def apply(
    arguments: String,
    description: String,
    displayName: String,
    groupName: String,
    kind: JumpListItemKind,
    logo: Uri,
    removedByUser: Boolean
  ): JumpListItem = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], groupName = groupName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], logo = logo.asInstanceOf[js.Any], removedByUser = removedByUser.asInstanceOf[js.Any])
    __obj.asInstanceOf[JumpListItem]
  }
}

