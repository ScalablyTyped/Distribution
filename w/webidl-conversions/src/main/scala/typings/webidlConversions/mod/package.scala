package typings.webidlConversions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type IntegerConversion = js.Function2[
    /* V */ js.Any, 
    /* opts */ js.UndefOr[typings.webidlConversions.mod.IntegerOptions], 
    scala.Double
  ]
  type NumberConversion = js.Function2[
    /* V */ js.Any, 
    /* opts */ js.UndefOr[typings.webidlConversions.mod.Options], 
    scala.Double
  ]
  type Parameters[T /* <: js.Function1[/* repeated */ js.Any, _] */] = js.Any
  type StringConversion = js.Function2[
    /* V */ js.Any, 
    /* opts */ js.UndefOr[typings.webidlConversions.mod.StringOptions], 
    java.lang.String
  ]
}
