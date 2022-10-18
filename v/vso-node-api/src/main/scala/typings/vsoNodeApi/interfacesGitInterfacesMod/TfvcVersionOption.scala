package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TfvcVersionOption extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "TfvcVersionOption")
@js.native
object TfvcVersionOption extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TfvcVersionOption & Double] = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with TfvcVersionOption
  /* 0 */ val None: typings.vsoNodeApi.interfacesGitInterfacesMod.TfvcVersionOption.None & Double = js.native
  
  @js.native
  sealed trait Previous
    extends StObject
       with TfvcVersionOption
  /* 1 */ val Previous: typings.vsoNodeApi.interfacesGitInterfacesMod.TfvcVersionOption.Previous & Double = js.native
  
  @js.native
  sealed trait UseRename
    extends StObject
       with TfvcVersionOption
  /* 2 */ val UseRename: typings.vsoNodeApi.interfacesGitInterfacesMod.TfvcVersionOption.UseRename & Double = js.native
}
