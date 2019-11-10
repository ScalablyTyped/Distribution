package typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelClientPermListId extends js.Object {
  var cid: Double
  var cldbid: Double
  var permid: Double
  var permnegated: Double
  var permskip: Double
  var permvalue: Double
}

object ChannelClientPermListId {
  @scala.inline
  def apply(
    cid: Double,
    cldbid: Double,
    permid: Double,
    permnegated: Double,
    permskip: Double,
    permvalue: Double
  ): ChannelClientPermListId = {
    val __obj = js.Dynamic.literal(cid = cid, cldbid = cldbid, permid = permid, permnegated = permnegated, permskip = permskip, permvalue = permvalue)
  
    __obj.asInstanceOf[ChannelClientPermListId]
  }
}

