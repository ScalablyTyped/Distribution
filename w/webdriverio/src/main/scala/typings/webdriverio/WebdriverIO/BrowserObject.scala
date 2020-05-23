package typings.webdriverio.WebdriverIO

import typings.webdriver.AsyncClient
import typings.webdriver.WebDriver.ClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.webdriverio.WebdriverIO.Browser because var conflicts: config, options. Inlined  */ @js.native
trait BrowserObject
  extends typings.webdriverio.WebdriverIOAsync.Browser
     with ClientOptions
     with AsyncClient

