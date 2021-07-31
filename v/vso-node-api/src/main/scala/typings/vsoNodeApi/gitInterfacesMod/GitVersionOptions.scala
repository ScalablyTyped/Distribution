package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitVersionOptions extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitVersionOptions")
@js.native
object GitVersionOptions extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitVersionOptions & Double] = js.native
  
  /**
    * First parent of commit (HEAD^)
    */
  @js.native
  sealed trait FirstParent
    extends StObject
       with GitVersionOptions
  /* 2 */ val FirstParent: typings.vsoNodeApi.gitInterfacesMod.GitVersionOptions.FirstParent & Double = js.native
  
  /**
    * Not specified
    */
  @js.native
  sealed trait None
    extends StObject
       with GitVersionOptions
  /* 0 */ val None: typings.vsoNodeApi.gitInterfacesMod.GitVersionOptions.None & Double = js.native
  
  /**
    * Commit that changed item prior to the current version
    */
  @js.native
  sealed trait PreviousChange
    extends StObject
       with GitVersionOptions
  /* 1 */ val PreviousChange: typings.vsoNodeApi.gitInterfacesMod.GitVersionOptions.PreviousChange & Double = js.native
}
