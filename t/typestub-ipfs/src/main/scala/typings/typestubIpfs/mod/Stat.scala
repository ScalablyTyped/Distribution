package typings.typestubIpfs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stat extends js.Object {
  var blocksReceived: Big = js.native
  var blocksSent: Big = js.native
  var dataReceived: Big = js.native
  var dataSent: Big = js.native
  var dupBlksReceived: Big = js.native
  var dupDataReceived: Big = js.native
  var peers: js.Array[String] = js.native
  var provideBufLen: Double = js.native
  var wantlist: js.Array[WantListItem] = js.native
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
  @scala.inline
  implicit class StatOps[Self <: Stat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBlocksReceived(value: Big): Self = this.set("blocksReceived", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlocksSent(value: Big): Self = this.set("blocksSent", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataReceived(value: Big): Self = this.set("dataReceived", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataSent(value: Big): Self = this.set("dataSent", value.asInstanceOf[js.Any])
    @scala.inline
    def setDupBlksReceived(value: Big): Self = this.set("dupBlksReceived", value.asInstanceOf[js.Any])
    @scala.inline
    def setDupDataReceived(value: Big): Self = this.set("dupDataReceived", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeersVarargs(value: String*): Self = this.set("peers", js.Array(value :_*))
    @scala.inline
    def setPeers(value: js.Array[String]): Self = this.set("peers", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvideBufLen(value: Double): Self = this.set("provideBufLen", value.asInstanceOf[js.Any])
    @scala.inline
    def setWantlistVarargs(value: WantListItem*): Self = this.set("wantlist", js.Array(value :_*))
    @scala.inline
    def setWantlist(value: js.Array[WantListItem]): Self = this.set("wantlist", value.asInstanceOf[js.Any])
  }
  
}

