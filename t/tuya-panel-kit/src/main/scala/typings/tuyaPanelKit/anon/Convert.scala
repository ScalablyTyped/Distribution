package typings.tuyaPanelKit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Convert extends js.Object {
  
  var HRatio: Double = js.native
  
  var VRatio: Double = js.native
  
  def convert(d: Double): Double = js.native
  
  def convertX(d: Double): Double = js.native
  
  def convertY(d: Double): Double = js.native
  
  var height: Double = js.native
  
  var isIos: Boolean = js.native
  
  var isIphoneX: Boolean = js.native
  
  var isSmallH: Boolean = js.native
  
  var isSmallW: Boolean = js.native
  
  var isWeb: Boolean = js.native
  
  var statusBarHeight: Double = js.native
  
  var topBarHeight: Double = js.native
  
  var viewHeight: Double = js.native
  
  var viewWidth: Double = js.native
  
  var width: Double = js.native
  
  var winHeight: Double = js.native
  
  var winWidth: Double = js.native
}
object Convert {
  
  @scala.inline
  def apply(
    HRatio: Double,
    VRatio: Double,
    convert: Double => Double,
    convertX: Double => Double,
    convertY: Double => Double,
    height: Double,
    isIos: Boolean,
    isIphoneX: Boolean,
    isSmallH: Boolean,
    isSmallW: Boolean,
    isWeb: Boolean,
    statusBarHeight: Double,
    topBarHeight: Double,
    viewHeight: Double,
    viewWidth: Double,
    width: Double,
    winHeight: Double,
    winWidth: Double
  ): Convert = {
    val __obj = js.Dynamic.literal(HRatio = HRatio.asInstanceOf[js.Any], VRatio = VRatio.asInstanceOf[js.Any], convert = js.Any.fromFunction1(convert), convertX = js.Any.fromFunction1(convertX), convertY = js.Any.fromFunction1(convertY), height = height.asInstanceOf[js.Any], isIos = isIos.asInstanceOf[js.Any], isIphoneX = isIphoneX.asInstanceOf[js.Any], isSmallH = isSmallH.asInstanceOf[js.Any], isSmallW = isSmallW.asInstanceOf[js.Any], isWeb = isWeb.asInstanceOf[js.Any], statusBarHeight = statusBarHeight.asInstanceOf[js.Any], topBarHeight = topBarHeight.asInstanceOf[js.Any], viewHeight = viewHeight.asInstanceOf[js.Any], viewWidth = viewWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], winHeight = winHeight.asInstanceOf[js.Any], winWidth = winWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Convert]
  }
  
  @scala.inline
  implicit class ConvertOps[Self <: Convert] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHRatio(value: Double): Self = this.set("HRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVRatio(value: Double): Self = this.set("VRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvert(value: Double => Double): Self = this.set("convert", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConvertX(value: Double => Double): Self = this.set("convertX", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConvertY(value: Double => Double): Self = this.set("convertY", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIos(value: Boolean): Self = this.set("isIos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIphoneX(value: Boolean): Self = this.set("isIphoneX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSmallH(value: Boolean): Self = this.set("isSmallH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSmallW(value: Boolean): Self = this.set("isSmallW", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsWeb(value: Boolean): Self = this.set("isWeb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusBarHeight(value: Double): Self = this.set("statusBarHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopBarHeight(value: Double): Self = this.set("topBarHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewHeight(value: Double): Self = this.set("viewHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewWidth(value: Double): Self = this.set("viewWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWinHeight(value: Double): Self = this.set("winHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWinWidth(value: Double): Self = this.set("winWidth", value.asInstanceOf[js.Any])
  }
}
