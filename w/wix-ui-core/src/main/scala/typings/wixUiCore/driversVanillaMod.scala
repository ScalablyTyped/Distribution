package typings.wixUiCore

import typings.std.Element
import typings.unidriverCore.mod.UniDriver
import typings.wixUiCore.anon.AriaLabel
import typings.wixUiCore.anon.Blur
import typings.wixUiCore.anon.BlurInput
import typings.wixUiCore.anon.CheckboxDriverAt
import typings.wixUiCore.anon.ClassName
import typings.wixUiCore.anon.Click
import typings.wixUiCore.anon.ClickOutside
import typings.wixUiCore.anon.ClickTickerDown
import typings.wixUiCore.anon.ElementAny
import typings.wixUiCore.anon.Exists
import typings.wixUiCore.anon.Focus
import typings.wixUiCore.anon.GetArrowElement
import typings.wixUiCore.anon.GetElementId
import typings.wixUiCore.anon.GetForAttribute
import typings.wixUiCore.anon.GetId
import typings.wixUiCore.anon.GetOptionsCount
import typings.wixUiCore.anon.IconExists
import typings.wixUiCore.anon.IsVertical
import typings.wixUiCore.avatarUniDriverMod.AvatarDriver
import typings.wixUiCore.badgeDriverMod.BadgeDriver
import typings.wixUiCore.buttonDriverMod.ButtonDriver
import typings.wixUiCore.buttonNextUniDriverMod.ButtonNextDriver
import typings.wixUiCore.captchaUniDriverMod.CaptchaDriver
import typings.wixUiCore.circularProgressBarDriverMod.CircularProgressBarDriver
import typings.wixUiCore.imageUniDriverMod.ImageDriver
import typings.wixUiCore.linearProgressBarDriverMod.LinearProgressBarDriver
import typings.wixUiCore.loadableDriverMod.LoadableDriver
import typings.wixUiCore.mediaImageUniDriverMod.MediaImageDriver
import typings.wixUiCore.menuItemUniDriverMod.MenuItemDriver
import typings.wixUiCore.thumbnailDriverMod.ThumbnailDriver
import typings.wixUiCore.videoUniDriverMod.IVideoDriver
import typings.wixUiTestUtils.createDriverFactoryMod.ComponentFactory
import typings.wixUiTestUtils.createDriverFactoryMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object driversVanillaMod {
  
  @JSImport("wix-ui-core/drivers/vanilla", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-ui-core/drivers/vanilla", "NavStepperDriver")
  @js.native
  class NavStepperDriver protected ()
    extends typings.wixUiCore.navStepperDriverMod.NavStepperDriver {
    def this(element: Element) = this()
  }
  
  @scala.inline
  def addressInputDriverFactory(hasElementEventTrigger: typings.wixUiCore.anon.Element): Blur = ^.asInstanceOf[js.Dynamic].applyDynamic("addressInputDriverFactory")(hasElementEventTrigger.asInstanceOf[js.Any]).asInstanceOf[Blur]
  
  @scala.inline
  def autocompleteDriverFactory(hasElementEventTrigger: typings.wixUiCore.anon.Element): Click = ^.asInstanceOf[js.Dynamic].applyDynamic("autocompleteDriverFactory")(hasElementEventTrigger.asInstanceOf[js.Any]).asInstanceOf[Click]
  
  @scala.inline
  def avatarDriverFactory(base: UniDriver[js.Any]): AvatarDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("avatarDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[AvatarDriver]
  
  @scala.inline
  def badgeDriverFactory(hasElement: ComponentFactory): BadgeDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("badgeDriverFactory")(hasElement.asInstanceOf[js.Any]).asInstanceOf[BadgeDriver]
  
  @JSImport("wix-ui-core/drivers/vanilla", "buttonDriverFactory")
  @js.native
  val buttonDriverFactory: DriverFactory[ButtonDriver] = js.native
  
  @scala.inline
  def buttonNextDriverFactory(base: UniDriver[js.Any]): ButtonNextDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("buttonNextDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[ButtonNextDriver]
  
  @scala.inline
  def captchaDriverFactory(base: UniDriver[js.Any]): CaptchaDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("captchaDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[CaptchaDriver]
  
  @scala.inline
  def checkboxDriverFactory(hasElementEventTrigger: typings.wixUiCore.anon.Element): Exists = ^.asInstanceOf[js.Dynamic].applyDynamic("checkboxDriverFactory")(hasElementEventTrigger.asInstanceOf[js.Any]).asInstanceOf[Exists]
  
  @JSImport("wix-ui-core/drivers/vanilla", "circularProgressBarDriverFactory")
  @js.native
  val circularProgressBarDriverFactory: DriverFactory[CircularProgressBarDriver] = js.native
  
  @scala.inline
  def dividerDriverFactory(hasElement: ElementAny): IsVertical = ^.asInstanceOf[js.Dynamic].applyDynamic("dividerDriverFactory")(hasElement.asInstanceOf[js.Any]).asInstanceOf[IsVertical]
  
  @scala.inline
  def dropdownContentDriverFactory(hasElementEventTrigger: typings.wixUiCore.anon.Element): GetOptionsCount = ^.asInstanceOf[js.Dynamic].applyDynamic("dropdownContentDriverFactory")(hasElementEventTrigger.asInstanceOf[js.Any]).asInstanceOf[GetOptionsCount]
  
  @scala.inline
  def dropdownDriverFactory(args: js.Any): ClickOutside = ^.asInstanceOf[js.Dynamic].applyDynamic("dropdownDriverFactory")(args.asInstanceOf[js.Any]).asInstanceOf[ClickOutside]
  
  @scala.inline
  def dropdownOptionDriverFactory(hasElementEventTrigger: typings.wixUiCore.anon.Element): ClassName = ^.asInstanceOf[js.Dynamic].applyDynamic("dropdownOptionDriverFactory")(hasElementEventTrigger.asInstanceOf[js.Any]).asInstanceOf[ClassName]
  
  @scala.inline
  def iconWithOptionsDriverFactory(args: js.Any): ClickOutside = ^.asInstanceOf[js.Dynamic].applyDynamic("iconWithOptionsDriverFactory")(args.asInstanceOf[js.Any]).asInstanceOf[ClickOutside]
  
  @scala.inline
  def imageDriverFactory(base: UniDriver[js.Any]): ImageDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("imageDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[ImageDriver]
  
  @scala.inline
  def inputDriverFactory(hasElementEventTrigger: typings.wixUiCore.anon.Element): Focus = ^.asInstanceOf[js.Dynamic].applyDynamic("inputDriverFactory")(hasElementEventTrigger.asInstanceOf[js.Any]).asInstanceOf[Focus]
  
  @scala.inline
  def inputWithOptionsDriverFactory(hasElementEventTrigger: typings.wixUiCore.anon.Element): Click = ^.asInstanceOf[js.Dynamic].applyDynamic("inputWithOptionsDriverFactory")(hasElementEventTrigger.asInstanceOf[js.Any]).asInstanceOf[Click]
  
  @scala.inline
  def labelDriverFactory(hasElementEventTrigger: typings.wixUiCore.anon.Element): GetForAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("labelDriverFactory")(hasElementEventTrigger.asInstanceOf[js.Any]).asInstanceOf[GetForAttribute]
  
  @scala.inline
  def labelWithOptionsDriverFactory(hasElementEventTrigger: typings.wixUiCore.anon.Element): CheckboxDriverAt = ^.asInstanceOf[js.Dynamic].applyDynamic("labelWithOptionsDriverFactory")(hasElementEventTrigger.asInstanceOf[js.Any]).asInstanceOf[CheckboxDriverAt]
  
  @JSImport("wix-ui-core/drivers/vanilla", "linearProgressBarDriverFactory")
  @js.native
  val linearProgressBarDriverFactory: DriverFactory[LinearProgressBarDriver] = js.native
  
  @scala.inline
  def loadableDriverFactory(hasElement: ComponentFactory): LoadableDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("loadableDriverFactory")(hasElement.asInstanceOf[js.Any]).asInstanceOf[LoadableDriver]
  
  @scala.inline
  def mediaImageDriverFactory(base: UniDriver[js.Any]): MediaImageDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("mediaImageDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[MediaImageDriver]
  
  @scala.inline
  def menuItemDriverFactory(base: UniDriver[js.Any]): MenuItemDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("menuItemDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[MenuItemDriver]
  
  @JSImport("wix-ui-core/drivers/vanilla", "navStepperDriverFactory")
  @js.native
  val navStepperDriverFactory: DriverFactory[typings.wixUiCore.navStepperDriverMod.NavStepperDriver] = js.native
  
  @scala.inline
  def paginationDriverFactory(hasRootSimulate: typings.wixUiCore.anon.Element): BlurInput = ^.asInstanceOf[js.Dynamic].applyDynamic("paginationDriverFactory")(hasRootSimulate.asInstanceOf[js.Any]).asInstanceOf[BlurInput]
  
  @scala.inline
  def popoverDriverFactory(hasElementEventTrigger: typings.wixUiCore.anon.Element): GetArrowElement = ^.asInstanceOf[js.Dynamic].applyDynamic("popoverDriverFactory")(hasElementEventTrigger.asInstanceOf[js.Any]).asInstanceOf[GetArrowElement]
  
  @scala.inline
  def radioButtonDriverFactory(hasElementEventTrigger: typings.wixUiCore.anon.Element): IconExists = ^.asInstanceOf[js.Dynamic].applyDynamic("radioButtonDriverFactory")(hasElementEventTrigger.asInstanceOf[js.Any]).asInstanceOf[IconExists]
  
  @scala.inline
  def sliderDriverFactory(hasElementEventTrigger: typings.wixUiCore.anon.Element): AriaLabel = ^.asInstanceOf[js.Dynamic].applyDynamic("sliderDriverFactory")(hasElementEventTrigger.asInstanceOf[js.Any]).asInstanceOf[AriaLabel]
  
  @JSImport("wix-ui-core/drivers/vanilla", "thumbnailDriverFactory")
  @js.native
  val thumbnailDriverFactory: DriverFactory[ThumbnailDriver] = js.native
  
  @scala.inline
  def timePickerDriverFactory(hasElementEventTrigger: typings.wixUiCore.anon.Element): ClickTickerDown = ^.asInstanceOf[js.Dynamic].applyDynamic("timePickerDriverFactory")(hasElementEventTrigger.asInstanceOf[js.Any]).asInstanceOf[ClickTickerDown]
  
  @scala.inline
  def toggleSwitchDriverFactory(hasElementEventTrigger: typings.wixUiCore.anon.Element): GetId = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleSwitchDriverFactory")(hasElementEventTrigger.asInstanceOf[js.Any]).asInstanceOf[GetId]
  
  @scala.inline
  def tooltipDriverFactory(args: js.Any): GetElementId = ^.asInstanceOf[js.Dynamic].applyDynamic("tooltipDriverFactory")(args.asInstanceOf[js.Any]).asInstanceOf[GetElementId]
  
  @scala.inline
  def videoDriverFactory(base: UniDriver[js.Any]): IVideoDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("videoDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[IVideoDriver]
}
