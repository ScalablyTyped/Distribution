package typings.atWordpressNotices.atWordpressNoticesMod

import typings.atWordpressNotices.atWordpressNoticesStrings.default
import typings.atWordpressNotices.atWordpressNoticesStrings.snackbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * User actions to be presented with notice.
    */
  var actions: js.Array[Action]
  /**
    * Context under which to group notice.
    * @defaultValue `'global'`
    */
  var context: String
  /**
    * Identifier for notice. Automatically assigned if not specified.
    */
  var id: String
  /**
    * Whether the notice can be dismissed by user.
    * @defaultValue `true`
    */
  var isDismissible: Boolean
  /**
    * Whether the notice content should be announced to screen readers.
    * @defaultValue `true`
    */
  var speak: Boolean
  /**
    * The type of notice.
    * @defaultValue `'default'`
    */
  var `type`: default | snackbar
}

object Options {
  @scala.inline
  def apply(
    actions: js.Array[Action],
    context: String,
    id: String,
    isDismissible: Boolean,
    speak: Boolean,
    `type`: default | snackbar
  ): Options = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDismissible = isDismissible.asInstanceOf[js.Any], speak = speak.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

