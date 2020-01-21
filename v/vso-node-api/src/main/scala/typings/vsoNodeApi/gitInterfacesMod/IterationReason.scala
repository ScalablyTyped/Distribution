package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IterationReason extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "IterationReason")
@js.native
object IterationReason extends js.Object {
  @js.native
  sealed trait Create extends IterationReason
  
  @js.native
  sealed trait ForcePush extends IterationReason
  
  @js.native
  sealed trait Push extends IterationReason
  
  @js.native
  sealed trait Rebase extends IterationReason
  
  @js.native
  sealed trait Unknown extends IterationReason
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IterationReason with Double] = js.native
  /* 2 */ @js.native
  object Create extends TopLevel[Create with Double]
  
  /* 1 */ @js.native
  object ForcePush extends TopLevel[ForcePush with Double]
  
  /* 0 */ @js.native
  object Push extends TopLevel[Push with Double]
  
  /* 4 */ @js.native
  object Rebase extends TopLevel[Rebase with Double]
  
  /* 8 */ @js.native
  object Unknown extends TopLevel[Unknown with Double]
  
}

