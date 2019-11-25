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
    val __obj = js.Dynamic.literal(fcldbid = fcldbid.asInstanceOf[js.Any], fname = fname.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tcldbid = tcldbid.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], tname = tname.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ComplainList]
  }
}

