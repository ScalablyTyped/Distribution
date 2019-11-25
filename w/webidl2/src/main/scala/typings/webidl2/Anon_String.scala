package typings.webidl2

import typings.webidl2.webidl2Strings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_String extends js.Object {
  var `type`: string
  var value: String
}

object Anon_String {
  @scala.inline
  def apply(`type`: string, value: String): Anon_String = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_String]
  }
}

