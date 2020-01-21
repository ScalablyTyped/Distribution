package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webdriverio {
  type $ = js.Function1[
    /* selector */ java.lang.String | js.Function, 
    js.Promise[typings.webdriverio.WebdriverIOAsync.ElementArray]
  ]
  // Browser commands wrapper with Promise
  type BrowserAsync = typings.webdriverio.webdriverioStrings.BrowserAsync with js.Any with typings.webdriverio.AsyncSelectors
  // Browser commands that should be wrapper with Promise
  type BrowserPromise = typings.std.Omit[
    typings.webdriverio.WebdriverIO.Browser, 
    typings.webdriverio.webdriverioStrings.addCommand | typings.webdriverio.webdriverioStrings.overwriteCommand | typings.webdriverio.webdriverioStrings.options | typings.webdriverio.webdriverioStrings.config | typings.webdriverio.webdriverioStrings.$ | typings.webdriverio.webdriverioStrings.DollarDollar | typings.webdriverio.webdriverioStrings.touchAction
  ]
  // Browser commands that should not be wrapper with promise
  type BrowserStatic = typings.std.Pick[
    typings.webdriverio.WebdriverIO.Browser, 
    typings.webdriverio.webdriverioStrings.addCommand | typings.webdriverio.webdriverioStrings.overwriteCommand | typings.webdriverio.webdriverioStrings.options | typings.webdriverio.webdriverioStrings.config
  ]
  // Element commands wrapper with Promise
  type ElementAsync = typings.webdriverio.webdriverioStrings.ElementAsync with js.Any with typings.webdriverio.AsyncSelectors
  // Element commands that should be wrapper with Promise
  type ElementPromise = typings.std.Omit[
    typings.webdriverio.WebdriverIO.Element, 
    typings.webdriverio.webdriverioStrings.addCommand | typings.webdriverio.webdriverioStrings.$ | typings.webdriverio.webdriverioStrings.DollarDollar | typings.webdriverio.webdriverioStrings.selector | typings.webdriverio.webdriverioStrings.elementId | typings.webdriverio.webdriverioStrings.`element-6066-11e4-a52e-4f735466cecf` | typings.webdriverio.webdriverioStrings.ELEMENT | typings.webdriverio.webdriverioStrings.index | typings.webdriverio.webdriverioStrings.parent | typings.webdriverio.webdriverioStrings.dragAndDrop | typings.webdriverio.webdriverioStrings.touchAction
  ]
  // Element commands that should not be wrapper with promise
  type ElementStatic = typings.std.Pick[
    typings.webdriverio.WebdriverIO.Element, 
    typings.webdriverio.webdriverioStrings.addCommand | typings.webdriverio.webdriverioStrings.selector | typings.webdriverio.webdriverioStrings.elementId | typings.webdriverio.webdriverioStrings.`element-6066-11e4-a52e-4f735466cecf` | typings.webdriverio.webdriverioStrings.ELEMENT | typings.webdriverio.webdriverioStrings.index | typings.webdriverio.webdriverioStrings.parent
  ]
  // Properties of TouchAction which are similar in sync and async mode
  type TouchActionSync = typings.std.Omit[
    typings.webdriverio.WebdriverIO.TouchAction, 
    typings.webdriverio.webdriverioStrings.element_
  ]
  type _empty = js.Function1[
    /* selector */ java.lang.String | js.Function, 
    js.Promise[typings.webdriverio.WebdriverIOAsync.Element]
  ]
}
