package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Convert extends StObject {
  
  var HRatio: Double
  
  var VRatio: Double
  
  def convert(d: Double): Double
  
  def convertX(d: Double): Double
  
  def convertY(d: Double): Double
  
  var height: Double
  
  var isIos: Boolean
  
  var isIphoneX: Boolean
  
  var isSmallH: Boolean
  
  var isSmallW: Boolean
  
  var isWeb: Boolean
  
  var statusBarHeight: Double
  
  var topBarHeight: Double
  
  var viewHeight: Double
  
  var viewWidth: Double
  
  var width: Double
  
  var winHeight: Double
  
  var winWidth: Double
}
object Convert {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: Convert] (val x: Self) extends AnyVal {
    
    inline def setConvert(value: Double => Double): Self = StObject.set(x, "convert", js.Any.fromFunction1(value))
    
    inline def setConvertX(value: Double => Double): Self = StObject.set(x, "convertX", js.Any.fromFunction1(value))
    
    inline def setConvertY(value: Double => Double): Self = StObject.set(x, "convertY", js.Any.fromFunction1(value))
    
    inline def setHRatio(value: Double): Self = StObject.set(x, "HRatio", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setIsIos(value: Boolean): Self = StObject.set(x, "isIos", value.asInstanceOf[js.Any])
    
    inline def setIsIphoneX(value: Boolean): Self = StObject.set(x, "isIphoneX", value.asInstanceOf[js.Any])
    
    inline def setIsSmallH(value: Boolean): Self = StObject.set(x, "isSmallH", value.asInstanceOf[js.Any])
    
    inline def setIsSmallW(value: Boolean): Self = StObject.set(x, "isSmallW", value.asInstanceOf[js.Any])
    
    inline def setIsWeb(value: Boolean): Self = StObject.set(x, "isWeb", value.asInstanceOf[js.Any])
    
    inline def setStatusBarHeight(value: Double): Self = StObject.set(x, "statusBarHeight", value.asInstanceOf[js.Any])
    
    inline def setTopBarHeight(value: Double): Self = StObject.set(x, "topBarHeight", value.asInstanceOf[js.Any])
    
    inline def setVRatio(value: Double): Self = StObject.set(x, "VRatio", value.asInstanceOf[js.Any])
    
    inline def setViewHeight(value: Double): Self = StObject.set(x, "viewHeight", value.asInstanceOf[js.Any])
    
    inline def setViewWidth(value: Double): Self = StObject.set(x, "viewWidth", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWinHeight(value: Double): Self = StObject.set(x, "winHeight", value.asInstanceOf[js.Any])
    
    inline def setWinWidth(value: Double): Self = StObject.set(x, "winWidth", value.asInstanceOf[js.Any])
  }
}
