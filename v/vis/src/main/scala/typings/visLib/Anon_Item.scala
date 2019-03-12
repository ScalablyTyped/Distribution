package typings
package visLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Item extends js.Object {
  def template(item: js.Any): js.Any
}

object Anon_Item {
  @scala.inline
  def apply(template: js.Any => js.Any): Anon_Item = {
    val __obj = js.Dynamic.literal(template = js.Any.fromFunction1(template))
  
    __obj.asInstanceOf[Anon_Item]
  }
}

