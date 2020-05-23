package typings.ts3NodejsLibrary.commandMod.Command

import typings.ts3NodejsLibrary.anon.Instantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserArgument extends js.Object {
  var cmd: Instantiable
  var raw: String
}

object ParserArgument {
  @scala.inline
  def apply(cmd: Instantiable, raw: String): ParserArgument = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParserArgument]
  }
}

