package typings.webpagetest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webpagetestMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Error

  type Callback[R] = js.Function3[/* err */ js.UndefOr[Error], /* data */ js.UndefOr[R], /* info */ js.Any, Unit]
  type TestScript = js.Array[TestScriptCommand]
  type TestScriptCommand = String | (StringDictionary[String | Double | (js.Array[Double | String])])
}
