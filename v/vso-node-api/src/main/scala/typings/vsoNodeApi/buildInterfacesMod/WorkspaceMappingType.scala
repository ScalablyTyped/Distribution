package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WorkspaceMappingType extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "WorkspaceMappingType")
@js.native
object WorkspaceMappingType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WorkspaceMappingType with Double] = js.native
  
  /**
    * The path is cloaked in the workspace.
    */
  @js.native
  sealed trait Cloak extends WorkspaceMappingType
  /* 1 */ val Cloak: typings.vsoNodeApi.buildInterfacesMod.WorkspaceMappingType.Cloak with Double = js.native
  
  /**
    * The path is mapped in the workspace.
    */
  @js.native
  sealed trait Map extends WorkspaceMappingType
  /* 0 */ val Map: typings.vsoNodeApi.buildInterfacesMod.WorkspaceMappingType.Map with Double = js.native
}
