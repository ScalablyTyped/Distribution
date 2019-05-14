package typings
package stylefireLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libStylerTypesMod {
  type ChangedValues = js.Array[java.lang.String]
  type CustomTemplate = js.Function2[/* state */ ResolvedState, /* prebuilt */ java.lang.String, java.lang.String]
  type Props = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ResolvedState = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]
  type State = org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | CustomTemplate]]
}
