package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitVersionType extends js.Object
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitVersionType")
@js.native
object GitVersionType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitVersionType with Double] = js.native
  
  /**
    * Interpret the version as a branch name
    */
  @js.native
  sealed trait Branch extends GitVersionType
  /* 0 */ @js.native
  object Branch extends TopLevel[Branch with Double]
  
  /**
    * Interpret the version as a commit ID (SHA1)
    */
  @js.native
  sealed trait Commit extends GitVersionType
  /* 2 */ @js.native
  object Commit extends TopLevel[Commit with Double]
  
  /**
    * Interpret the version as a tag name
    */
  @js.native
  sealed trait Tag extends GitVersionType
  /* 1 */ @js.native
  object Tag extends TopLevel[Tag with Double]
}
