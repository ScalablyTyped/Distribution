package typings.webidlDashConversions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webidlDashConversionsMod {
  type IntegerConversion = js.Function2[/* V */ js.Any, /* opts */ js.UndefOr[IntegerOptions], Double]
  type NumberConversion = js.Function2[/* V */ js.Any, /* opts */ js.UndefOr[Options], Double]
  type Parameters[T /* <: js.Function1[/* repeated */ js.Any, _] */] = js.Any
  type StringConversion = js.Function2[/* V */ js.Any, /* opts */ js.UndefOr[StringOptions], String]
}
