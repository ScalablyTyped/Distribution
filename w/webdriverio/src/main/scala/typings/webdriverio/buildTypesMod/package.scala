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


type CustomLocatorReturnValue = HTMLElement | js.Array[HTMLElement] | NodeListOf[HTMLElement]

type CustomStrategyFunction = js.Function1[/* args */ Any, ElementReference | js.Array[ElementReference]]

type ElementFunction = js.Function1[/* elem */ HTMLElement, js.Array[HTMLElement] | HTMLElement]

/**
  * WebdriverIO Mock definition
  */
type MockFunctions = FunctionProperties[default]

type MultiRemoteBrowserReferenceAsync = Record[String, Browser[async]]

type MultiRemoteBrowserReferenceSync = Record[String, Browser[sync]]

type MultiRemoteElementReferenceAsync = Record[String, Element[async]]

type MultiRemoteElementReferenceSync = Record[String, Element[sync]]

type Selector = String | ElementReference | ElementFunction | CustomStrategyReference

type TouchActionParameter = String | (js.Array[String | TouchAction]) | TouchAction

type TouchActions = TouchActionParameter | js.Array[TouchActionParameter]
