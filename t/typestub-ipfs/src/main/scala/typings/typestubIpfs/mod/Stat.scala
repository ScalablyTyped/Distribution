package typings.typestubIpfs.mod

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
  var peers: js.Array[String]
  var provideBufLen: Double
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
    peers: js.Array[String],
    provideBufLen: Double,
    wantlist: js.Array[WantListItem]
  ): Stat = {
    val __obj = js.Dynamic.literal(blocksReceived = blocksReceived.asInstanceOf[js.Any], blocksSent = blocksSent.asInstanceOf[js.Any], dataReceived = dataReceived.asInstanceOf[js.Any], dataSent = dataSent.asInstanceOf[js.Any], dupBlksReceived = dupBlksReceived.asInstanceOf[js.Any], dupDataReceived = dupDataReceived.asInstanceOf[js.Any], peers = peers.asInstanceOf[js.Any], provideBufLen = provideBufLen.asInstanceOf[js.Any], wantlist = wantlist.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Stat]
  }
}

