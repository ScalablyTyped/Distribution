package typings.webdriverio.webdriverioCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WebdriverIO {
  type MockOverwrite = java.lang.String | (typings.std.Record[java.lang.String, js.Any]) | typings.webdriverio.webdriverioCoreMod.WebdriverIO.MockOverwriteFunction
  type MockOverwriteFunction = js.Function2[
    /* request */ typings.webdriverio.webdriverioCoreMod.WebdriverIO.Request, 
    /* client */ typings.webdriverio.webdriverioCoreMod.WebdriverIO.CDPSession, 
    js.Promise[java.lang.String | (typings.std.Record[java.lang.String, js.Any])]
  ]
  type MultiRemoteCapabilities = org.scalablytyped.runtime.StringDictionary[typings.webdriverio.anon.Capabilities]
  type MultiRemoteOptions = org.scalablytyped.runtime.StringDictionary[typings.webdriver.WebDriver.DesiredCapabilities]
  type ServiceEntry = java.lang.String | typings.webdriverio.webdriverioCoreMod.WebdriverIO.HookFunctions | (js.Tuple2[java.lang.String, typings.webdriverio.webdriverioCoreMod.WebdriverIO.ServiceOption]) | js.Object
  type ServiceOption = org.scalablytyped.runtime.StringDictionary[js.Any]
  type TouchActions = java.lang.String | typings.webdriverio.webdriverioCoreMod.WebdriverIO.TouchAction | js.Array[typings.webdriverio.webdriverioCoreMod.WebdriverIO.TouchAction]
}
