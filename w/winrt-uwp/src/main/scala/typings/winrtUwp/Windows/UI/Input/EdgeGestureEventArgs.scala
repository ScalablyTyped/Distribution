package typings.winrtUwp.Windows.UI.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the type of user input that triggered the edge gesture event. */
trait EdgeGestureEventArgs extends js.Object {
  /** Gets the type of user input that triggered the edge gesture event. */
  var kind: EdgeGestureKind
}

object EdgeGestureEventArgs {
  @scala.inline
  def apply(kind: EdgeGestureKind): EdgeGestureEventArgs = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeGestureEventArgs]
  }
}

