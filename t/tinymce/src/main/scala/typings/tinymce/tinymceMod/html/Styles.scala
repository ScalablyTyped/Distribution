package typings.tinymce.tinymceMod.html

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Styles extends js.Object {
  def parse(css: String): js.Object
  def serialize(styles: js.Object, elementName: String): String
  def toHex(color: String): String
}

object Styles {
  @scala.inline
  def apply(parse: String => js.Object, serialize: (js.Object, String) => String, toHex: String => String): Styles = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), serialize = js.Any.fromFunction2(serialize), toHex = js.Any.fromFunction1(toHex))
  
    __obj.asInstanceOf[Styles]
  }
}

