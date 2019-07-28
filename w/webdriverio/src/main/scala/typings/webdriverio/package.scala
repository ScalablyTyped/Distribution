package typings

import typings.std.Omit
import typings.std.Pick
import typings.webdriverio.WebdriverIOAsyncNs.Element
import typings.webdriverio.webdriverioStrings.DOLLAR
import typings.webdriverio.webdriverioStrings.DOLLARDOLLAR
import typings.webdriverio.webdriverioStrings.addCommand
import typings.webdriverio.webdriverioStrings.elementId
import typings.webdriverio.webdriverioStrings.options
import typings.webdriverio.webdriverioStrings.overwriteCommand
import typings.webdriverio.webdriverioStrings.selector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webdriverio {
  type $ = js.Function1[/* selector */ String | js.Function, js.Promise[Element]]
  type $$ = js.Function1[/* selector */ String | js.Function, js.Promise[js.Array[Element]]]
  // Browser commands wrapper with Promise
  type BrowserAsync = typings.webdriverio.webdriverioStrings.BrowserAsync with js.Any with AsyncSelectors
  // Browser commands that should be wrapper with Promise
  type BrowserPromise = Omit[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ js.Any, 
    addCommand | overwriteCommand | options | DOLLAR | DOLLARDOLLAR
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
    addCommand | DOLLAR | DOLLARDOLLAR | selector | elementId
  ]
  // Element commands that should not be wrapper with promise
  type ElementStatic = Pick[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify WebdriverIO.Element */ js.Any, 
    addCommand | selector | elementId
  ]
}
