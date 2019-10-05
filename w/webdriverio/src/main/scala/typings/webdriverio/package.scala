package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webdriverio {
  import typings.std.Omit
  import typings.std.Pick
  import typings.webdriverio.WebdriverIOAsync.Element
  import typings.webdriverio.webdriverioStrings.DOLLAR
  import typings.webdriverio.webdriverioStrings.DOLLARDOLLAR
  import typings.webdriverio.webdriverioStrings.ELEMENT
  import typings.webdriverio.webdriverioStrings.`element-6066-11e4-a52e-4f735466cecf`
  import typings.webdriverio.webdriverioStrings.addCommand
  import typings.webdriverio.webdriverioStrings.dragAndDrop
  import typings.webdriverio.webdriverioStrings.element
  import typings.webdriverio.webdriverioStrings.elementId
  import typings.webdriverio.webdriverioStrings.options
  import typings.webdriverio.webdriverioStrings.overwriteCommand
  import typings.webdriverio.webdriverioStrings.selector
  import typings.webdriverio.webdriverioStrings.touchAction

  type $ = js.Function1[/* selector */ String | js.Function, js.Promise[Element]]
  type $$ = js.Function1[/* selector */ String | js.Function, js.Promise[js.Array[Element]]]
  // Browser commands wrapper with Promise
  type BrowserAsync = typings.webdriverio.webdriverioStrings.BrowserAsync with js.Any with AsyncSelectors
  // Browser commands that should be wrapper with Promise
  type BrowserPromise = Omit[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ js.Any, 
    addCommand | overwriteCommand | options | DOLLAR | DOLLARDOLLAR | touchAction
  ]
  // Browser commands that should not be wrapper with promise
  type BrowserStatic = Pick[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ js.Any, 
    addCommand | overwriteCommand | options
  ]
  // Element commands wrapper with Promise
  type ElementAsync = typings.webdriverio.webdriverioStrings.ElementAsync with js.Any with AsyncSelectors
  // Element commands that should be wrapper with Promise
  type ElementPromise = Omit[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify WebdriverIO.Element */ js.Any, 
    addCommand | DOLLAR | DOLLARDOLLAR | selector | elementId | `element-6066-11e4-a52e-4f735466cecf` | ELEMENT | dragAndDrop | touchAction
  ]
  // Element commands that should not be wrapper with promise
  type ElementStatic = Pick[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify WebdriverIO.Element */ js.Any, 
    addCommand | selector | elementId | `element-6066-11e4-a52e-4f735466cecf` | ELEMENT
  ]
  // Properties of TouchAction which are similar in sync and async mode
  type TouchActionSync = Omit[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify WebdriverIO.TouchAction */ js.Any, 
    element
  ]
}
