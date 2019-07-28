package typings.webpagetest

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webpagetestMod {
  type Callback[R] = js.Function3[/* err */ js.UndefOr[Error], /* data */ js.UndefOr[R], /* info */ js.Any, Unit]
  type TestScriptCommand = String | (StringDictionary[String | Double | (js.Array[Double | String])])
}
