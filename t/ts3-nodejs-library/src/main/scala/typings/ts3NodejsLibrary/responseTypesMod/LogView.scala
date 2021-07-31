package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
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
  
  @scala.inline
  def apply(fileSize: Double, l: String, lastPos: Double): LogView = {
    val __obj = js.Dynamic.literal(fileSize = fileSize.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], lastPos = lastPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogView]
  }
  
  @scala.inline
  implicit class LogViewMutableBuilder[Self <: LogView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL(value: String): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastPos(value: Double): Self = StObject.set(x, "lastPos", value.asInstanceOf[js.Any])
  }
}
