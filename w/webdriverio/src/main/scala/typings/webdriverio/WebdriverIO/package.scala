package typings.webdriverio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WebdriverIO {
  type HooksArray = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof std.Pick<webdriverio.WebdriverIO.HookFunctions, 'onPrepare' | 'onComplete' | 'before' | 'after' | 'beforeSession' | 'afterSession'> ]: webdriverio.WebdriverIO.HookFunctions[K] | std.Array<webdriverio.WebdriverIO.HookFunctions[K]>}
    */ typings.webdriverio.webdriverioStrings._HooksArray with js.Any
  type MultiRemoteCapabilities = org.scalablytyped.runtime.StringDictionary[typings.webdriverio.AnonCapabilities]
  type MultiRemoteOptions = org.scalablytyped.runtime.StringDictionary[typings.webdriver.WebDriver.DesiredCapabilities]
  type TouchActions = java.lang.String | typings.webdriverio.WebdriverIO.TouchAction | js.Array[typings.webdriverio.WebdriverIO.TouchAction]
  type _Hooks = typings.std.Omit[
    typings.webdriverio.WebdriverIO.HookFunctions, 
    typings.webdriverio.webdriverioStrings.onPrepare | typings.webdriverio.webdriverioStrings.onComplete | typings.webdriverio.webdriverioStrings.before | typings.webdriverio.webdriverioStrings.after | typings.webdriverio.webdriverioStrings.beforeSession | typings.webdriverio.webdriverioStrings.afterSession
  ]
}
