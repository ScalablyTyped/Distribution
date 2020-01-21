package typings.superstruct.superstructMod

import typings.std.Record
import typings.superstruct.AnonFailures
import typings.superstruct.typesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuperstructSettings extends js.Object {
  var error: AnonFailures
  var types: Record[String, Validator]
}

object SuperstructSettings {
  @scala.inline
  def apply(error: AnonFailures, types: Record[String, Validator]): SuperstructSettings = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SuperstructSettings]
  }
}

