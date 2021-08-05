package typings.winjs.WinJS.UI

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This API is no longer supported. Starting with the Windows Library for JavaScript 2.0 Preview, use the ILayoutSite2 interface. Represents a rendering site for an ILayout.
  **/
trait ILayoutSite extends StObject {
  
  //#region Properties
  /**
    * This API is no longer supported. Starting with the Windows Library for JavaScript 2.0 Preview, use a the ILayoutSite2 interface.
    **/
  var animationsDisabled: Boolean
  
  /**
    * This API is no longer supported. Starting with the Windows Library for JavaScript 2.0 Preview, use a the ILayoutSite2 interface.
    **/
  var itemSurface: HTMLElement
  
  /**
    * This API is no longer supported. Starting with the Windows Library for JavaScript 2.0 Preview, use a the ILayoutSite2 interface.
    **/
  var rtl: Boolean
  
  /**
    * This API is no longer supported. Starting with the Windows Library for JavaScript 2.0 Preview, use a the ILayoutSite2 interface.
    **/
  var scrollbarPos: Double
  
  /**
    * This API is no longer supported. Starting with the Windows Library for JavaScript 2.0 Preview, use a the ILayoutSite2 interface.
    **/
  var surface: HTMLElement
  
  /**
    * This API is no longer supported. Starting with the Windows Library for JavaScript 2.0 Preview, use a the ILayoutSite2 interface.
    **/
  var viewport: HTMLElement
  
  /**
    * This API is no longer supported. Starting with the Windows Library for JavaScript 2.0 Preview, use a the ILayoutSite2 interface.
    **/
  var viewportSize: js.Any
}
object ILayoutSite {
  
  inline def apply(
    animationsDisabled: Boolean,
    itemSurface: HTMLElement,
    rtl: Boolean,
    scrollbarPos: Double,
    surface: HTMLElement,
    viewport: HTMLElement,
    viewportSize: js.Any
  ): ILayoutSite = {
    val __obj = js.Dynamic.literal(animationsDisabled = animationsDisabled.asInstanceOf[js.Any], itemSurface = itemSurface.asInstanceOf[js.Any], rtl = rtl.asInstanceOf[js.Any], scrollbarPos = scrollbarPos.asInstanceOf[js.Any], surface = surface.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any], viewportSize = viewportSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILayoutSite]
  }
  
  extension [Self <: ILayoutSite](x: Self) {
    
    inline def setAnimationsDisabled(value: Boolean): Self = StObject.set(x, "animationsDisabled", value.asInstanceOf[js.Any])
    
    inline def setItemSurface(value: HTMLElement): Self = StObject.set(x, "itemSurface", value.asInstanceOf[js.Any])
    
    inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
    
    inline def setScrollbarPos(value: Double): Self = StObject.set(x, "scrollbarPos", value.asInstanceOf[js.Any])
    
    inline def setSurface(value: HTMLElement): Self = StObject.set(x, "surface", value.asInstanceOf[js.Any])
    
    inline def setViewport(value: HTMLElement): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    
    inline def setViewportSize(value: js.Any): Self = StObject.set(x, "viewportSize", value.asInstanceOf[js.Any])
  }
}
