package typings.vsoNodeApi.coreInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProjectVisibility extends js.Object
@JSImport("vso-node-api/interfaces/CoreInterfaces", "ProjectVisibility")
@js.native
object ProjectVisibility extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProjectVisibility with Double] = js.native
  
  @js.native
  sealed trait Organization extends ProjectVisibility
  /* 1 */ @js.native
  object Organization extends TopLevel[Organization with Double]
  
  @js.native
  sealed trait Private extends ProjectVisibility
  /* 0 */ @js.native
  object Private extends TopLevel[Private with Double]
  
  @js.native
  sealed trait Public extends ProjectVisibility
  /* 2 */ @js.native
  object Public extends TopLevel[Public with Double]
  
  @js.native
  sealed trait Unchanged extends ProjectVisibility
  /* -1 */ @js.native
  object Unchanged extends TopLevel[Unchanged with Double]
}
