package typings.webgme.anon

import typings.webgme.GmeCommon.DefIntegerObject
import typings.webgme.GmeCommon.DefStringObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Level extends js.Object {
  var level: DefIntegerObject
  var name: DefStringObject
}

object Level {
  @scala.inline
  def apply(level: DefIntegerObject, name: DefStringObject): Level = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Level]
  }
}

