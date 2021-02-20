package typings.wegameApi.anon

import typings.wegameApi.wegameApiStrings.auto
import typings.wegameApi.wegameApiStrings.back
import typings.wegameApi.wegameApiStrings.front
import typings.wegameApi.wegameApiStrings.large
import typings.wegameApi.wegameApiStrings.medium
import typings.wegameApi.wegameApiStrings.off
import typings.wegameApi.wegameApiStrings.on
import typings.wegameApi.wegameApiStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined wegame-api.wx.types.Callbacks & {  x :number | undefined,   y :number | undefined,   width :number | undefined,   height :number | undefined,   devicePosition :'front' | 'back' | undefined,   flash :'auto' | 'on' | 'off' | undefined,   size :'small' | 'medium' | 'large' | undefined} */
@js.native
trait Callbacksxnumberundefined extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 摄像头朝向，值为 front, back，默认值back
    */
  var devicePosition: js.UndefOr[front | back] = js.native
  
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 闪光灯，值为 auto, on, off，默认值auto
    */
  var flash: js.UndefOr[auto | on | off] = js.native
  
  /**
    * 相机的高度，默认值150
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * 帧数据图像尺寸，值为 small, medium, large，默认值small
    */
  var size: js.UndefOr[small | medium | large] = js.native
  
  var success: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 相机的宽度，默认值300
    */
  var width: js.UndefOr[Double] = js.native
  
  /**
    * 相机的左上角横坐标，默认值0
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * 相机的左上角纵坐标，默认值0
    */
  var y: js.UndefOr[Double] = js.native
}
object Callbacksxnumberundefined {
  
  @scala.inline
  def apply(): Callbacksxnumberundefined = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Callbacksxnumberundefined]
  }
  
  @scala.inline
  implicit class CallbacksxnumberundefinedMutableBuilder[Self <: Callbacksxnumberundefined] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setDevicePosition(value: front | back): Self = StObject.set(x, "devicePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicePositionUndefined: Self = StObject.set(x, "devicePosition", js.undefined)
    
    @scala.inline
    def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setFlash(value: auto | on | off): Self = StObject.set(x, "flash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlashUndefined: Self = StObject.set(x, "flash", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setSize(value: small | medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSuccess(value: () => Unit): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
