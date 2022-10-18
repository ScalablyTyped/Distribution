package typings.uikit

import typings.uikit.distJsUikitMod.Plugin
import typings.uikit.distJsUikitMod.UIkit.Icon_
import typings.uikit.distJsUikitMod.UIkit.Modal_
import typings.uikit.distJsUikitMod.UIkit.UIkitAccordionElement
import typings.uikit.distJsUikitMod.UIkit.UIkitAccordionOptions
import typings.uikit.distJsUikitMod.UIkit.UIkitAlertElement
import typings.uikit.distJsUikitMod.UIkit.UIkitAlertOptions
import typings.uikit.distJsUikitMod.UIkit.UIkitCountdownElement
import typings.uikit.distJsUikitMod.UIkit.UIkitCountdownOptions
import typings.uikit.distJsUikitMod.UIkit.UIkitCoverOptions
import typings.uikit.distJsUikitMod.UIkit.UIkitDropElement
import typings.uikit.distJsUikitMod.UIkit.UIkitDropOptions
import typings.uikit.distJsUikitMod.UIkit.UIkitDropdownElement
import typings.uikit.distJsUikitMod.UIkit.UIkitDropdownOptions
import typings.uikit.distJsUikitMod.UIkit.UIkitFilterOptions
import typings.uikit.distJsUikitMod.UIkit.UIkitFormOptions
import typings.uikit.distJsUikitMod.UIkit.UIkitGridOptions
import typings.uikit.distJsUikitMod.UIkit.UIkitHeightMatchOptions
import typings.uikit.distJsUikitMod.UIkit.UIkitIconOptions
import typings.uikit.distJsUikitMod.UIkit.UIkitImageOptions
import typings.uikit.distJsUikitMod.UIkit.UIkitLeaderOptions
import typings.uikit.distJsUikitMod.UIkit.UIkitLightboxElement
import typings.uikit.distJsUikitMod.UIkit.UIkitLightboxOptions
import typings.uikit.distJsUikitMod.UIkit.UIkitLightboxPanelElement
import typings.uikit.distJsUikitMod.UIkit.UIkitLightboxPanelOptions
import typings.uikit.distJsUikitMod.UIkit.UIkitMarginOptions
import typings.uikit.distJsUikitMod.UIkit.UIkitModalElement
import typings.uikit.distJsUikitMod.UIkit.UIkitModalOptions
import typings.uikit.distJsUikitMod.UIkit.UIkitNavElement
import typings.uikit.distJsUikitMod.UIkit.UIkitNavOptions
import typings.uikit.distJsUikitMod.UIkit.UIkitNavbarOptions
import typings.uikit.distJsUikitMod.UIkit.UIkitNotificationElement
import typings.uikit.distJsUikitMod.UIkit.UIkitNotificationOptions
import typings.uikit.distJsUikitMod.UIkit.UIkitOffcanvasElement
import typings.uikit.distJsUikitMod.UIkit.UIkitOffcanvasOptions
import typings.uikit.distJsUikitMod.UIkit.UIkitParallaxOptions
import typings.uikit.distJsUikitMod.UIkit.UIkitScrollElement
import typings.uikit.distJsUikitMod.UIkit.UIkitScrollOptions
import typings.uikit.distJsUikitMod.UIkit.UIkitScrollspyNavOptions
import typings.uikit.distJsUikitMod.UIkit.UIkitScrollspyOptions
import typings.uikit.distJsUikitMod.UIkit.UIkitSliderElement
import typings.uikit.distJsUikitMod.UIkit.UIkitSliderOptions
import typings.uikit.distJsUikitMod.UIkit.UIkitSlidershowElement
import typings.uikit.distJsUikitMod.UIkit.UIkitSlideshowOptions
import typings.uikit.distJsUikitMod.UIkit.UIkitSortableOptions
import typings.uikit.distJsUikitMod.UIkit.UIkitStickyOptions
import typings.uikit.distJsUikitMod.UIkit.UIkitSvgOptions
import typings.uikit.distJsUikitMod.UIkit.UIkitSwitcherElement
import typings.uikit.distJsUikitMod.UIkit.UIkitSwitcherOptions
import typings.uikit.distJsUikitMod.UIkit.UIkitSwiterOptions
import typings.uikit.distJsUikitMod.UIkit.UIkitTabElement
import typings.uikit.distJsUikitMod.UIkit.UIkitTabOptions
import typings.uikit.distJsUikitMod.UIkit.UIkitToggleElement
import typings.uikit.distJsUikitMod.UIkit.UIkitToggleOptions
import typings.uikit.distJsUikitMod.UIkit.UIkitTooltipElement
import typings.uikit.distJsUikitMod.UIkit.UIkitTooltipOptions
import typings.uikit.distJsUikitMod.UIkit.UIkitUploadOptions
import typings.uikit.distJsUikitMod.UIkit.UIkitVideoOptions
import typings.uikit.distJsUikitMod.UIkitElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cancel extends StObject {
    
    var cancel: String
    
    var ok: String
  }
  object Cancel {
    
    inline def apply(cancel: String, ok: String): Cancel = {
      val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cancel]
    }
    
    extension [Self <: Cancel](x: Self) {
      
      inline def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setOk(value: String): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    }
  }
  
  trait Svg extends StObject {
    
    var svg: js.Promise[Any]
  }
  object Svg {
    
    inline def apply(svg: js.Promise[Any]): Svg = {
      val __obj = js.Dynamic.literal(svg = svg.asInstanceOf[js.Any])
      __obj.asInstanceOf[Svg]
    }
    
    extension [Self <: Svg](x: Self) {
      
      inline def setSvg(value: js.Promise[Any]): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofUIkit extends StObject {
    
    // Core
    def accordion(element: UIkitElement): UIkitAccordionElement = js.native
    def accordion(element: UIkitElement, options: UIkitAccordionOptions): UIkitAccordionElement = js.native
    
    def alert(element: UIkitElement): UIkitAlertElement = js.native
    def alert(element: UIkitElement, options: UIkitAlertOptions): UIkitAlertElement = js.native
    
    val component: js.Object = js.native
    
    def countdown(element: UIkitElement): UIkitCountdownElement = js.native
    def countdown(element: UIkitElement, options: UIkitCountdownOptions): UIkitCountdownElement = js.native
    
    def cover(element: UIkitElement): Unit = js.native
    def cover(element: UIkitElement, options: UIkitCoverOptions): Unit = js.native
    
    val data: String = js.native
    
    def drop(element: UIkitElement): UIkitDropElement = js.native
    def drop(element: UIkitElement, options: UIkitDropOptions): UIkitDropElement = js.native
    
    def dropdown(element: UIkitElement): UIkitDropdownElement = js.native
    def dropdown(element: UIkitElement, options: UIkitDropdownOptions): UIkitDropdownElement = js.native
    
    val extend: js.Object = js.native
    
    def filter(element: UIkitElement): Unit = js.native
    def filter(element: UIkitElement, options: UIkitFilterOptions): Unit = js.native
    
    def formCustom(element: UIkitElement): Unit = js.native
    def formCustom(element: UIkitElement, options: UIkitFormOptions): Unit = js.native
    
    def grid(element: UIkitElement): Unit = js.native
    def grid(element: UIkitElement, options: UIkitGridOptions): Unit = js.native
    
    def heightMatch(element: UIkitElement): Unit = js.native
    def heightMatch(element: UIkitElement, options: UIkitHeightMatchOptions): Unit = js.native
    
    def icon(element: UIkitElement): Svg = js.native
    def icon(element: UIkitElement, options: UIkitIconOptions): Svg = js.native
    @JSName("icon")
    val icon_Original: Icon_ = js.native
    
    def image(element: UIkitElement): Unit = js.native
    def image(element: UIkitElement, options: UIkitImageOptions): Unit = js.native
    
    def leader(element: UIkitElement): Unit = js.native
    def leader(element: UIkitElement, options: UIkitLeaderOptions): Unit = js.native
    
    def lightbox(element: UIkitElement): UIkitLightboxElement = js.native
    def lightbox(element: UIkitElement, options: UIkitLightboxOptions): UIkitLightboxElement = js.native
    
    def lightboxPanel(optionsOrElement: UIkitLightboxPanelOptions): UIkitLightboxPanelElement = js.native
    def lightboxPanel(optionsOrElement: UIkitElement): UIkitLightboxPanelElement = js.native
    
    def margin(element: UIkitElement): Unit = js.native
    def margin(element: UIkitElement, options: UIkitMarginOptions): Unit = js.native
    
    val mixin: js.Object = js.native
    
    def modal(element: UIkitElement): UIkitModalElement = js.native
    def modal(element: UIkitElement, options: UIkitModalOptions): UIkitModalElement = js.native
    @JSName("modal")
    val modal_Original: Modal_ = js.native
    
    def nav(element: UIkitElement): UIkitNavElement = js.native
    def nav(element: UIkitElement, options: UIkitNavOptions): UIkitNavElement = js.native
    
    def navbar(element: UIkitElement): Unit = js.native
    def navbar(element: UIkitElement, options: UIkitNavbarOptions): Unit = js.native
    
    // Components
    def notification(message: String): UIkitNotificationElement = js.native
    def notification(message: String, optionsOrStatus: String): UIkitNotificationElement = js.native
    def notification(message: String, optionsOrStatus: UIkitNotificationOptions): UIkitNotificationElement = js.native
    // Components
    def notification(options: UIkitNotificationOptions): UIkitNotificationElement = js.native
    
    def offcanvas(element: UIkitElement): UIkitOffcanvasElement = js.native
    def offcanvas(element: UIkitElement, options: UIkitOffcanvasOptions): UIkitOffcanvasElement = js.native
    
    val options: js.Object = js.native
    
    def parallax(element: UIkitElement): Unit = js.native
    def parallax(element: UIkitElement, options: UIkitParallaxOptions): Unit = js.native
    
    val prefix: String = js.native
    
    def scroll(element: UIkitElement): UIkitScrollElement = js.native
    def scroll(element: UIkitElement, options: UIkitScrollOptions): UIkitScrollElement = js.native
    
    def scrollspy(element: UIkitElement): Unit = js.native
    def scrollspy(element: UIkitElement, options: UIkitScrollspyOptions): Unit = js.native
    
    def scrollspyNav(element: UIkitElement): Unit = js.native
    def scrollspyNav(element: UIkitElement, options: UIkitScrollspyNavOptions): Unit = js.native
    
    def slider(element: UIkitElement): UIkitSliderElement = js.native
    def slider(element: UIkitElement, options: UIkitSliderOptions): UIkitSliderElement = js.native
    
    def slideshow(element: UIkitElement): UIkitSlidershowElement = js.native
    def slideshow(element: UIkitElement, options: UIkitSlideshowOptions): UIkitSlidershowElement = js.native
    
    def sortable(element: UIkitElement): Unit = js.native
    def sortable(element: UIkitElement, options: UIkitSortableOptions): Unit = js.native
    
    def sticky(element: UIkitElement): Unit = js.native
    def sticky(element: UIkitElement, options: UIkitStickyOptions): Unit = js.native
    
    def svg(element: UIkitElement): Svg = js.native
    def svg(element: UIkitElement, options: UIkitSvgOptions): Svg = js.native
    
    def switcher(element: UIkitElement): UIkitSwitcherElement = js.native
    def switcher(element: UIkitElement, options: UIkitSwitcherOptions | UIkitSwiterOptions): UIkitSwitcherElement = js.native
    
    def tab(element: UIkitElement): UIkitTabElement = js.native
    def tab(element: UIkitElement, options: UIkitTabOptions): UIkitTabElement = js.native
    
    def toggle(element: UIkitElement): UIkitToggleElement = js.native
    def toggle(element: UIkitElement, options: UIkitToggleOptions): UIkitToggleElement = js.native
    
    def tooltip(element: UIkitElement): UIkitTooltipElement = js.native
    def tooltip(element: UIkitElement, options: UIkitTooltipOptions): UIkitTooltipElement = js.native
    
    val update: js.Object = js.native
    
    def upload(element: UIkitElement): Unit = js.native
    def upload(element: UIkitElement, options: UIkitUploadOptions): Unit = js.native
    
    def use(plugin: Plugin): /* import warning: importer.ImportType#apply Failed type conversion: typeof UIkit */ js.Any = js.native
    
    val util: js.Object = js.native
    
    val version: String = js.native
    
    def video(element: UIkitElement): Unit = js.native
    def video(element: UIkitElement, options: UIkitVideoOptions): Unit = js.native
  }
}
