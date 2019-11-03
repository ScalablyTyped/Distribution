package typings.superstruct.libSuperstructMod

import typings.std.Record
import typings.superstruct.Anon_Failures
import typings.superstruct.libTypesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuperstructSettings extends js.Object {
  var error: Anon_Failures
  var types: Record[String, Validator]
}

object SuperstructSettings {
  @scala.inline
  def apply(error: Anon_Failures, types: Record[String, Validator]): SuperstructSettings = {
    val __obj = js.Dynamic.literal(error = error, types = types)
  
    __obj.asInstanceOf[SuperstructSettings]
  }
}

