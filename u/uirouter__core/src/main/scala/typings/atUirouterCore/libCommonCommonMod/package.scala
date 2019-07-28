package typings.atUirouterCore

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libCommonCommonMod {
  type IInjectable = js.Function | js.Array[js.Any]
  type Mapper[X, T] = js.Function2[/* x */ X, /* key */ js.UndefOr[String | Double], T]
  type Predicate[X] = js.Function1[/* x */ js.UndefOr[X], Boolean]
  type PredicateBinary[X, Y] = js.Function2[/* x */ js.UndefOr[X], /* y */ js.UndefOr[Y], Boolean]
  type TypedMap[T] = StringDictionary[T]
}
