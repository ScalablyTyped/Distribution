package typings
package webdriverioLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WebdriverIONs {
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
  type TouchActions = java.lang.String | TouchAction | js.Array[TouchAction]
}
