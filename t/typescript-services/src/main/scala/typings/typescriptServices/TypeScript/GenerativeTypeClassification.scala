package typings.typescriptServices.TypeScript

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
  
}

