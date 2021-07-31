package typings.wixUiCore.protractorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-ui-core/dist/src/protractor", "ProtractorBrowser")
@js.native
class ProtractorBrowser protected ()
  extends typings.protractor.browserMod.ProtractorBrowser {
  def this(webdriverInstance: typings.seleniumWebdriver.mod.WebDriver) = this()
  def this(webdriverInstance: typings.seleniumWebdriver.mod.WebDriver, opt_baseUrl: String) = this()
  def this(
    webdriverInstance: typings.seleniumWebdriver.mod.WebDriver,
    opt_baseUrl: String,
    opt_rootElement: String
  ) = this()
  def this(
    webdriverInstance: typings.seleniumWebdriver.mod.WebDriver,
    opt_baseUrl: String,
    opt_rootElement: js.Promise[String]
  ) = this()
  def this(
    webdriverInstance: typings.seleniumWebdriver.mod.WebDriver,
    opt_baseUrl: Unit,
    opt_rootElement: String
  ) = this()
  def this(
    webdriverInstance: typings.seleniumWebdriver.mod.WebDriver,
    opt_baseUrl: Unit,
    opt_rootElement: js.Promise[String]
  ) = this()
  def this(
    webdriverInstance: typings.seleniumWebdriver.mod.WebDriver,
    opt_baseUrl: String,
    opt_rootElement: String,
    opt_untrackOutstandingTimeouts: Boolean
  ) = this()
  def this(
    webdriverInstance: typings.seleniumWebdriver.mod.WebDriver,
    opt_baseUrl: String,
    opt_rootElement: js.Promise[String],
    opt_untrackOutstandingTimeouts: Boolean
  ) = this()
  def this(
    webdriverInstance: typings.seleniumWebdriver.mod.WebDriver,
    opt_baseUrl: String,
    opt_rootElement: Unit,
    opt_untrackOutstandingTimeouts: Boolean
  ) = this()
  def this(
    webdriverInstance: typings.seleniumWebdriver.mod.WebDriver,
    opt_baseUrl: Unit,
    opt_rootElement: String,
    opt_untrackOutstandingTimeouts: Boolean
  ) = this()
  def this(
    webdriverInstance: typings.seleniumWebdriver.mod.WebDriver,
    opt_baseUrl: Unit,
    opt_rootElement: js.Promise[String],
    opt_untrackOutstandingTimeouts: Boolean
  ) = this()
  def this(
    webdriverInstance: typings.seleniumWebdriver.mod.WebDriver,
    opt_baseUrl: Unit,
    opt_rootElement: Unit,
    opt_untrackOutstandingTimeouts: Boolean
  ) = this()
  def this(
    webdriverInstance: typings.seleniumWebdriver.mod.WebDriver,
    opt_baseUrl: String,
    opt_rootElement: String,
    opt_untrackOutstandingTimeouts: Boolean,
    opt_blockingProxyUrl: String
  ) = this()
  def this(
    webdriverInstance: typings.seleniumWebdriver.mod.WebDriver,
    opt_baseUrl: String,
    opt_rootElement: String,
    opt_untrackOutstandingTimeouts: Unit,
    opt_blockingProxyUrl: String
  ) = this()
  def this(
    webdriverInstance: typings.seleniumWebdriver.mod.WebDriver,
    opt_baseUrl: String,
    opt_rootElement: js.Promise[String],
    opt_untrackOutstandingTimeouts: Boolean,
    opt_blockingProxyUrl: String
  ) = this()
  def this(
    webdriverInstance: typings.seleniumWebdriver.mod.WebDriver,
    opt_baseUrl: String,
    opt_rootElement: js.Promise[String],
    opt_untrackOutstandingTimeouts: Unit,
    opt_blockingProxyUrl: String
  ) = this()
  def this(
    webdriverInstance: typings.seleniumWebdriver.mod.WebDriver,
    opt_baseUrl: String,
    opt_rootElement: Unit,
    opt_untrackOutstandingTimeouts: Boolean,
    opt_blockingProxyUrl: String
  ) = this()
  def this(
    webdriverInstance: typings.seleniumWebdriver.mod.WebDriver,
    opt_baseUrl: String,
    opt_rootElement: Unit,
    opt_untrackOutstandingTimeouts: Unit,
    opt_blockingProxyUrl: String
  ) = this()
  def this(
    webdriverInstance: typings.seleniumWebdriver.mod.WebDriver,
    opt_baseUrl: Unit,
    opt_rootElement: String,
    opt_untrackOutstandingTimeouts: Boolean,
    opt_blockingProxyUrl: String
  ) = this()
  def this(
    webdriverInstance: typings.seleniumWebdriver.mod.WebDriver,
    opt_baseUrl: Unit,
    opt_rootElement: String,
    opt_untrackOutstandingTimeouts: Unit,
    opt_blockingProxyUrl: String
  ) = this()
  def this(
    webdriverInstance: typings.seleniumWebdriver.mod.WebDriver,
    opt_baseUrl: Unit,
    opt_rootElement: js.Promise[String],
    opt_untrackOutstandingTimeouts: Boolean,
    opt_blockingProxyUrl: String
  ) = this()
  def this(
    webdriverInstance: typings.seleniumWebdriver.mod.WebDriver,
    opt_baseUrl: Unit,
    opt_rootElement: js.Promise[String],
    opt_untrackOutstandingTimeouts: Unit,
    opt_blockingProxyUrl: String
  ) = this()
  def this(
    webdriverInstance: typings.seleniumWebdriver.mod.WebDriver,
    opt_baseUrl: Unit,
    opt_rootElement: Unit,
    opt_untrackOutstandingTimeouts: Boolean,
    opt_blockingProxyUrl: String
  ) = this()
  def this(
    webdriverInstance: typings.seleniumWebdriver.mod.WebDriver,
    opt_baseUrl: Unit,
    opt_rootElement: Unit,
    opt_untrackOutstandingTimeouts: Unit,
    opt_blockingProxyUrl: String
  ) = this()
}
/* static members */
object ProtractorBrowser {
  
  @JSImport("wix-ui-core/dist/src/protractor", "ProtractorBrowser")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @type {ProtractorBy}
    */
  @JSImport("wix-ui-core/dist/src/protractor", "ProtractorBrowser.By")
  @js.native
  def By: typings.protractor.locatorsMod.ProtractorBy = js.native
  @scala.inline
  def By_=(x: typings.protractor.locatorsMod.ProtractorBy): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("By")(x.asInstanceOf[js.Any])
}
