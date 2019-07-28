package typings.stylenames

import typings.std.Partial
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stylenamesMod {
  type StyleObject = Partial[
    Record[
      /* import warning: LimitUnionLength.enterTypeRef Was union type with length 394 */ js.Any, 
      StyleValue
    ]
  ]
  type StyleValue = js.UndefOr[Null | String | StyleValueObject]
  type StyleValueConditionFunction = js.Function0[js.UndefOr[Boolean | Null]]
  type StyleValueObject = Record[String | Double, Boolean | StyleValueConditionFunction]
}
