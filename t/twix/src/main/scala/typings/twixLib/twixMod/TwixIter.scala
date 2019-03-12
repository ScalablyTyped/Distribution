package typings
package twixLib.twixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwixIter extends js.Object {
  def hasNext(): scala.Boolean
  def next(): Twix
}

object TwixIter {
  @scala.inline
  def apply(hasNext: () => scala.Boolean, next: () => Twix): TwixIter = {
    val __obj = js.Dynamic.literal(hasNext = js.Any.fromFunction0(hasNext), next = js.Any.fromFunction0(next))
  
    __obj.asInstanceOf[TwixIter]
  }
}

