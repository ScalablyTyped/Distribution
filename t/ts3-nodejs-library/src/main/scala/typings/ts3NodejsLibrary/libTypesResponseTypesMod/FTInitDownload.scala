package typings.ts3NodejsLibrary.libTypesResponseTypesMod

import typings.ts3NodejsLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FTInitDownload
  extends StObject
     with ResponseEntry {
  
  var clientftfid: Double
  
  /** exists when file is downloadable */
  var ftkey: js.UndefOr[String] = js.undefined
  
  /** exists when an error occured */
  var msg: js.UndefOr[String] = js.undefined
  
  /** exists when file is downloadable */
  var port: js.UndefOr[Double] = js.undefined
  
  /** exists when file is downloadable */
  var proto: js.UndefOr[Double] = js.undefined
  
  /** exists when file is downloadable */
  var serverftfid: js.UndefOr[Double] = js.undefined
  
  var size: Double
  
  /** exists when an error occured */
  var status: js.UndefOr[Double] = js.undefined
}
object FTInitDownload {
  
  inline def apply(clientftfid: Double, size: Double): FTInitDownload = {
    val __obj = js.Dynamic.literal(clientftfid = clientftfid.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FTInitDownload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FTInitDownload] (val x: Self) extends AnyVal {
    
    inline def setClientftfid(value: Double): Self = StObject.set(x, "clientftfid", value.asInstanceOf[js.Any])
    
    inline def setFtkey(value: String): Self = StObject.set(x, "ftkey", value.asInstanceOf[js.Any])
    
    inline def setFtkeyUndefined: Self = StObject.set(x, "ftkey", js.undefined)
    
    inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    
    inline def setMsgUndefined: Self = StObject.set(x, "msg", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setProto(value: Double): Self = StObject.set(x, "proto", value.asInstanceOf[js.Any])
    
    inline def setProtoUndefined: Self = StObject.set(x, "proto", js.undefined)
    
    inline def setServerftfid(value: Double): Self = StObject.set(x, "serverftfid", value.asInstanceOf[js.Any])
    
    inline def setServerftfidUndefined: Self = StObject.set(x, "serverftfid", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
