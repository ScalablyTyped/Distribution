package typings.atWordpressNotices.atWordpressNoticesMod

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
}

object Options {
  @scala.inline
  def apply(actions: js.Array[Action], context: String, id: String, isDismissible: Boolean, speak: Boolean): Options = {
    val __obj = js.Dynamic.literal(actions = actions, context = context, id = id, isDismissible = isDismissible, speak = speak)
  
    __obj.asInstanceOf[Options]
  }
}

