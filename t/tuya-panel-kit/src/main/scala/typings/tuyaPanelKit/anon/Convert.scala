package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Convert extends StObject {
  
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
  implicit class ConvertMutableBuilder[Self <: Convert] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConvert(value: Double => Double): Self = StObject.set(x, "convert", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConvertX(value: Double => Double): Self = StObject.set(x, "convertX", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConvertY(value: Double => Double): Self = StObject.set(x, "convertY", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHRatio(value: Double): Self = StObject.set(x, "HRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIos(value: Boolean): Self = StObject.set(x, "isIos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIphoneX(value: Boolean): Self = StObject.set(x, "isIphoneX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSmallH(value: Boolean): Self = StObject.set(x, "isSmallH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSmallW(value: Boolean): Self = StObject.set(x, "isSmallW", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsWeb(value: Boolean): Self = StObject.set(x, "isWeb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusBarHeight(value: Double): Self = StObject.set(x, "statusBarHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopBarHeight(value: Double): Self = StObject.set(x, "topBarHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVRatio(value: Double): Self = StObject.set(x, "VRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewHeight(value: Double): Self = StObject.set(x, "viewHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewWidth(value: Double): Self = StObject.set(x, "viewWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWinHeight(value: Double): Self = StObject.set(x, "winHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWinWidth(value: Double): Self = StObject.set(x, "winWidth", value.asInstanceOf[js.Any])
  }
}
