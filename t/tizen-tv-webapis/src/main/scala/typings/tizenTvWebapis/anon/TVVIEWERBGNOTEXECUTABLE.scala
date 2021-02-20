package typings.tizenTvWebapis.anon

import typings.tizenTvWebapis.tizenTvWebapisNumbers.`0`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TVVIEWERBGNOTEXECUTABLE extends StObject {
  
  /**
    * Background execution is supported
    */
  var TV_VIEWER_BG_EXECUTABLE: `1` = js.native
  
  /**
    * Background execution is not supported
    */
  var TV_VIEWER_BG_NOT_EXECUTABLE: `0` = js.native
}
object TVVIEWERBGNOTEXECUTABLE {
  
  @scala.inline
  def apply(TV_VIEWER_BG_EXECUTABLE: `1`, TV_VIEWER_BG_NOT_EXECUTABLE: `0`): TVVIEWERBGNOTEXECUTABLE = {
    val __obj = js.Dynamic.literal(TV_VIEWER_BG_EXECUTABLE = TV_VIEWER_BG_EXECUTABLE.asInstanceOf[js.Any], TV_VIEWER_BG_NOT_EXECUTABLE = TV_VIEWER_BG_NOT_EXECUTABLE.asInstanceOf[js.Any])
    __obj.asInstanceOf[TVVIEWERBGNOTEXECUTABLE]
  }
  
  @scala.inline
  implicit class TVVIEWERBGNOTEXECUTABLEMutableBuilder[Self <: TVVIEWERBGNOTEXECUTABLE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTV_VIEWER_BG_EXECUTABLE(value: `1`): Self = StObject.set(x, "TV_VIEWER_BG_EXECUTABLE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTV_VIEWER_BG_NOT_EXECUTABLE(value: `0`): Self = StObject.set(x, "TV_VIEWER_BG_NOT_EXECUTABLE", value.asInstanceOf[js.Any])
  }
}
