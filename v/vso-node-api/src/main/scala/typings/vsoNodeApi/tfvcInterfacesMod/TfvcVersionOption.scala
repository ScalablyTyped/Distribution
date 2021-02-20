package typings.vsoNodeApi.tfvcInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TfvcVersionOption extends StObject
@JSImport("vso-node-api/interfaces/TfvcInterfaces", "TfvcVersionOption")
@js.native
object TfvcVersionOption extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TfvcVersionOption with Double] = js.native
  
  @js.native
  sealed trait None extends TfvcVersionOption
  /* 0 */ val None: typings.vsoNodeApi.tfvcInterfacesMod.TfvcVersionOption.None with Double = js.native
  
  @js.native
  sealed trait Previous extends TfvcVersionOption
  /* 1 */ val Previous: typings.vsoNodeApi.tfvcInterfacesMod.TfvcVersionOption.Previous with Double = js.native
  
  @js.native
  sealed trait UseRename extends TfvcVersionOption
  /* 2 */ val UseRename: typings.vsoNodeApi.tfvcInterfacesMod.TfvcVersionOption.UseRename with Double = js.native
}
