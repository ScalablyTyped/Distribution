package typings.ts3NodejsLibrary.libTypesResponseTypesMod

import typings.ts3NodejsLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogView
  extends StObject
     with ResponseEntry {
  
  var fileSize: Double
  
  var l: String
  
  var lastPos: Double
}
object LogView {
  
  inline def apply(fileSize: Double, l: String, lastPos: Double): LogView = {
    val __obj = js.Dynamic.literal(fileSize = fileSize.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], lastPos = lastPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogView]
  }
  
  extension [Self <: LogView](x: Self) {
    
    inline def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
    
    inline def setL(value: String): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    
    inline def setLastPos(value: Double): Self = StObject.set(x, "lastPos", value.asInstanceOf[js.Any])
  }
}
