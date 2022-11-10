package typings.webdriverio.buildTypesMod

import typings.std.HTMLElement
import typings.std.NodeListOf
import typings.std.Record
import typings.wdioProtocols.buildTypesMod.ElementReference
import typings.wdioTypes.mod.FunctionProperties
import typings.webdriverio.buildUtilsInterceptionDevtoolsMod.default
import typings.webdriverio.webdriverioStrings.async
import typings.webdriverio.webdriverioStrings.sync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  Mode extends 'sync' ? webdriverio.webdriverio/build/types.BrowserSync : webdriverio.webdriverio/build/types.BrowserAsync
  }}}
  */
type Browser[Mode /* <: sync | async */] = BrowserSync

type CustomLocatorReturnValue = HTMLElement | js.Array[HTMLElement] | NodeListOf[HTMLElement]

type CustomStrategyFunction = js.Function1[/* args */ Any, ElementReference | js.Array[ElementReference]]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  Mode extends 'sync' ? webdriverio.webdriverio/build/types.ElementSync : webdriverio.webdriverio/build/types.ElementAsync
  }}}
  */
type Element[Mode /* <: sync | async */] = ElementSync

type ElementFunction = js.Function1[/* elem */ HTMLElement, js.Array[HTMLElement] | HTMLElement]

/**
  * WebdriverIO Mock definition
  */
type MockFunctions = FunctionProperties[default]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  Mode extends 'sync' ? webdriverio.webdriverio/build/types.MultiRemoteBrowserReferenceSync & webdriverio.webdriverio/build/types.MultiRemoteBrowserSync : webdriverio.webdriverio/build/types.MultiRemoteBrowserReferenceAsync & webdriverio.webdriverio/build/types.MultiRemoteBrowserAsync
  }}}
  */
type MultiRemoteBrowser[Mode /* <: sync | async */] = MultiRemoteBrowserReferenceSync & MultiRemoteBrowserSync

type MultiRemoteBrowserReferenceAsync = Record[String, Browser[async]]

type MultiRemoteBrowserReferenceSync = Record[String, Browser[sync]]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  Mode extends 'sync' ? webdriverio.webdriverio/build/types.MultiRemoteElementReferenceSync & webdriverio.webdriverio/build/types.MultiRemoteElementSync : webdriverio.webdriverio/build/types.MultiRemoteElementReferenceAsync & webdriverio.webdriverio/build/types.MultiRemoteElementAsync
  }}}
  */
type MultiRemoteElement[Mode /* <: sync | async */] = MultiRemoteElementReferenceSync & MultiRemoteElementSync

type MultiRemoteElementReferenceAsync = Record[String, Element[async]]

type MultiRemoteElementReferenceSync = Record[String, Element[sync]]

type Selector = String | ElementReference | ElementFunction | CustomStrategyReference

type TouchActionParameter = String | (js.Array[String | TouchAction]) | TouchAction

type TouchActions = TouchActionParameter | js.Array[TouchActionParameter]
