package typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FTGetFileInfo extends js.Object {
  var cid: Double
  var datetime: Double
  var name: String
  var size: Double
}

object FTGetFileInfo {
  @scala.inline
  def apply(cid: Double, datetime: Double, name: String, size: Double): FTGetFileInfo = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], datetime = datetime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FTGetFileInfo]
  }
}

