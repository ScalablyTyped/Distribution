package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 媒体-----音频播放控制
trait PlayVoiceOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  /** 需要播放的语音文件的文件路径 */
  var filePath: String
}
object PlayVoiceOptions {
  
  @scala.inline
  def apply(filePath: String): PlayVoiceOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayVoiceOptions]
  }
  
  @scala.inline
  implicit class PlayVoiceOptionsMutableBuilder[Self <: PlayVoiceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
  }
}
