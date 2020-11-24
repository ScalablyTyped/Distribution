package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WorkspaceMappingType extends js.Object
@JSImport("vso-node-api/interfaces/BuildInterfaces", "WorkspaceMappingType")
@js.native
object WorkspaceMappingType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WorkspaceMappingType with Double] = js.native
  
  /**
    * The path is cloaked in the workspace.
    */
  @js.native
  sealed trait Cloak extends WorkspaceMappingType
  /* 1 */ @js.native
  object Cloak extends TopLevel[Cloak with Double]
  
  /**
    * The path is mapped in the workspace.
    */
  @js.native
  sealed trait Map extends WorkspaceMappingType
  /* 0 */ @js.native
  object Map extends TopLevel[Map with Double]
}
