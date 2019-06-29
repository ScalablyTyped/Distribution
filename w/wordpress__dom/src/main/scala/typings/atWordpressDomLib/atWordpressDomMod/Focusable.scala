package typings
package atWordpressDomLib.atWordpressDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Focusable extends js.Object {
  def find(context: stdLib.ParentNode): js.Array[stdLib.Element]
}

object Focusable {
  @scala.inline
  def apply(find: stdLib.ParentNode => js.Array[stdLib.Element]): Focusable = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find))
  
    __obj.asInstanceOf[Focusable]
  }
}

