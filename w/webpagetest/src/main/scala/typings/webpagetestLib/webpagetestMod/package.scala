package typings
package webpagetestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webpagetestMod {
  type Callback[R] = js.Function3[
    /* err */ js.UndefOr[stdLib.Error], 
    /* data */ js.UndefOr[R], 
    /* info */ js.Any, 
    scala.Unit
  ]
  type TestScriptCommand = java.lang.String | (org.scalablytyped.runtime.StringDictionary[
    java.lang.String | scala.Double | js.Array[java.lang.String] | js.Array[scala.Double]
  ])
}
