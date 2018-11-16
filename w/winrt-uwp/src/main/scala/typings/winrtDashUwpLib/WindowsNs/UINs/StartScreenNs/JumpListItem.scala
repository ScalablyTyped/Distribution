package typings
package winrtDashUwpLib.WindowsNs.UINs.StartScreenNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for creating and defining jump list items for an app's jump list. */
@JSGlobal("Windows.UI.StartScreen.JumpListItem")
@js.native
abstract class JumpListItem () extends js.Object {
  /** Gets the command line arguments for the jump list item. */
  var arguments: java.lang.String = js.native
  /** Gets or sets the jump list item task description. */
  var description: java.lang.String = js.native
  /** Gets or sets the jump list item display name. The display name can also be specified as a parameter using the CreateWithArguments method when the jump list item is created. */
  var displayName: java.lang.String = js.native
  /** Gets or sets the jump list item custom group name. If no name is specified, the item will be added to the Tasks group by default. */
  var groupName: java.lang.String = js.native
  /** Gets the JumpListItemKind of a jump list item. */
  var kind: JumpListItemKind = js.native
  /** Gets or sets the jump list item's logo. */
  var logo: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /** Gets a boolean indicating whether the jump list item was removed from the app's jump list by the user. */
  var removedByUser: scala.Boolean = js.native
}

/** Provides functionality for creating and defining jump list items for an app's jump list. */
@JSGlobal("Windows.UI.StartScreen.JumpListItem")
@js.native
object JumpListItem extends js.Object {
  /**
                   * Creates a jump list item that is an inert separator for a custom group within the app's jump list.
                   * @return A jump list item that can be added to an app's jump list through the items property.
                   */
  def createSeparator(): winrtDashUwpLib.WindowsNs.UINs.StartScreenNs.JumpListItem = js.native
  /**
                   * Creates a new jump list item for an app's jump list.
                   * @param arguments String that specifies any command line arguments that should be passed onto the app when the jump list item is selected by a user.
                   * @param displayName String that specifies a display name for the jump list item. If localization is desired, this string must be a ms-resource: scheme specified URI.
                   * @return A jump list item with the specified parameters that can be added to an app's jump list through the items property.
                   */
  def createWithArguments(args: java.lang.String, displayName: java.lang.String): winrtDashUwpLib.WindowsNs.UINs.StartScreenNs.JumpListItem = js.native
}

