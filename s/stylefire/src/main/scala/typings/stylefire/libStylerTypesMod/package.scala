package typings.stylefire

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libStylerTypesMod {
  type ChangedValues = js.Array[String]
  type CustomTemplate = js.Function2[/* state */ ResolvedState, /* prebuilt */ String, String]
  type Props = StringDictionary[js.Any]
  type ResolvedState = StringDictionary[String | Double]
  type State = StringDictionary[js.UndefOr[String | Double | CustomTemplate]]
}
