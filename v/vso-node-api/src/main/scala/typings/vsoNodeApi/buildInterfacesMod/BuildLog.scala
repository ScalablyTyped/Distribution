package typings.vsoNodeApi.buildInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildLog
  extends StObject
     with BuildLogReference {
  
  /**
    * The date and time the log was created.
    */
  var createdOn: Date
  
  /**
    * The date and time the log was last changed.
    */
  var lastChangedOn: Date
  
  /**
    * The number of lines in the log.
    */
  var lineCount: Double
}
object BuildLog {
  
  inline def apply(createdOn: Date, id: Double, lastChangedOn: Date, lineCount: Double, `type`: String, url: String): BuildLog = {
    val __obj = js.Dynamic.literal(createdOn = createdOn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastChangedOn = lastChangedOn.asInstanceOf[js.Any], lineCount = lineCount.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildLog]
  }
  
  extension [Self <: BuildLog](x: Self) {
    
    inline def setCreatedOn(value: Date): Self = StObject.set(x, "createdOn", value.asInstanceOf[js.Any])
    
    inline def setLastChangedOn(value: Date): Self = StObject.set(x, "lastChangedOn", value.asInstanceOf[js.Any])
    
    inline def setLineCount(value: Double): Self = StObject.set(x, "lineCount", value.asInstanceOf[js.Any])
  }
}
