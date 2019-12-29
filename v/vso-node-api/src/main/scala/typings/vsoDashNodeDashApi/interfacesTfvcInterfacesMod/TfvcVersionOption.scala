package typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TfvcVersionOption extends js.Object

@JSImport("vso-node-api/interfaces/TfvcInterfaces", "TfvcVersionOption")
@js.native
object TfvcVersionOption extends js.Object {
  @js.native
  sealed trait None extends TfvcVersionOption
  
  @js.native
  sealed trait Previous extends TfvcVersionOption
  
  @js.native
  sealed trait UseRename extends TfvcVersionOption
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TfvcVersionOption with Double] = js.native
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object Previous extends TopLevel[Previous with Double]
  
  /* 2 */ @js.native
  object UseRename extends TopLevel[UseRename with Double]
  
}

