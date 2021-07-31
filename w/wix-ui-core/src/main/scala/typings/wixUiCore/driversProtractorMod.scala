package typings.wixUiCore

import typings.protractor.mod.ElementFinder
import typings.wixUiCore.badgeProtractorDriverMod.BadgeDriver
import typings.wixUiCore.baseDriverProtractorMod.DriverFactory
import typings.wixUiCore.buttonProtractorDriverMod.ButtonDriver
import typings.wixUiCore.checkboxProtractorDriverMod.CheckboxDriver
import typings.wixUiCore.circularProgressBarProtractorDriverMod.CircularProgressBarDriver
import typings.wixUiCore.dividerProtractorDriverMod.DividerDriver
import typings.wixUiCore.dropdownContentProtractorDriverMod.DropdownContentDriver
import typings.wixUiCore.dropdownOptionProtractorDriverMod.DropdownOptionDriver
import typings.wixUiCore.dropdownProtractorDriverMod.DropdownDriver
import typings.wixUiCore.inputProtractorDriverMod.InputDriver
import typings.wixUiCore.inputWithOptionsProtractorDriverMod.InputWithOptionsDriver
import typings.wixUiCore.labelProtractorDriverMod.LabelDriver
import typings.wixUiCore.labelWithOptionsProtractorDriverMod.LabelWithOptionsDriver
import typings.wixUiCore.linearProgressBarProtractorDriverMod.LinearProgressBarDriver
import typings.wixUiCore.paginationProtractorDriverMod.PaginationDriver
import typings.wixUiCore.popoverProtractorDriverMod.PopoverDriver
import typings.wixUiCore.radioButtonProtractorDriverMod.RadioButtonDriver
import typings.wixUiCore.sliderProtractorDriverMod.SliderDriver
import typings.wixUiCore.thumbnailProtractorDriverMod.ThumbnailDriver
import typings.wixUiCore.timePickerProtractorDriverMod.TimePickerDriver
import typings.wixUiCore.toggleSwitchProtractorDriverMod.ToggleSwitchDriver
import typings.wixUiCore.tooltipProtractorDriverMod.TooltipDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object driversProtractorMod {
  
  @JSImport("wix-ui-core/drivers/protractor", "NavStepperDriver")
  @js.native
  class NavStepperDriver protected ()
    extends typings.wixUiCore.navStepperProtractorDriverMod.NavStepperDriver {
    def this(component: ElementFinder) = this()
  }
  
  @JSImport("wix-ui-core/drivers/protractor", "addressInputDriverFactory")
  @js.native
  val addressInputDriverFactory: DriverFactory[InputWithOptionsDriver] = js.native
  
  @JSImport("wix-ui-core/drivers/protractor", "autocompleteDriverFactory")
  @js.native
  val autocompleteDriverFactory: DriverFactory[InputWithOptionsDriver] = js.native
  
  @JSImport("wix-ui-core/drivers/protractor", "badgeDriverFactory")
  @js.native
  val badgeDriverFactory: DriverFactory[BadgeDriver] = js.native
  
  @JSImport("wix-ui-core/drivers/protractor", "buttonDriverFactory")
  @js.native
  val buttonDriverFactory: DriverFactory[ButtonDriver] = js.native
  
  @JSImport("wix-ui-core/drivers/protractor", "checkboxDriverFactory")
  @js.native
  val checkboxDriverFactory: DriverFactory[CheckboxDriver] = js.native
  
  @JSImport("wix-ui-core/drivers/protractor", "circularProgressBarDriverFactory")
  @js.native
  val circularProgressBarDriverFactory: DriverFactory[CircularProgressBarDriver] = js.native
  
  @JSImport("wix-ui-core/drivers/protractor", "dividerDriverFactory")
  @js.native
  val dividerDriverFactory: DriverFactory[DividerDriver] = js.native
  
  @JSImport("wix-ui-core/drivers/protractor", "dropdownContentDriverFactory")
  @js.native
  val dropdownContentDriverFactory: DriverFactory[DropdownContentDriver] = js.native
  
  @JSImport("wix-ui-core/drivers/protractor", "dropdownDriverFactory")
  @js.native
  val dropdownDriverFactory: DriverFactory[DropdownDriver] = js.native
  
  @JSImport("wix-ui-core/drivers/protractor", "dropdownOptionDriverFactory")
  @js.native
  val dropdownOptionDriverFactory: DriverFactory[DropdownOptionDriver] = js.native
  
  @JSImport("wix-ui-core/drivers/protractor", "inputDriverFactory")
  @js.native
  val inputDriverFactory: DriverFactory[InputDriver] = js.native
  
  @JSImport("wix-ui-core/drivers/protractor", "inputWithOptionsDriverFactory")
  @js.native
  val inputWithOptionsDriverFactory: DriverFactory[InputWithOptionsDriver] = js.native
  
  @JSImport("wix-ui-core/drivers/protractor", "labelDriverFactory")
  @js.native
  val labelDriverFactory: DriverFactory[LabelDriver] = js.native
  
  @JSImport("wix-ui-core/drivers/protractor", "labelWithOptionsDriverFactory")
  @js.native
  val labelWithOptionsDriverFactory: DriverFactory[LabelWithOptionsDriver] = js.native
  
  @JSImport("wix-ui-core/drivers/protractor", "linearProgressBarDriverFactory")
  @js.native
  val linearProgressBarDriverFactory: DriverFactory[LinearProgressBarDriver] = js.native
  
  @JSImport("wix-ui-core/drivers/protractor", "navStepperDriverFactory")
  @js.native
  val navStepperDriverFactory: DriverFactory[typings.wixUiCore.navStepperProtractorDriverMod.NavStepperDriver] = js.native
  
  @JSImport("wix-ui-core/drivers/protractor", "paginationDriverFactory")
  @js.native
  val paginationDriverFactory: DriverFactory[PaginationDriver] = js.native
  
  @JSImport("wix-ui-core/drivers/protractor", "popoverDriverFactory")
  @js.native
  val popoverDriverFactory: DriverFactory[PopoverDriver] = js.native
  
  @JSImport("wix-ui-core/drivers/protractor", "radioButtonDriverFactory")
  @js.native
  val radioButtonDriverFactory: DriverFactory[RadioButtonDriver] = js.native
  
  @JSImport("wix-ui-core/drivers/protractor", "sliderDriverFactory")
  @js.native
  val sliderDriverFactory: DriverFactory[SliderDriver] = js.native
  
  @JSImport("wix-ui-core/drivers/protractor", "thumbnailDriverFactory")
  @js.native
  val thumbnailDriverFactory: DriverFactory[ThumbnailDriver] = js.native
  
  @JSImport("wix-ui-core/drivers/protractor", "timePickerDriverFactory")
  @js.native
  val timePickerDriverFactory: DriverFactory[TimePickerDriver] = js.native
  
  @JSImport("wix-ui-core/drivers/protractor", "toggleSwitchDriverFactory")
  @js.native
  val toggleSwitchDriverFactory: DriverFactory[ToggleSwitchDriver] = js.native
  
  @JSImport("wix-ui-core/drivers/protractor", "tooltipDriverFactory")
  @js.native
  val tooltipDriverFactory: DriverFactory[TooltipDriver] = js.native
}
