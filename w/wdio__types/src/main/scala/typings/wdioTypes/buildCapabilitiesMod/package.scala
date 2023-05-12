package typings.wdioTypes.buildCapabilitiesMod

import org.scalablytyped.runtime.StringDictionary
import typings.wdioTypes.buildOptionsMod.WebdriverIO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AppiumXCUICommandTimeouts = StringDictionary[Any]

type AppiumXCUISafariGlobalPreferences = StringDictionary[Any]

/** 
NOTE: Rewritten from type alias:
{{{
type JSONLike = {[property: string] : @wdio/types.@wdio/types/build/Capabilities.JSONLike} | std.Array<@wdio/types.@wdio/types/build/Capabilities.JSONLike> | string | number | boolean | null
}}}
to avoid circular code involving: 
- @wdio/types.@wdio/types/build/Capabilities.JSONLike
*/
type JSONLike = StringDictionary[Any] | js.Array[Any] | String | Double | Boolean | Null

/**
  * Chromium Edge
  */
type MicrosoftEdgeOptions = ChromeOptions

type MultiRemoteCapabilities = StringDictionary[WebdriverIO]

type RemoteCapabilities = (js.Array[DesiredCapabilities | W3CCapabilities]) | MultiRemoteCapabilities

/* Rewritten from type alias, can be one of: 
  - typings.wdioTypes.buildCapabilitiesMod.DesiredCapabilities
  - typings.wdioTypes.buildCapabilitiesMod.W3CCapabilities
  - typings.wdioTypes.buildCapabilitiesMod.MultiRemoteCapabilities
*/
type RemoteCapability = _RemoteCapability | MultiRemoteCapabilities
