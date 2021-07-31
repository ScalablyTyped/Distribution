package typings.typestubIpfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stat extends StObject {
  
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
  
  @scala.inline
  implicit class StatMutableBuilder[Self <: Stat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlocksReceived(value: Big): Self = StObject.set(x, "blocksReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlocksSent(value: Big): Self = StObject.set(x, "blocksSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataReceived(value: Big): Self = StObject.set(x, "dataReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSent(value: Big): Self = StObject.set(x, "dataSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDupBlksReceived(value: Big): Self = StObject.set(x, "dupBlksReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDupDataReceived(value: Big): Self = StObject.set(x, "dupDataReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeers(value: js.Array[String]): Self = StObject.set(x, "peers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeersVarargs(value: String*): Self = StObject.set(x, "peers", js.Array(value :_*))
    
    @scala.inline
    def setProvideBufLen(value: Double): Self = StObject.set(x, "provideBufLen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWantlist(value: js.Array[WantListItem]): Self = StObject.set(x, "wantlist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWantlistVarargs(value: WantListItem*): Self = StObject.set(x, "wantlist", js.Array(value :_*))
  }
}
