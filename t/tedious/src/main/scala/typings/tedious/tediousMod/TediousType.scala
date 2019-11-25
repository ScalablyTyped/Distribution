package typings.tedious.tediousMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TediousType extends js.Object {
  var name: String
  var `type`: String
}

object TediousType {
  @scala.inline
  def apply(name: String, `type`: String): TediousType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TediousType]
  }
}

