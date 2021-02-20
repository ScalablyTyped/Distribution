package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChooseVideoSuccess extends StObject {
  
  /**
    * 选定视频的时间长度
    */
  var duration: js.UndefOr[Double] = js.native
  
  /**
    * 返回选定视频的长
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * 选定视频的数据量大小
    */
  var size: js.UndefOr[Double] = js.native
  
  /**
    * 临时文件路径，下载后的文件会存储到一个临时文件
    */
  var tempFilePath: js.UndefOr[String] = js.native
  
  /**
    * 返回选定视频的宽
    */
  var width: js.UndefOr[Double] = js.native
}
object ChooseVideoSuccess {
  
  @scala.inline
  def apply(): ChooseVideoSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseVideoSuccess]
  }
  
  @scala.inline
  implicit class ChooseVideoSuccessMutableBuilder[Self <: ChooseVideoSuccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setTempFilePath(value: String): Self = StObject.set(x, "tempFilePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempFilePathUndefined: Self = StObject.set(x, "tempFilePath", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
