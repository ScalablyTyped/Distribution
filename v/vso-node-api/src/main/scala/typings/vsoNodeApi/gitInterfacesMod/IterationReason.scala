package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IterationReason extends js.Object
@JSImport("vso-node-api/interfaces/GitInterfaces", "IterationReason")
@js.native
object IterationReason extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IterationReason with Double] = js.native
  
  @js.native
  sealed trait Create extends IterationReason
  /* 2 */ @js.native
  object Create extends TopLevel[Create with Double]
  
  @js.native
  sealed trait ForcePush extends IterationReason
  /* 1 */ @js.native
  object ForcePush extends TopLevel[ForcePush with Double]
  
  @js.native
  sealed trait Push extends IterationReason
  /* 0 */ @js.native
  object Push extends TopLevel[Push with Double]
  
  @js.native
  sealed trait Rebase extends IterationReason
  /* 4 */ @js.native
  object Rebase extends TopLevel[Rebase with Double]
  
  @js.native
  sealed trait Unknown extends IterationReason
  /* 8 */ @js.native
  object Unknown extends TopLevel[Unknown with Double]
}
