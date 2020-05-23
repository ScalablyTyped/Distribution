package typings.systeminformation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Infoname extends js.Object {
  var info_name: java.lang.String
  var name: java.lang.String
  var protocol: java.lang.String
  var `type`: java.lang.String
}

object Infoname {
  @scala.inline
  def apply(
    info_name: java.lang.String,
    name: java.lang.String,
    protocol: java.lang.String,
    `type`: java.lang.String
  ): Infoname = {
    val __obj = js.Dynamic.literal(info_name = info_name.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Infoname]
  }
}

