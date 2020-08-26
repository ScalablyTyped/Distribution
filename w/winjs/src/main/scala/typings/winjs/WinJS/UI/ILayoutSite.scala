package typings.winjs.WinJS.UI

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This API is no longer supported. Starting with the Windows Library for JavaScript 2.0 Preview, use the ILayoutSite2 interface. Represents a rendering site for an ILayout.
  **/
@js.native
trait ILayoutSite extends js.Object {
  //#region Properties
  /**
    * This API is no longer supported. Starting with the Windows Library for JavaScript 2.0 Preview, use a the ILayoutSite2 interface.
    **/
  var animationsDisabled: Boolean = js.native
  /**
    * This API is no longer supported. Starting with the Windows Library for JavaScript 2.0 Preview, use a the ILayoutSite2 interface.
    **/
  var itemSurface: HTMLElement = js.native
  /**
    * This API is no longer supported. Starting with the Windows Library for JavaScript 2.0 Preview, use a the ILayoutSite2 interface.
    **/
  var rtl: Boolean = js.native
  /**
    * This API is no longer supported. Starting with the Windows Library for JavaScript 2.0 Preview, use a the ILayoutSite2 interface.
    **/
  var scrollbarPos: Double = js.native
  /**
    * This API is no longer supported. Starting with the Windows Library for JavaScript 2.0 Preview, use a the ILayoutSite2 interface.
    **/
  var surface: HTMLElement = js.native
  /**
    * This API is no longer supported. Starting with the Windows Library for JavaScript 2.0 Preview, use a the ILayoutSite2 interface.
    **/
  var viewport: HTMLElement = js.native
  /**
    * This API is no longer supported. Starting with the Windows Library for JavaScript 2.0 Preview, use a the ILayoutSite2 interface.
    **/
  var viewportSize: js.Any = js.native
}

object ILayoutSite {
  @scala.inline
  def apply(
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
  @scala.inline
  implicit class ILayoutSiteOps[Self <: ILayoutSite] (val x: Self) extends AnyVal {
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
    def setAnimationsDisabled(value: Boolean): Self = this.set("animationsDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemSurface(value: HTMLElement): Self = this.set("itemSurface", value.asInstanceOf[js.Any])
    @scala.inline
    def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollbarPos(value: Double): Self = this.set("scrollbarPos", value.asInstanceOf[js.Any])
    @scala.inline
    def setSurface(value: HTMLElement): Self = this.set("surface", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewport(value: HTMLElement): Self = this.set("viewport", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewportSize(value: js.Any): Self = this.set("viewportSize", value.asInstanceOf[js.Any])
  }
  
}

