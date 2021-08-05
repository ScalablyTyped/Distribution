package typings.wixUiCore.srcProtractorMod

import typings.protractor.locatorsMod.Locator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-ui-core/src/protractor", "ElementFinder")
@js.native
class ElementFinder protected ()
  extends typings.protractor.elementMod.ElementFinder {
  def this(
    browser_ : typings.protractor.browserMod.ProtractorBrowser,
    elementArrayFinder: typings.protractor.elementMod.ElementArrayFinder
  ) = this()
}
/* static members */
object ElementFinder {
  
  @JSImport("wix-ui-core/src/protractor", "ElementFinder")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromWebElement_(
    browser: typings.protractor.browserMod.ProtractorBrowser,
    webElem: typings.seleniumWebdriver.mod.WebElement
  ): typings.protractor.elementMod.ElementFinder = (^.asInstanceOf[js.Dynamic].applyDynamic("fromWebElement_")(browser.asInstanceOf[js.Any], webElem.asInstanceOf[js.Any])).asInstanceOf[typings.protractor.elementMod.ElementFinder]
  inline def fromWebElement_(
    browser: typings.protractor.browserMod.ProtractorBrowser,
    webElem: typings.seleniumWebdriver.mod.WebElement,
    locator: Locator
  ): typings.protractor.elementMod.ElementFinder = (^.asInstanceOf[js.Dynamic].applyDynamic("fromWebElement_")(browser.asInstanceOf[js.Any], webElem.asInstanceOf[js.Any], locator.asInstanceOf[js.Any])).asInstanceOf[typings.protractor.elementMod.ElementFinder]
}
