package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GenerativeTypeClassification extends js.Object

@JSGlobal("TypeScript.GenerativeTypeClassification")
@js.native
object GenerativeTypeClassification extends js.Object {
  @js.native
  sealed trait Closed extends GenerativeTypeClassification
  
  @js.native
  sealed trait InfinitelyExpanding extends GenerativeTypeClassification
  
  @js.native
  sealed trait Open extends GenerativeTypeClassification
  
  @js.native
  sealed trait Unknown extends GenerativeTypeClassification
  
  /* 2 */ val Closed: typings.typescriptDashServices.TypeScript.GenerativeTypeClassification.Closed with Double = js.native
  /* 3 */ val InfinitelyExpanding: typings.typescriptDashServices.TypeScript.GenerativeTypeClassification.InfinitelyExpanding with Double = js.native
  /* 1 */ val Open: typings.typescriptDashServices.TypeScript.GenerativeTypeClassification.Open with Double = js.native
  /* 0 */ val Unknown: typings.typescriptDashServices.TypeScript.GenerativeTypeClassification.Unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GenerativeTypeClassification with Double] = js.native
}

