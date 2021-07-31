package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FTGetFileInfo
  extends StObject
     with ResponseEntry {
  
  var cid: String
  
  var datetime: Double
  
  var name: String
  
  var size: Double
}
object FTGetFileInfo {
  
  @scala.inline
  def apply(cid: String, datetime: Double, name: String, size: Double): FTGetFileInfo = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], datetime = datetime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FTGetFileInfo]
  }
  
  @scala.inline
  implicit class FTGetFileInfoMutableBuilder[Self <: FTGetFileInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatetime(value: Double): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
