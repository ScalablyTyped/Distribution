package typings.vueRuntimeDom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IframeHTMLAttributes
  extends StObject
     with HTMLAttributes {
  
  var allow: js.UndefOr[String] = js.undefined
  
  var allowfullscreen: js.UndefOr[Booleanish] = js.undefined
  
  var allowtransparency: js.UndefOr[Booleanish] = js.undefined
  
  var frameborder: js.UndefOr[Numberish] = js.undefined
  
  var height: js.UndefOr[Numberish] = js.undefined
  
  var marginheight: js.UndefOr[Numberish] = js.undefined
  
  var marginwidth: js.UndefOr[Numberish] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var referrerpolicy: js.UndefOr[String] = js.undefined
  
  var sandbox: js.UndefOr[String] = js.undefined
  
  var scrolling: js.UndefOr[String] = js.undefined
  
  var seamless: js.UndefOr[Booleanish] = js.undefined
  
  var src: js.UndefOr[String] = js.undefined
  
  var srcdoc: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Numberish] = js.undefined
}
object IframeHTMLAttributes {
  
  inline def apply(): IframeHTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IframeHTMLAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IframeHTMLAttributes] (val x: Self) extends AnyVal {
    
    inline def setAllow(value: String): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
    
    inline def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
    
    inline def setAllowfullscreen(value: Booleanish): Self = StObject.set(x, "allowfullscreen", value.asInstanceOf[js.Any])
    
    inline def setAllowfullscreenUndefined: Self = StObject.set(x, "allowfullscreen", js.undefined)
    
    inline def setAllowtransparency(value: Booleanish): Self = StObject.set(x, "allowtransparency", value.asInstanceOf[js.Any])
    
    inline def setAllowtransparencyUndefined: Self = StObject.set(x, "allowtransparency", js.undefined)
    
    inline def setFrameborder(value: Numberish): Self = StObject.set(x, "frameborder", value.asInstanceOf[js.Any])
    
    inline def setFrameborderUndefined: Self = StObject.set(x, "frameborder", js.undefined)
    
    inline def setHeight(value: Numberish): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setMarginheight(value: Numberish): Self = StObject.set(x, "marginheight", value.asInstanceOf[js.Any])
    
    inline def setMarginheightUndefined: Self = StObject.set(x, "marginheight", js.undefined)
    
    inline def setMarginwidth(value: Numberish): Self = StObject.set(x, "marginwidth", value.asInstanceOf[js.Any])
    
    inline def setMarginwidthUndefined: Self = StObject.set(x, "marginwidth", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReferrerpolicy(value: String): Self = StObject.set(x, "referrerpolicy", value.asInstanceOf[js.Any])
    
    inline def setReferrerpolicyUndefined: Self = StObject.set(x, "referrerpolicy", js.undefined)
    
    inline def setSandbox(value: String): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
    
    inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
    
    inline def setScrolling(value: String): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
    
    inline def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
    
    inline def setSeamless(value: Booleanish): Self = StObject.set(x, "seamless", value.asInstanceOf[js.Any])
    
    inline def setSeamlessUndefined: Self = StObject.set(x, "seamless", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setSrcdoc(value: String): Self = StObject.set(x, "srcdoc", value.asInstanceOf[js.Any])
    
    inline def setSrcdocUndefined: Self = StObject.set(x, "srcdoc", js.undefined)
    
    inline def setWidth(value: Numberish): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
