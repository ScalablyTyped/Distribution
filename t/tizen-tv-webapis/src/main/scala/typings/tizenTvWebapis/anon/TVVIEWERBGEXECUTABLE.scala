package typings.tizenTvWebapis.anon

import typings.tizenTvWebapis.tizenTvWebapisNumbers.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TVVIEWERBGEXECUTABLE extends StObject {
  
  /**
    * Whether the application can be executed in the background
    */
  var TV_VIEWER_BG_EXECUTABLE: `0`
}
object TVVIEWERBGEXECUTABLE {
  
  @scala.inline
  def apply(): TVVIEWERBGEXECUTABLE = {
    val __obj = js.Dynamic.literal(TV_VIEWER_BG_EXECUTABLE = 0)
    __obj.asInstanceOf[TVVIEWERBGEXECUTABLE]
  }
  
  @scala.inline
  implicit class TVVIEWERBGEXECUTABLEMutableBuilder[Self <: TVVIEWERBGEXECUTABLE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTV_VIEWER_BG_EXECUTABLE(value: `0`): Self = StObject.set(x, "TV_VIEWER_BG_EXECUTABLE", value.asInstanceOf[js.Any])
  }
}
