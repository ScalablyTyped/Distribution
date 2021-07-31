package typings.wixUiCore.srcProtractorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-ui-core/src/protractor", "WebElementPromise")
@js.native
class WebElementPromise protected ()
  extends typings.seleniumWebdriver.mod.WebElementPromise {
  /**
    * @param {!WebDriver} driver The parent WebDriver instance for this
    *     element.
    * @param {!Promise<!WebElement>} el A promise
    *     that will resolve to the promised element.
    */
  def this(
    driver: typings.seleniumWebdriver.mod.WebDriver,
    el: js.Promise[typings.seleniumWebdriver.mod.WebElement]
  ) = this()
}
