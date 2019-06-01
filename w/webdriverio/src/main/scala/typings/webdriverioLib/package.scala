package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webdriverioLib {
  type $ = js.Function1[
    /* selector */ java.lang.String | js.Function, 
    js.Promise[webdriverioLib.WebdriverIOAsyncNs.Element]
  ]
  type $$ = js.Function1[
    /* selector */ java.lang.String | js.Function, 
    js.Promise[js.Array[webdriverioLib.WebdriverIOAsyncNs.Element]]
  ]
  // Browser commands wrapper with Promise
  type BrowserAsync = webdriverioLib.webdriverioLibStrings.BrowserAsync with js.Any with AsyncSelectors
  type BrowserObject = webdriverLib.WebDriverNs.ClientOptions with webdriverLib.WebDriverNs.ClientAsync with webdriverioLib.WebdriverIOAsyncNs.Browser
  // Browser commands that should be wrapper with Promise
  type BrowserPromise = webdriverLib.WdioOmit[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ js.Any, 
    webdriverioLib.webdriverioLibStrings.addCommand | webdriverioLib.webdriverioLibStrings.options | webdriverioLib.webdriverioLibStrings.DOLLAR | webdriverioLib.webdriverioLibStrings.DOLLARDOLLAR
  ]
  // Browser commands that should not be wrapper with promise
  type BrowserStatic = stdLib.Pick[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ js.Any, 
    webdriverioLib.webdriverioLibStrings.addCommand | webdriverioLib.webdriverioLibStrings.options
  ]
  // Element commands wrapper with Promise
  type ElementAsync = webdriverioLib.webdriverioLibStrings.ElementAsync with js.Any with AsyncSelectors
  // Element commands that should be wrapper with Promise
  type ElementPromise = webdriverLib.WdioOmit[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify WebdriverIO.Element */ js.Any, 
    webdriverioLib.webdriverioLibStrings.addCommand | webdriverioLib.webdriverioLibStrings.DOLLAR | webdriverioLib.webdriverioLibStrings.DOLLARDOLLAR
  ]
  // Element commands that should not be wrapper with promise
  type ElementStatic = stdLib.Pick[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify WebdriverIO.Element */ js.Any, 
    webdriverioLib.webdriverioLibStrings.addCommand
  ]
}
