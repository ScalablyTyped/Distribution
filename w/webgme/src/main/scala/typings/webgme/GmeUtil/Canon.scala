package typings.webgme.GmeUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Canon extends js.Object {
  def parse(thing: js.Any): String
  def stringify(thing: js.Any): String
}

object Canon {
  @scala.inline
  def apply(parse: js.Any => String, stringify: js.Any => String): Canon = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), stringify = js.Any.fromFunction1(stringify))
    __obj.asInstanceOf[Canon]
  }
}

