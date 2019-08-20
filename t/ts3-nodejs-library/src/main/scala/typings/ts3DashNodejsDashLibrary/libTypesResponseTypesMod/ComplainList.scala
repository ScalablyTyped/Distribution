package typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComplainList extends js.Object {
  var fcldbid: Double
  var fname: String
  var message: String
  var tcldbid: Double
  var timestamp: Double
  var tname: String
}

object ComplainList {
  @scala.inline
  def apply(fcldbid: Double, fname: String, message: String, tcldbid: Double, timestamp: Double, tname: String): ComplainList = {
    val __obj = js.Dynamic.literal(fcldbid = fcldbid, fname = fname, message = message, tcldbid = tcldbid, timestamp = timestamp, tname = tname)
  
    __obj.asInstanceOf[ComplainList]
  }
}

