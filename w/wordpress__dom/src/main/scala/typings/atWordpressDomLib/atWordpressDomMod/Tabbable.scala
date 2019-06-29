package typings
package atWordpressDomLib.atWordpressDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tabbable extends Focusable {
  /**
    * Returns `true` if the specified element is tabbable, or `false` otherwise.
    *
    * @param element - Element to test.
    */
  def isTabbableIndex(element: stdLib.Element): scala.Boolean
}

object Tabbable {
  @scala.inline
  def apply(
    find: stdLib.ParentNode => js.Array[stdLib.Element],
    isTabbableIndex: stdLib.Element => scala.Boolean
  ): Tabbable = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find), isTabbableIndex = js.Any.fromFunction1(isTabbableIndex))
  
    __obj.asInstanceOf[Tabbable]
  }
}

