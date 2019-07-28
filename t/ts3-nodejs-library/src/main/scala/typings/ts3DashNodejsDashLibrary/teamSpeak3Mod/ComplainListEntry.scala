package typings.ts3DashNodejsDashLibrary.teamSpeak3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComplainListEntry extends js.Object {
  var fcldbid: String
  var fname: String
  var message: String
  var tcldbid: String
  var timestamp: String
  var tname: String
}

object ComplainListEntry {
  @scala.inline
  def apply(fcldbid: String, fname: String, message: String, tcldbid: String, timestamp: String, tname: String): ComplainListEntry = {
    val __obj = js.Dynamic.literal(fcldbid = fcldbid, fname = fname, message = message, tcldbid = tcldbid, timestamp = timestamp, tname = tname)
  
    __obj.asInstanceOf[ComplainListEntry]
  }
}

