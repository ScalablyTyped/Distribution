package typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerTempPasswordList extends js.Object {
  var desc: String
  var end: Double
  var nickname: String
  var pw_clear: String
  var start: Double
  var tcid: Double
  var uid: String
}

object ServerTempPasswordList {
  @scala.inline
  def apply(
    desc: String,
    end: Double,
    nickname: String,
    pw_clear: String,
    start: Double,
    tcid: Double,
    uid: String
  ): ServerTempPasswordList = {
    val __obj = js.Dynamic.literal(desc = desc, end = end, nickname = nickname, pw_clear = pw_clear, start = start, tcid = tcid, uid = uid)
  
    __obj.asInstanceOf[ServerTempPasswordList]
  }
}

