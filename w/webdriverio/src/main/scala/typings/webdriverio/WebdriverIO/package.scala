package typings.webdriverio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WebdriverIO {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Omit
  import typings.webdriver.WebDriver.DesiredCapabilities
  import typings.webdriverio.Anon_Capabilities
  import typings.webdriverio.webdriverioStrings.after
  import typings.webdriverio.webdriverioStrings.afterSession
  import typings.webdriverio.webdriverioStrings.before
  import typings.webdriverio.webdriverioStrings.beforeSession
  import typings.webdriverio.webdriverioStrings.onComplete
  import typings.webdriverio.webdriverioStrings.onPrepare

  type MultiRemoteCapabilities = StringDictionary[Anon_Capabilities]
  type MultiRemoteOptions = StringDictionary[DesiredCapabilities]
  type TouchActions = String | TouchAction | js.Array[TouchAction]
  type _Hooks = Omit[
    HookFunctions, 
    onPrepare | onComplete | before | after | beforeSession | afterSession
  ]
  type _HooksArray = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof std.Pick<webdriverio.WebdriverIO.HookFunctions, 'onPrepare' | 'onComplete' | 'before' | 'after' | 'beforeSession' | 'afterSession'> ]: webdriverio.WebdriverIO.HookFunctions[K] | std.Array<webdriverio.WebdriverIO.HookFunctions[K]>}
    */ typings.webdriverio.webdriverioStrings._HooksArray with js.Any
}
