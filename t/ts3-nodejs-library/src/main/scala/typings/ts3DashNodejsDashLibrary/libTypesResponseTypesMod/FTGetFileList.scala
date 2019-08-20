package typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FTGetFileList extends js.Object {
  var cid: Double
  var datetime: Double
  var name: String
  var path: String
  var size: Double
  /** 1=file 0=folder */
  var `type`: Double
}

object FTGetFileList {
  @scala.inline
  def apply(cid: Double, datetime: Double, name: String, path: String, size: Double, `type`: Double): FTGetFileList = {
    val __obj = js.Dynamic.literal(cid = cid, datetime = datetime, name = name, path = path, size = size)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FTGetFileList]
  }
}

