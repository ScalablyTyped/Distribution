package typings
package ts3DashNodejsDashLibraryLib.teamSpeak3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComplainListEntry extends js.Object {
  var fcldbid: java.lang.String
  var fname: java.lang.String
  var message: java.lang.String
  var tcldbid: java.lang.String
  var timestamp: java.lang.String
  var tname: java.lang.String
}

object ComplainListEntry {
  @scala.inline
  def apply(
    fcldbid: java.lang.String,
    fname: java.lang.String,
    message: java.lang.String,
    tcldbid: java.lang.String,
    timestamp: java.lang.String,
    tname: java.lang.String
  ): ComplainListEntry = {
    val __obj = js.Dynamic.literal(fcldbid = fcldbid, fname = fname, message = message, tcldbid = tcldbid, timestamp = timestamp, tname = tname)
  
    __obj.asInstanceOf[ComplainListEntry]
  }
}

