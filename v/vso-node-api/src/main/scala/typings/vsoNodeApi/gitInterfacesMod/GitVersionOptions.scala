package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitVersionOptions extends js.Object
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitVersionOptions")
@js.native
object GitVersionOptions extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitVersionOptions with Double] = js.native
  
  /**
    * First parent of commit (HEAD^)
    */
  @js.native
  sealed trait FirstParent extends GitVersionOptions
  /* 2 */ @js.native
  object FirstParent extends TopLevel[FirstParent with Double]
  
  /**
    * Not specified
    */
  @js.native
  sealed trait None extends GitVersionOptions
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /**
    * Commit that changed item prior to the current version
    */
  @js.native
  sealed trait PreviousChange extends GitVersionOptions
  /* 1 */ @js.native
  object PreviousChange extends TopLevel[PreviousChange with Double]
}
