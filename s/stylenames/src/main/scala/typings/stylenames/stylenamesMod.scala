package typings.stylenames

import typings.std.Partial
import typings.std.Record
import typings.stylenames.stylenamesMod.StyleObject
import typings.stylenames.stylenamesMod.StyleValue
import typings.stylenames.stylenamesMod.StyleValueConditionFunction
import typings.stylenames.stylenamesMod.StyleValueObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stylenames", JSImport.Namespace)
@js.native
object stylenamesMod extends js.Object {
  def default(styles: StyleObject): String = js.native
  type StyleObject = Partial[
    Record[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 423 */ js.Any, 
      StyleValue
    ]
  ]
  type StyleValue = js.UndefOr[Null | String | StyleValueObject]
  type StyleValueConditionFunction = js.Function0[js.UndefOr[Boolean | Null]]
  type StyleValueObject = Record[String | Double, Boolean | StyleValueConditionFunction]
}

