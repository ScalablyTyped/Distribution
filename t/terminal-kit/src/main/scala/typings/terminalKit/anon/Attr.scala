package typings.terminalKit.anon

import typings.terminalKit.screenBufferMod.Attributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attr extends js.Object {
  var attr: Attributes | Double
  var char: js.UndefOr[String] = js.undefined
}

object Attr {
  @scala.inline
  def apply(attr: Attributes | Double, char: String = null): Attr = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any])
    if (char != null) __obj.updateDynamic("char")(char.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attr]
  }
}

