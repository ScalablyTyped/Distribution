package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitPathActions extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitPathActions")
@js.native
object GitPathActions extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitPathActions & Double] = js.native
  
  @js.native
  sealed trait Add
    extends StObject
       with GitPathActions
  /* 3 */ val Add: typings.vsoNodeApi.gitInterfacesMod.GitPathActions.Add & Double = js.native
  
  @js.native
  sealed trait Delete
    extends StObject
       with GitPathActions
  /* 2 */ val Delete: typings.vsoNodeApi.gitInterfacesMod.GitPathActions.Delete & Double = js.native
  
  @js.native
  sealed trait Edit
    extends StObject
       with GitPathActions
  /* 1 */ val Edit: typings.vsoNodeApi.gitInterfacesMod.GitPathActions.Edit & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with GitPathActions
  /* 0 */ val None: typings.vsoNodeApi.gitInterfacesMod.GitPathActions.None & Double = js.native
  
  @js.native
  sealed trait Rename
    extends StObject
       with GitPathActions
  /* 4 */ val Rename: typings.vsoNodeApi.gitInterfacesMod.GitPathActions.Rename & Double = js.native
}
