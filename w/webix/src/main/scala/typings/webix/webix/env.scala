package typings.webix.webix

import typings.webix.anon.Move
import typings.webix.anon.Up
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait env extends StObject {
  
  @JSName("$customScroll")
  var $customScroll: js.UndefOr[Boolean] = js.undefined
  
  var cdn: String
  
  var codebase: String
  
  var fastClick: Boolean
  
  var https: Boolean
  
  var isAndroid: js.UndefOr[Boolean] = js.undefined
  
  var isChromium: js.UndefOr[Boolean] = js.undefined
  
  var isFF: js.UndefOr[Boolean] = js.undefined
  
  var isIE: js.UndefOr[Boolean] = js.undefined
  
  var isIOS: js.UndefOr[Boolean] = js.undefined
  
  var isMac: js.UndefOr[Boolean] = js.undefined
  
  var isSafari: js.UndefOr[Boolean] = js.undefined
  
  var maxHTMLElementSize: js.UndefOr[Double] = js.undefined
  
  var mobile: js.UndefOr[Boolean] = js.undefined
  
  var mouse: Move
  
  var passiveEventListeners: Boolean
  
  var pringMargin: Double
  
  var printPPI: Double
  
  var scrollSize: Double
  
  var strict: Boolean
  
  var svg: Boolean
  
  var svganimation: Boolean
  
  var touch: js.UndefOr[Up] = js.undefined
  
  var transform: String
  
  var transition: String
  
  var transitionDuration: String
  
  var transitionEnd: String
  
  var translate: String
  
  var zIndexBase: Double
}
object env {
  
  inline def apply(
    cdn: String,
    codebase: String,
    fastClick: Boolean,
    https: Boolean,
    mouse: Move,
    passiveEventListeners: Boolean,
    pringMargin: Double,
    printPPI: Double,
    scrollSize: Double,
    strict: Boolean,
    svg: Boolean,
    svganimation: Boolean,
    transform: String,
    transition: String,
    transitionDuration: String,
    transitionEnd: String,
    translate: String,
    zIndexBase: Double
  ): env = {
    val __obj = js.Dynamic.literal(cdn = cdn.asInstanceOf[js.Any], codebase = codebase.asInstanceOf[js.Any], fastClick = fastClick.asInstanceOf[js.Any], https = https.asInstanceOf[js.Any], mouse = mouse.asInstanceOf[js.Any], passiveEventListeners = passiveEventListeners.asInstanceOf[js.Any], pringMargin = pringMargin.asInstanceOf[js.Any], printPPI = printPPI.asInstanceOf[js.Any], scrollSize = scrollSize.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any], svganimation = svganimation.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], transitionDuration = transitionDuration.asInstanceOf[js.Any], transitionEnd = transitionEnd.asInstanceOf[js.Any], translate = translate.asInstanceOf[js.Any], zIndexBase = zIndexBase.asInstanceOf[js.Any])
    __obj.asInstanceOf[env]
  }
  
  extension [Self <: env](x: Self) {
    
    inline def set$customScroll(value: Boolean): Self = StObject.set(x, "$customScroll", value.asInstanceOf[js.Any])
    
    inline def set$customScrollUndefined: Self = StObject.set(x, "$customScroll", js.undefined)
    
    inline def setCdn(value: String): Self = StObject.set(x, "cdn", value.asInstanceOf[js.Any])
    
    inline def setCodebase(value: String): Self = StObject.set(x, "codebase", value.asInstanceOf[js.Any])
    
    inline def setFastClick(value: Boolean): Self = StObject.set(x, "fastClick", value.asInstanceOf[js.Any])
    
    inline def setHttps(value: Boolean): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
    
    inline def setIsAndroid(value: Boolean): Self = StObject.set(x, "isAndroid", value.asInstanceOf[js.Any])
    
    inline def setIsAndroidUndefined: Self = StObject.set(x, "isAndroid", js.undefined)
    
    inline def setIsChromium(value: Boolean): Self = StObject.set(x, "isChromium", value.asInstanceOf[js.Any])
    
    inline def setIsChromiumUndefined: Self = StObject.set(x, "isChromium", js.undefined)
    
    inline def setIsFF(value: Boolean): Self = StObject.set(x, "isFF", value.asInstanceOf[js.Any])
    
    inline def setIsFFUndefined: Self = StObject.set(x, "isFF", js.undefined)
    
    inline def setIsIE(value: Boolean): Self = StObject.set(x, "isIE", value.asInstanceOf[js.Any])
    
    inline def setIsIEUndefined: Self = StObject.set(x, "isIE", js.undefined)
    
    inline def setIsIOS(value: Boolean): Self = StObject.set(x, "isIOS", value.asInstanceOf[js.Any])
    
    inline def setIsIOSUndefined: Self = StObject.set(x, "isIOS", js.undefined)
    
    inline def setIsMac(value: Boolean): Self = StObject.set(x, "isMac", value.asInstanceOf[js.Any])
    
    inline def setIsMacUndefined: Self = StObject.set(x, "isMac", js.undefined)
    
    inline def setIsSafari(value: Boolean): Self = StObject.set(x, "isSafari", value.asInstanceOf[js.Any])
    
    inline def setIsSafariUndefined: Self = StObject.set(x, "isSafari", js.undefined)
    
    inline def setMaxHTMLElementSize(value: Double): Self = StObject.set(x, "maxHTMLElementSize", value.asInstanceOf[js.Any])
    
    inline def setMaxHTMLElementSizeUndefined: Self = StObject.set(x, "maxHTMLElementSize", js.undefined)
    
    inline def setMobile(value: Boolean): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    inline def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
    
    inline def setMouse(value: Move): Self = StObject.set(x, "mouse", value.asInstanceOf[js.Any])
    
    inline def setPassiveEventListeners(value: Boolean): Self = StObject.set(x, "passiveEventListeners", value.asInstanceOf[js.Any])
    
    inline def setPringMargin(value: Double): Self = StObject.set(x, "pringMargin", value.asInstanceOf[js.Any])
    
    inline def setPrintPPI(value: Double): Self = StObject.set(x, "printPPI", value.asInstanceOf[js.Any])
    
    inline def setScrollSize(value: Double): Self = StObject.set(x, "scrollSize", value.asInstanceOf[js.Any])
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setSvg(value: Boolean): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
    
    inline def setSvganimation(value: Boolean): Self = StObject.set(x, "svganimation", value.asInstanceOf[js.Any])
    
    inline def setTouch(value: Up): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
    
    inline def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
    
    inline def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionDuration(value: String): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
    
    inline def setTransitionEnd(value: String): Self = StObject.set(x, "transitionEnd", value.asInstanceOf[js.Any])
    
    inline def setTranslate(value: String): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    
    inline def setZIndexBase(value: Double): Self = StObject.set(x, "zIndexBase", value.asInstanceOf[js.Any])
  }
}
