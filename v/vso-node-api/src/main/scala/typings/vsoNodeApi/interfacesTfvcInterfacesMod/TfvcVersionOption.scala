package typings.vsoNodeApi.interfacesTfvcInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TfvcVersionOption extends StObject
@JSImport("vso-node-api/interfaces/TfvcInterfaces", "TfvcVersionOption")
@js.native
object TfvcVersionOption extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TfvcVersionOption & Double] = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with TfvcVersionOption
  /* 0 */ val None: typings.vsoNodeApi.interfacesTfvcInterfacesMod.TfvcVersionOption.None & Double = js.native
  
  @js.native
  sealed trait Previous
    extends StObject
       with TfvcVersionOption
  /* 1 */ val Previous: typings.vsoNodeApi.interfacesTfvcInterfacesMod.TfvcVersionOption.Previous & Double = js.native
  
  @js.native
  sealed trait UseRename
    extends StObject
       with TfvcVersionOption
  /* 2 */ val UseRename: typings.vsoNodeApi.interfacesTfvcInterfacesMod.TfvcVersionOption.UseRename & Double = js.native
}
