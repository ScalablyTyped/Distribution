package typings.typescriptDashServices.TypeScript

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GenerativeTypeClassification with Double] = js.native
  /* 2 */ @js.native
  object Closed extends TopLevel[Closed with Double]
  
  /* 3 */ @js.native
  object InfinitelyExpanding extends TopLevel[InfinitelyExpanding with Double]
  
  /* 1 */ @js.native
  object Open extends TopLevel[Open with Double]
  
  /* 0 */ @js.native
  object Unknown extends TopLevel[Unknown with Double]
  
}

