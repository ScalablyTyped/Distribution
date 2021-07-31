package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitRefSearchType extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitRefSearchType")
@js.native
object GitRefSearchType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitRefSearchType & Double] = js.native
  
  @js.native
  sealed trait Contains
    extends StObject
       with GitRefSearchType
  /* 2 */ val Contains: typings.vsoNodeApi.gitInterfacesMod.GitRefSearchType.Contains & Double = js.native
  
  @js.native
  sealed trait Exact
    extends StObject
       with GitRefSearchType
  /* 0 */ val Exact: typings.vsoNodeApi.gitInterfacesMod.GitRefSearchType.Exact & Double = js.native
  
  @js.native
  sealed trait StartsWith
    extends StObject
       with GitRefSearchType
  /* 1 */ val StartsWith: typings.vsoNodeApi.gitInterfacesMod.GitRefSearchType.StartsWith & Double = js.native
}
