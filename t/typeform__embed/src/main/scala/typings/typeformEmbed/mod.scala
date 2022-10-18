package typings.typeformEmbed

import typings.typeformEmbed.typesFactoriesCreatePopoverCreatePopoverMod.Popover
import typings.typeformEmbed.typesFactoriesCreatePopoverPopoverOptionsMod.PopoverOptions
import typings.typeformEmbed.typesFactoriesCreatePopupCreatePopupMod.Popup
import typings.typeformEmbed.typesFactoriesCreatePopupPopupOptionsMod.PopupOptions
import typings.typeformEmbed.typesFactoriesCreateSidetabCreateSidetabMod.Sidetab
import typings.typeformEmbed.typesFactoriesCreateSidetabSidetabOptionsMod.SidetabOptions
import typings.typeformEmbed.typesFactoriesCreateSliderCreateSliderMod.Slider
import typings.typeformEmbed.typesFactoriesCreateSliderSliderOptionsMod.SliderOptions
import typings.typeformEmbed.typesFactoriesCreateWidgetCreateWidgetMod.Widget
import typings.typeformEmbed.typesFactoriesCreateWidgetWidgetOptionsMod.WidgetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@typeform/embed", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPopover(formId: String): Popover = ^.asInstanceOf[js.Dynamic].applyDynamic("createPopover")(formId.asInstanceOf[js.Any]).asInstanceOf[Popover]
  inline def createPopover(formId: String, userOptions: PopoverOptions): Popover = (^.asInstanceOf[js.Dynamic].applyDynamic("createPopover")(formId.asInstanceOf[js.Any], userOptions.asInstanceOf[js.Any])).asInstanceOf[Popover]
  
  inline def createPopup(formId: String): Popup = ^.asInstanceOf[js.Dynamic].applyDynamic("createPopup")(formId.asInstanceOf[js.Any]).asInstanceOf[Popup]
  inline def createPopup(formId: String, userOptions: PopupOptions): Popup = (^.asInstanceOf[js.Dynamic].applyDynamic("createPopup")(formId.asInstanceOf[js.Any], userOptions.asInstanceOf[js.Any])).asInstanceOf[Popup]
  
  inline def createSidetab(formId: String): Sidetab = ^.asInstanceOf[js.Dynamic].applyDynamic("createSidetab")(formId.asInstanceOf[js.Any]).asInstanceOf[Sidetab]
  inline def createSidetab(formId: String, userOptions: SidetabOptions): Sidetab = (^.asInstanceOf[js.Dynamic].applyDynamic("createSidetab")(formId.asInstanceOf[js.Any], userOptions.asInstanceOf[js.Any])).asInstanceOf[Sidetab]
  
  inline def createSlider(formId: String): Slider = ^.asInstanceOf[js.Dynamic].applyDynamic("createSlider")(formId.asInstanceOf[js.Any]).asInstanceOf[Slider]
  inline def createSlider(formId: String, userOptions: SliderOptions): Slider = (^.asInstanceOf[js.Dynamic].applyDynamic("createSlider")(formId.asInstanceOf[js.Any], userOptions.asInstanceOf[js.Any])).asInstanceOf[Slider]
  
  inline def createWidget(formId: String, options: WidgetOptions): Widget = (^.asInstanceOf[js.Dynamic].applyDynamic("createWidget")(formId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Widget]
}
