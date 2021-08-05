package typings.wixUiCore

import typings.std.Element
import typings.wixUiCore.anon.AriaLabel
import typings.wixUiCore.anon.Blur
import typings.wixUiCore.anon.BlurInput
import typings.wixUiCore.anon.CheckboxDriverAt
import typings.wixUiCore.anon.Click
import typings.wixUiCore.anon.ClickMenuItem
import typings.wixUiCore.anon.ClickTickerDown
import typings.wixUiCore.anon.Exists
import typings.wixUiCore.anon.GetArrowElement
import typings.wixUiCore.anon.GetElementId
import typings.wixUiCore.anon.GetForAttribute
import typings.wixUiCore.anon.GetId
import typings.wixUiCore.anon.IconExists
import typings.wixUiCore.anon.IsVertical
import typings.wixUiCore.badgeDriverMod.BadgeDriver
import typings.wixUiCore.buttonDriverMod.ButtonDriver
import typings.wixUiCore.buttonNextUniDriverMod.ButtonNextDriver
import typings.wixUiCore.circularProgressBarDriverMod.CircularProgressBarDriver
import typings.wixUiCore.linearProgressBarDriverMod.LinearProgressBarDriver
import typings.wixUiCore.signatureInputUniDriverMod.SignatureInputDriver
import typings.wixUiCore.thumbnailDriverMod.ThumbnailDriver
import typings.wixUiTestUtils.enzymeEnzymeMod.WrapperData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enzymeMod {
  
  @JSImport("wix-ui-core/dist/src/testkit/enzyme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-ui-core/dist/src/testkit/enzyme", "NavStepperDriver")
  @js.native
  class NavStepperDriver protected ()
    extends typings.wixUiCore.navStepperDriverMod.NavStepperDriver {
    def this(element: Element) = this()
  }
  
  inline def addressInputTestkitFactory(obj: WrapperData): Blur = ^.asInstanceOf[js.Dynamic].applyDynamic("addressInputTestkitFactory")(obj.asInstanceOf[js.Any]).asInstanceOf[Blur]
  
  inline def autocompleteTestkitFactory(obj: WrapperData): Click = ^.asInstanceOf[js.Dynamic].applyDynamic("autocompleteTestkitFactory")(obj.asInstanceOf[js.Any]).asInstanceOf[Click]
  
  inline def buttonNextTestkitFactory(obj: WrapperData): ButtonNextDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("buttonNextTestkitFactory")(obj.asInstanceOf[js.Any]).asInstanceOf[ButtonNextDriver]
  
  inline def buttonTestkitFactory(obj: WrapperData): ButtonDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("buttonTestkitFactory")(obj.asInstanceOf[js.Any]).asInstanceOf[ButtonDriver]
  
  inline def checkboxTestkitFactory(obj: WrapperData): Exists = ^.asInstanceOf[js.Dynamic].applyDynamic("checkboxTestkitFactory")(obj.asInstanceOf[js.Any]).asInstanceOf[Exists]
  
  inline def circularProgressBarTestkitFactory(obj: WrapperData): CircularProgressBarDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("circularProgressBarTestkitFactory")(obj.asInstanceOf[js.Any]).asInstanceOf[CircularProgressBarDriver]
  
  inline def dividerTestkitFactory(obj: WrapperData): IsVertical = ^.asInstanceOf[js.Dynamic].applyDynamic("dividerTestkitFactory")(obj.asInstanceOf[js.Any]).asInstanceOf[IsVertical]
  
  inline def horizontalMenuTestkitFactory(obj: WrapperData): ClickMenuItem = ^.asInstanceOf[js.Dynamic].applyDynamic("horizontalMenuTestkitFactory")(obj.asInstanceOf[js.Any]).asInstanceOf[ClickMenuItem]
  
  inline def inputTestkitFactory(obj: WrapperData): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("inputTestkitFactory")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def labelTestkitFactory(obj: WrapperData): GetForAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("labelTestkitFactory")(obj.asInstanceOf[js.Any]).asInstanceOf[GetForAttribute]
  
  inline def labelWithOptionsTestkitFactory(obj: WrapperData): CheckboxDriverAt = ^.asInstanceOf[js.Dynamic].applyDynamic("labelWithOptionsTestkitFactory")(obj.asInstanceOf[js.Any]).asInstanceOf[CheckboxDriverAt]
  
  inline def linearProgressBarTestkitFactory(obj: WrapperData): LinearProgressBarDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("linearProgressBarTestkitFactory")(obj.asInstanceOf[js.Any]).asInstanceOf[LinearProgressBarDriver]
  
  inline def navStepperTestkitFactory(obj: WrapperData): typings.wixUiCore.navStepperDriverMod.NavStepperDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("navStepperTestkitFactory")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.wixUiCore.navStepperDriverMod.NavStepperDriver]
  
  inline def paginationTestkitFactory(obj: WrapperData): BlurInput = ^.asInstanceOf[js.Dynamic].applyDynamic("paginationTestkitFactory")(obj.asInstanceOf[js.Any]).asInstanceOf[BlurInput]
  
  inline def popoverTestkitFactory(obj: WrapperData): GetArrowElement = ^.asInstanceOf[js.Dynamic].applyDynamic("popoverTestkitFactory")(obj.asInstanceOf[js.Any]).asInstanceOf[GetArrowElement]
  
  inline def radioButtonTestkitFactory(obj: WrapperData): IconExists = ^.asInstanceOf[js.Dynamic].applyDynamic("radioButtonTestkitFactory")(obj.asInstanceOf[js.Any]).asInstanceOf[IconExists]
  
  inline def signatureInputTestkitFactory(obj: WrapperData): SignatureInputDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("signatureInputTestkitFactory")(obj.asInstanceOf[js.Any]).asInstanceOf[SignatureInputDriver]
  
  inline def sliderTestkitFactory(obj: WrapperData): AriaLabel = ^.asInstanceOf[js.Dynamic].applyDynamic("sliderTestkitFactory")(obj.asInstanceOf[js.Any]).asInstanceOf[AriaLabel]
  
  inline def stylableBadgeTestkitFactory(obj: WrapperData): BadgeDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("stylableBadgeTestkitFactory")(obj.asInstanceOf[js.Any]).asInstanceOf[BadgeDriver]
  
  inline def thumbnailTestkitFactory(obj: WrapperData): ThumbnailDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("thumbnailTestkitFactory")(obj.asInstanceOf[js.Any]).asInstanceOf[ThumbnailDriver]
  
  inline def timePickerTestkitFactory(obj: WrapperData): ClickTickerDown = ^.asInstanceOf[js.Dynamic].applyDynamic("timePickerTestkitFactory")(obj.asInstanceOf[js.Any]).asInstanceOf[ClickTickerDown]
  
  inline def toggleSwitchTestkitFactory(obj: WrapperData): GetId = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleSwitchTestkitFactory")(obj.asInstanceOf[js.Any]).asInstanceOf[GetId]
  
  inline def tooltipTestkitFactory(obj: WrapperData): GetElementId = ^.asInstanceOf[js.Dynamic].applyDynamic("tooltipTestkitFactory")(obj.asInstanceOf[js.Any]).asInstanceOf[GetElementId]
}
