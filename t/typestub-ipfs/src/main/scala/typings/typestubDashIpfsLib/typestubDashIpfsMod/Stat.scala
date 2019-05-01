package typings
package typestubDashIpfsLib.typestubDashIpfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stat extends js.Object {
  var blocksReceived: Big
  var blocksSent: Big
  var dataReceived: Big
  var dataSent: Big
  var dupBlksReceived: Big
  var dupDataReceived: Big
  var peers: js.Array[java.lang.String]
  var provideBufLen: scala.Double
  var wantlist: js.Array[WantListItem]
}

object Stat {
  @scala.inline
  def apply(
    blocksReceived: Big,
    blocksSent: Big,
    dataReceived: Big,
    dataSent: Big,
    dupBlksReceived: Big,
    dupDataReceived: Big,
    peers: js.Array[java.lang.String],
    provideBufLen: scala.Double,
    wantlist: js.Array[WantListItem]
  ): Stat = {
    val __obj = js.Dynamic.literal(blocksReceived = blocksReceived, blocksSent = blocksSent, dataReceived = dataReceived, dataSent = dataSent, dupBlksReceived = dupBlksReceived, dupDataReceived = dupDataReceived, peers = peers, provideBufLen = provideBufLen, wantlist = wantlist)
  
    __obj.asInstanceOf[Stat]
  }
}

