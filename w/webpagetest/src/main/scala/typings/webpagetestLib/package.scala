package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webpagetestLib {
  type Callback[R] = js.Function3[
    /* err */ js.UndefOr[stdLib.Error], 
    /* data */ js.UndefOr[R], 
    /* info */ js.Any, 
    scala.Unit
  ]
  type TestScript = js.Array[TestScriptCommand]
  type TestScriptCommand = java.lang.String | (org.scalablytyped.runtime.StringDictionary[
    java.lang.String | scala.Double | js.Array[java.lang.String] | js.Array[scala.Double]
  ])
}
