package typings
package winjsLib.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This API is no longer supported. Starting with the Windows Library for JavaScript 2.0 Preview, use the ILayoutSite2 interface. Represents a rendering site for an ILayout.
  **/
trait ILayoutSite extends js.Object {
  //#region Properties
  /**
    * This API is no longer supported. Starting with the Windows Library for JavaScript 2.0 Preview, use a the ILayoutSite2 interface.
    **/
  var animationsDisabled: scala.Boolean
  /**
    * This API is no longer supported. Starting with the Windows Library for JavaScript 2.0 Preview, use a the ILayoutSite2 interface.
    **/
  var itemSurface: stdLib.HTMLElement
  /**
    * This API is no longer supported. Starting with the Windows Library for JavaScript 2.0 Preview, use a the ILayoutSite2 interface.
    **/
  var rtl: scala.Boolean
  /**
    * This API is no longer supported. Starting with the Windows Library for JavaScript 2.0 Preview, use a the ILayoutSite2 interface.
    **/
  var scrollbarPos: scala.Double
  /**
    * This API is no longer supported. Starting with the Windows Library for JavaScript 2.0 Preview, use a the ILayoutSite2 interface.
    **/
  var surface: stdLib.HTMLElement
  /**
    * This API is no longer supported. Starting with the Windows Library for JavaScript 2.0 Preview, use a the ILayoutSite2 interface.
    **/
  var viewport: stdLib.HTMLElement
  /**
    * This API is no longer supported. Starting with the Windows Library for JavaScript 2.0 Preview, use a the ILayoutSite2 interface.
    **/
  var viewportSize: js.Any
}

object ILayoutSite {
  @scala.inline
  def apply(
    animationsDisabled: scala.Boolean,
    itemSurface: stdLib.HTMLElement,
    rtl: scala.Boolean,
    scrollbarPos: scala.Double,
    surface: stdLib.HTMLElement,
    viewport: stdLib.HTMLElement,
    viewportSize: js.Any
  ): ILayoutSite = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("animationsDisabled")(animationsDisabled)
    __obj.updateDynamic("itemSurface")(itemSurface)
    __obj.updateDynamic("rtl")(rtl)
    __obj.updateDynamic("scrollbarPos")(scrollbarPos)
    __obj.updateDynamic("surface")(surface)
    __obj.updateDynamic("viewport")(viewport)
    __obj.updateDynamic("viewportSize")(viewportSize)
    __obj.asInstanceOf[ILayoutSite]
  }
}

