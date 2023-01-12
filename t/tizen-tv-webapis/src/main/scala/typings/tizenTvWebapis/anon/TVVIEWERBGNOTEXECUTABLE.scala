package typings.tizenTvWebapis.anon

import typings.tizenTvWebapis.tizenTvWebapisInts.`0`
import typings.tizenTvWebapis.tizenTvWebapisInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TVVIEWERBGNOTEXECUTABLE extends StObject {
  
  /**
    * Background execution is supported
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var TV_VIEWER_BG_EXECUTABLE: `1`
  
  /**
    * Background execution is not supported
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var TV_VIEWER_BG_NOT_EXECUTABLE: `0`
}
object TVVIEWERBGNOTEXECUTABLE {
  
  inline def apply(): TVVIEWERBGNOTEXECUTABLE = {
    val __obj = js.Dynamic.literal(TV_VIEWER_BG_EXECUTABLE = 1, TV_VIEWER_BG_NOT_EXECUTABLE = 0)
    __obj.asInstanceOf[TVVIEWERBGNOTEXECUTABLE]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TVVIEWERBGNOTEXECUTABLE] (val x: Self) extends AnyVal {
    
    inline def setTV_VIEWER_BG_EXECUTABLE(value: `1`): Self = StObject.set(x, "TV_VIEWER_BG_EXECUTABLE", value.asInstanceOf[js.Any])
    
    inline def setTV_VIEWER_BG_NOT_EXECUTABLE(value: `0`): Self = StObject.set(x, "TV_VIEWER_BG_NOT_EXECUTABLE", value.asInstanceOf[js.Any])
  }
}
