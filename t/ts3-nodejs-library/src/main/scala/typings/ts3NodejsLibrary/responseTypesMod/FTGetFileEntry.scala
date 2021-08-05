package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FTGetFileEntry
  extends StObject
     with ResponseEntry {
  
  var cid: String
  
  var datetime: Double
  
  var name: String
  
  var path: String
  
  var size: Double
  
  /** 1=file 0=folder */
  var `type`: Double
}
object FTGetFileEntry {
  
  inline def apply(cid: String, datetime: Double, name: String, path: String, size: Double, `type`: Double): FTGetFileEntry = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], datetime = datetime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FTGetFileEntry]
  }
  
  extension [Self <: FTGetFileEntry](x: Self) {
    
    inline def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    inline def setDatetime(value: Double): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
