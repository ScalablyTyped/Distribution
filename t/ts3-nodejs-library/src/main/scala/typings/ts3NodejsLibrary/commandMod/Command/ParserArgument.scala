package typings.ts3NodejsLibrary.commandMod.Command

import typings.ts3NodejsLibrary.AnonInstantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserArgument extends js.Object {
  var cmd: AnonInstantiable
  var raw: String
}

object ParserArgument {
  @scala.inline
  def apply(cmd: AnonInstantiable, raw: String): ParserArgument = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParserArgument]
  }
}

