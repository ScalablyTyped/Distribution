package typings.ts3DashNodejsDashLibrary.libTransportCommandMod.Command

import typings.ts3DashNodejsDashLibrary.Anon_Averagespeed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserArgument extends js.Object {
  var cmd: Anon_Averagespeed
  var raw: String
}

object ParserArgument {
  @scala.inline
  def apply(cmd: Anon_Averagespeed, raw: String): ParserArgument = {
    val __obj = js.Dynamic.literal(cmd = cmd, raw = raw)
  
    __obj.asInstanceOf[ParserArgument]
  }
}

