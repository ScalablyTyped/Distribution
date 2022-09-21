package typings.vhtml.mod.JSX

import typings.vhtml.vhtmlStrings.`lazy`
import typings.vhtml.vhtmlStrings.eager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IframeHTMLAttributes
  extends StObject
     with HTMLAttributes {
  
  var allow: js.UndefOr[String] = js.undefined
  
  var allowfullscreen: js.UndefOr[Boolean] = js.undefined
  
  var allowtransparency: js.UndefOr[Boolean] = js.undefined
  
  /** @deprecated */
  var frameborder: js.UndefOr[Double | String] = js.undefined
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  var loading: js.UndefOr[eager | `lazy`] = js.undefined
  
  /** @deprecated */
  var marginheight: js.UndefOr[Double] = js.undefined
  
  /** @deprecated */
  var marginwidth: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var referrerpolicy: js.UndefOr[HTMLAttributeReferrerPolicy] = js.undefined
  
  var sandbox: js.UndefOr[String] = js.undefined
  
  /** @deprecated */
  var scrolling: js.UndefOr[String] = js.undefined
  
  var seamless: js.UndefOr[Boolean] = js.undefined
  
  var src: js.UndefOr[String] = js.undefined
  
  var srcdoc: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double | String] = js.undefined
}
object IframeHTMLAttributes {
  
  inline def apply(): IframeHTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IframeHTMLAttributes]
  }
  
  extension [Self <: IframeHTMLAttributes](x: Self) {
    
    inline def setAllow(value: String): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
    
    inline def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
    
    inline def setAllowfullscreen(value: Boolean): Self = StObject.set(x, "allowfullscreen", value.asInstanceOf[js.Any])
    
    inline def setAllowfullscreenUndefined: Self = StObject.set(x, "allowfullscreen", js.undefined)
    
    inline def setAllowtransparency(value: Boolean): Self = StObject.set(x, "allowtransparency", value.asInstanceOf[js.Any])
    
    inline def setAllowtransparencyUndefined: Self = StObject.set(x, "allowtransparency", js.undefined)
    
    inline def setFrameborder(value: Double | String): Self = StObject.set(x, "frameborder", value.asInstanceOf[js.Any])
    
    inline def setFrameborderUndefined: Self = StObject.set(x, "frameborder", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLoading(value: eager | `lazy`): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    inline def setMarginheight(value: Double): Self = StObject.set(x, "marginheight", value.asInstanceOf[js.Any])
    
    inline def setMarginheightUndefined: Self = StObject.set(x, "marginheight", js.undefined)
    
    inline def setMarginwidth(value: Double): Self = StObject.set(x, "marginwidth", value.asInstanceOf[js.Any])
    
    inline def setMarginwidthUndefined: Self = StObject.set(x, "marginwidth", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReferrerpolicy(value: HTMLAttributeReferrerPolicy): Self = StObject.set(x, "referrerpolicy", value.asInstanceOf[js.Any])
    
    inline def setReferrerpolicyUndefined: Self = StObject.set(x, "referrerpolicy", js.undefined)
    
    inline def setSandbox(value: String): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
    
    inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
    
    inline def setScrolling(value: String): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
    
    inline def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
    
    inline def setSeamless(value: Boolean): Self = StObject.set(x, "seamless", value.asInstanceOf[js.Any])
    
    inline def setSeamlessUndefined: Self = StObject.set(x, "seamless", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setSrcdoc(value: String): Self = StObject.set(x, "srcdoc", value.asInstanceOf[js.Any])
    
    inline def setSrcdocUndefined: Self = StObject.set(x, "srcdoc", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
