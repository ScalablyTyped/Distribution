package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type JsonPrimitive = java.lang.String | scala.Double | scala.Boolean | scala.Null

type MockOverwrite = java.lang.String | (typings.std.Record[java.lang.String, js.Any]) | typings.webdriverio.webdriverioCoreMod.WebdriverIO.MockOverwriteFunction

type MockOverwriteFunction = js.Function2[
/* request */ typings.webdriverio.webdriverioCoreMod.WebdriverIO.Matches, 
/* client */ typings.webdriverio.webdriverioCoreMod.WebdriverIO.CDPSession, 
js.Promise[java.lang.String | (typings.std.Record[java.lang.String, js.Any])]]

type MultiRemoteBrowserObject = typings.webdriverio.webdriverioCoreMod.WebdriverIO.MultiRemoteBrowser & typings.webdriverio.webdriverioCoreMod.WebdriverIO.MultiRemoteBrowserReference

type MultiRemoteBrowserReference = typings.std.Record[java.lang.String, typings.webdriverio.webdriverioCoreMod.WebdriverIO.BrowserObject]

type MultiRemoteCapabilities = org.scalablytyped.runtime.StringDictionary[typings.webdriverio.webdriverioCoreMod.WebdriverIO.MultiRemoteBrowserOptions]

type MultiRemoteOptions = org.scalablytyped.runtime.StringDictionary[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ js.Any]

/* Rewritten from type alias, can be one of: 
  - / **
  * e.g. `services: ['@wdio/sauce-service']`
  * /
java.lang.String
  - / **
  * e.g. `services: [{ onPrepare: () => { ... } }]`
  * /
typings.webdriverio.webdriverioCoreMod.WebdriverIO.HookFunctions
  - / **
  * e.g. `services: [CustomClass]`
  * /
typings.webdriverio.webdriverioCoreMod.WebdriverIO.ServiceLauncher
  - js.Tuple2[
typings.webdriverio.webdriverioCoreMod.WebdriverIO.ServiceClass | java.lang.String, 
typings.webdriverio.webdriverioCoreMod.WebdriverIO.ServiceOption]
*/
type ServiceEntry = typings.webdriverio.webdriverioCoreMod.WebdriverIO._ServiceEntry | (js.Tuple2[
typings.webdriverio.webdriverioCoreMod.WebdriverIO.ServiceClass | java.lang.String, 
typings.webdriverio.webdriverioCoreMod.WebdriverIO.ServiceOption]) | (/**
  * e.g. `services: ['@wdio/sauce-service']`
  */
java.lang.String)

type ServiceOption = org.scalablytyped.runtime.StringDictionary[js.Any]

type TouchActions = java.lang.String | typings.webdriverio.webdriverioCoreMod.WebdriverIO.TouchAction | js.Array[typings.webdriverio.webdriverioCoreMod.WebdriverIO.TouchAction]
