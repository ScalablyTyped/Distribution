package typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProjectVisibility extends js.Object

@JSImport("vso-node-api/interfaces/CoreInterfaces", "ProjectVisibility")
@js.native
object ProjectVisibility extends js.Object {
  @js.native
  sealed trait Organization extends ProjectVisibility
  
  @js.native
  sealed trait Private extends ProjectVisibility
  
  @js.native
  sealed trait Public extends ProjectVisibility
  
  @js.native
  sealed trait Unchanged extends ProjectVisibility
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProjectVisibility with Double] = js.native
  /* 1 */ @js.native
  object Organization extends TopLevel[Organization with Double]
  
  /* 0 */ @js.native
  object Private extends TopLevel[Private with Double]
  
  /* 2 */ @js.native
  object Public extends TopLevel[Public with Double]
  
  /* -1 */ @js.native
  object Unchanged extends TopLevel[Unchanged with Double]
  
}

