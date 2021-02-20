package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitVersionType extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitVersionType")
@js.native
object GitVersionType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitVersionType with Double] = js.native
  
  /**
    * Interpret the version as a branch name
    */
  @js.native
  sealed trait Branch extends GitVersionType
  /* 0 */ val Branch: typings.vsoNodeApi.gitInterfacesMod.GitVersionType.Branch with Double = js.native
  
  /**
    * Interpret the version as a commit ID (SHA1)
    */
  @js.native
  sealed trait Commit extends GitVersionType
  /* 2 */ val Commit: typings.vsoNodeApi.gitInterfacesMod.GitVersionType.Commit with Double = js.native
  
  /**
    * Interpret the version as a tag name
    */
  @js.native
  sealed trait Tag extends GitVersionType
  /* 1 */ val Tag: typings.vsoNodeApi.gitInterfacesMod.GitVersionType.Tag with Double = js.native
}
