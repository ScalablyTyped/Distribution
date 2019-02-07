package typings
package webdriverioLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WebdriverIONs {
  type ActionTypes = webdriverioLib.webdriverioLibStrings.press | webdriverioLib.webdriverioLibStrings.longPress | webdriverioLib.webdriverioLibStrings.tap | webdriverioLib.webdriverioLibStrings.moveTo | webdriverioLib.webdriverioLibStrings.wait | webdriverioLib.webdriverioLibStrings.release
  type Call = js.Function1[/* callback */ js.Function, js.Any]
  type Execute = js.Function2[
    /* script */ java.lang.String | (js.Function1[/* repeated */ js.Any, js.Any]), 
    /* repeated */ js.Any, 
    js.Any
  ]
  type ExecuteAsync = js.Function2[
    /* script */ java.lang.String | (js.Function1[/* repeated */ js.Any, js.Any]), 
    /* repeated */ js.Any, 
    js.Any
  ]
  type LocationParam = webdriverioLib.webdriverioLibStrings.x | webdriverioLib.webdriverioLibStrings.y
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
  type SizeParam = webdriverioLib.webdriverioLibStrings.width | webdriverioLib.webdriverioLibStrings.height
  type TouchActions = java.lang.String | TouchAction | js.Array[TouchAction]
}
