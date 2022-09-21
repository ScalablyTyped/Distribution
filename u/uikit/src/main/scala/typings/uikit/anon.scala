package typings.uikit

import typings.uikit.uikitMod.Plugin
import typings.uikit.uikitMod.UIkit.Icon_
import typings.uikit.uikitMod.UIkit.Modal_
import typings.uikit.uikitMod.UIkit.UIkitAccordionElement
import typings.uikit.uikitMod.UIkit.UIkitAccordionOptions
import typings.uikit.uikitMod.UIkit.UIkitAlertElement
import typings.uikit.uikitMod.UIkit.UIkitAlertOptions
import typings.uikit.uikitMod.UIkit.UIkitCountdownElement
import typings.uikit.uikitMod.UIkit.UIkitCountdownOptions
import typings.uikit.uikitMod.UIkit.UIkitCoverOptions
import typings.uikit.uikitMod.UIkit.UIkitDropElement
import typings.uikit.uikitMod.UIkit.UIkitDropOptions
import typings.uikit.uikitMod.UIkit.UIkitDropdownElement
import typings.uikit.uikitMod.UIkit.UIkitDropdownOptions
import typings.uikit.uikitMod.UIkit.UIkitFilterOptions
import typings.uikit.uikitMod.UIkit.UIkitFormOptions
import typings.uikit.uikitMod.UIkit.UIkitGridOptions
import typings.uikit.uikitMod.UIkit.UIkitHeightMatchOptions
import typings.uikit.uikitMod.UIkit.UIkitIconOptions
import typings.uikit.uikitMod.UIkit.UIkitImageOptions
import typings.uikit.uikitMod.UIkit.UIkitLeaderOptions
import typings.uikit.uikitMod.UIkit.UIkitLightboxElement
import typings.uikit.uikitMod.UIkit.UIkitLightboxOptions
import typings.uikit.uikitMod.UIkit.UIkitLightboxPanelElement
import typings.uikit.uikitMod.UIkit.UIkitLightboxPanelOptions
import typings.uikit.uikitMod.UIkit.UIkitMarginOptions
import typings.uikit.uikitMod.UIkit.UIkitModalElement
import typings.uikit.uikitMod.UIkit.UIkitModalOptions
import typings.uikit.uikitMod.UIkit.UIkitNavElement
import typings.uikit.uikitMod.UIkit.UIkitNavOptions
import typings.uikit.uikitMod.UIkit.UIkitNavbarOptions
import typings.uikit.uikitMod.UIkit.UIkitNotificationElement
import typings.uikit.uikitMod.UIkit.UIkitNotificationOptions
import typings.uikit.uikitMod.UIkit.UIkitOffcanvasElement
import typings.uikit.uikitMod.UIkit.UIkitOffcanvasOptions
import typings.uikit.uikitMod.UIkit.UIkitParallaxOptions
import typings.uikit.uikitMod.UIkit.UIkitScrollElement
import typings.uikit.uikitMod.UIkit.UIkitScrollOptions
import typings.uikit.uikitMod.UIkit.UIkitScrollspyNavOptions
import typings.uikit.uikitMod.UIkit.UIkitScrollspyOptions
import typings.uikit.uikitMod.UIkit.UIkitSliderElement
import typings.uikit.uikitMod.UIkit.UIkitSliderOptions
import typings.uikit.uikitMod.UIkit.UIkitSlidershowElement
import typings.uikit.uikitMod.UIkit.UIkitSlideshowOptions
import typings.uikit.uikitMod.UIkit.UIkitSortableOptions
import typings.uikit.uikitMod.UIkit.UIkitStickyOptions
import typings.uikit.uikitMod.UIkit.UIkitSvgOptions
import typings.uikit.uikitMod.UIkit.UIkitSwitcherElement
import typings.uikit.uikitMod.UIkit.UIkitSwitcherOptions
import typings.uikit.uikitMod.UIkit.UIkitSwiterOptions
import typings.uikit.uikitMod.UIkit.UIkitTabElement
import typings.uikit.uikitMod.UIkit.UIkitTabOptions
import typings.uikit.uikitMod.UIkit.UIkitToggleElement
import typings.uikit.uikitMod.UIkit.UIkitToggleOptions
import typings.uikit.uikitMod.UIkit.UIkitTooltipElement
import typings.uikit.uikitMod.UIkit.UIkitTooltipOptions
import typings.uikit.uikitMod.UIkit.UIkitUploadOptions
import typings.uikit.uikitMod.UIkit.UIkitVideoOptions
import typings.uikit.uikitMod.UIkitElement
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
