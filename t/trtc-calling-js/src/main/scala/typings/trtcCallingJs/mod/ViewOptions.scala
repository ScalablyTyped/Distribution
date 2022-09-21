package typings.trtcCallingJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 摄像头渲染相关类型 */
trait ViewOptions
  extends StObject
     with UserInfo {
  
  var videoViewDomID: String
}
object ViewOptions {
  
  inline def apply(userID: String, videoViewDomID: String): ViewOptions = {
    val __obj = js.Dynamic.literal(userID = userID.asInstanceOf[js.Any], videoViewDomID = videoViewDomID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewOptions]
  }
  
  extension [Self <: ViewOptions](x: Self) {
    
    inline def setVideoViewDomID(value: String): Self = StObject.set(x, "videoViewDomID", value.asInstanceOf[js.Any])
  }
}
