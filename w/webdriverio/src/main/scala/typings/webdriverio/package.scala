package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webdriverio {
  type $ = js.Function1[
    /* selector */ java.lang.String | js.Function, 
    js.Promise[typings.webdriverio.WebdriverIOAsync.ElementArray]
  ]
  type _empty = js.Function1[
    /* selector */ java.lang.String | js.Function, 
    js.Promise[typings.webdriverio.WebdriverIOAsync.Element]
  ]
}
