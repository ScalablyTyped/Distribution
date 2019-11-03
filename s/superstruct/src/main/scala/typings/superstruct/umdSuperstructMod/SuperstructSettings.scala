package typings.superstruct.umdSuperstructMod

import typings.std.Record
import typings.superstruct.Anon_FailuresArray
import typings.superstruct.umdTypesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuperstructSettings extends js.Object {
  var error: Anon_FailuresArray
  var types: Record[String, Validator]
}

object SuperstructSettings {
  @scala.inline
  def apply(error: Anon_FailuresArray, types: Record[String, Validator]): SuperstructSettings = {
    val __obj = js.Dynamic.literal(error = error, types = types)
  
    __obj.asInstanceOf[SuperstructSettings]
  }
}

