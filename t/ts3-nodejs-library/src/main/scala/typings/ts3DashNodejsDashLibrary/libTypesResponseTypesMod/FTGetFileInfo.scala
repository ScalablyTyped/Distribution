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
    val __obj = js.Dynamic.literal(cid = cid, datetime = datetime, name = name, size = size)
  
    __obj.asInstanceOf[FTGetFileInfo]
  }
}

