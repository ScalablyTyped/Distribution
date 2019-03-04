package typings
package webidl2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_String extends js.Object {
  var `type`: webidl2Lib.webidl2LibStrings.string
  var value: java.lang.String
}

object Anon_String {
  @scala.inline
  def apply(`type`: webidl2Lib.webidl2LibStrings.string, value: java.lang.String): Anon_String = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_String]
  }
}

