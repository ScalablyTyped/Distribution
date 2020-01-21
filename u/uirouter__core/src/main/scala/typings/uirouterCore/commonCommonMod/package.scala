package typings.uirouterCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object commonCommonMod {
  type IInjectable = js.Function | js.Array[js.Any]
  type Mapper[X, T] = js.Function2[/* x */ X, /* key */ js.UndefOr[java.lang.String | scala.Double], T]
  type Predicate[X] = js.Function1[/* x */ js.UndefOr[X], scala.Boolean]
  type PredicateBinary[X, Y] = js.Function2[/* x */ js.UndefOr[X], /* y */ js.UndefOr[Y], scala.Boolean]
  type TypedMap[T] = org.scalablytyped.runtime.StringDictionary[T]
}
