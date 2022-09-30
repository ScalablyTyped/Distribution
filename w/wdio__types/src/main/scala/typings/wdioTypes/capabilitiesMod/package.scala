package typings.wdioTypes.capabilitiesMod

import org.scalablytyped.runtime.StringDictionary
import typings.wdioTypes.optionsMod.WebdriverIO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AppiumXCUICommandTimeouts = StringDictionary[Any]

type AppiumXCUISafariGlobalPreferences = StringDictionary[Any]

/**
  * Chromium Edge
  */
type MicrosoftEdgeOptions = ChromeOptions

type MultiRemoteCapabilities = StringDictionary[WebdriverIO]

type RemoteCapabilities = (js.Array[DesiredCapabilities | W3CCapabilities]) | MultiRemoteCapabilities

/* Rewritten from type alias, can be one of: 
  - typings.wdioTypes.capabilitiesMod.DesiredCapabilities
  - typings.wdioTypes.capabilitiesMod.W3CCapabilities
  - typings.wdioTypes.capabilitiesMod.MultiRemoteCapabilities
*/
type RemoteCapability = _RemoteCapability | MultiRemoteCapabilities
