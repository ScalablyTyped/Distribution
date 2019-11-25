package typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelClientPermListSid extends js.Object {
  var cid: Double
  var cldbid: Double
  var permnegated: Double
  var permsid: String
  var permskip: Double
  var permvalue: Double
}

object ChannelClientPermListSid {
  @scala.inline
  def apply(
    cid: Double,
    cldbid: Double,
    permnegated: Double,
    permsid: String,
    permskip: Double,
    permvalue: Double
  ): ChannelClientPermListSid = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], cldbid = cldbid.asInstanceOf[js.Any], permnegated = permnegated.asInstanceOf[js.Any], permsid = permsid.asInstanceOf[js.Any], permskip = permskip.asInstanceOf[js.Any], permvalue = permvalue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChannelClientPermListSid]
  }
}

