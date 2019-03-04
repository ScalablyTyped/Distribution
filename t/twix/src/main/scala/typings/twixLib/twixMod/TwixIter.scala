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
  def apply(hasNext: js.Function0[scala.Boolean], next: js.Function0[Twix]): TwixIter = {
    val __obj = js.Dynamic.literal(hasNext = hasNext, next = next)
  
    __obj.asInstanceOf[TwixIter]
  }
}

