package typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod

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
  
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod.TfvcVersionOption.None with Double = js.native
  /* 1 */ val Previous: typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod.TfvcVersionOption.Previous with Double = js.native
  /* 2 */ val UseRename: typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod.TfvcVersionOption.UseRename with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TfvcVersionOption with Double] = js.native
}

