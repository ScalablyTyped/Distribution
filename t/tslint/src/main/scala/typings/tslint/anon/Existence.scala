package typings.tslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Existence extends js.Object {
  var content: Items
  var existence: Items
}

object Existence {
  @scala.inline
  def apply(content: Items, existence: Items): Existence = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], existence = existence.asInstanceOf[js.Any])
    __obj.asInstanceOf[Existence]
  }
}

