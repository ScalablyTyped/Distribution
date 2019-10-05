package typings.winrtDashUwp.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a way to represent the current object as a string. */
trait IStringable extends js.Object

object IStringable {
  @scala.inline
  def apply(toString: () => String): IStringable = {
    val __obj = js.Dynamic.literal(toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[IStringable]
  }
}

