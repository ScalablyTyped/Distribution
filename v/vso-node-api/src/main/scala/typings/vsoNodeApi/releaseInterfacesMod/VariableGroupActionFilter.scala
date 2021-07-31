package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VariableGroupActionFilter extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "VariableGroupActionFilter")
@js.native
object VariableGroupActionFilter extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VariableGroupActionFilter & Double] = js.native
  
  @js.native
  sealed trait Manage
    extends StObject
       with VariableGroupActionFilter
  /* 2 */ val Manage: typings.vsoNodeApi.releaseInterfacesMod.VariableGroupActionFilter.Manage & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with VariableGroupActionFilter
  /* 0 */ val None: typings.vsoNodeApi.releaseInterfacesMod.VariableGroupActionFilter.None & Double = js.native
  
  @js.native
  sealed trait Use
    extends StObject
       with VariableGroupActionFilter
  /* 16 */ val Use: typings.vsoNodeApi.releaseInterfacesMod.VariableGroupActionFilter.Use & Double = js.native
}
