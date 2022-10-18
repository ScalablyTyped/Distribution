package typings.vsoNodeApi.interfacesCoreInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProcessType extends StObject
@JSImport("vso-node-api/interfaces/CoreInterfaces", "ProcessType")
@js.native
object ProcessType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProcessType & Double] = js.native
  
  @js.native
  sealed trait Custom
    extends StObject
       with ProcessType
  /* 1 */ val Custom: typings.vsoNodeApi.interfacesCoreInterfacesMod.ProcessType.Custom & Double = js.native
  
  @js.native
  sealed trait Inherited
    extends StObject
       with ProcessType
  /* 2 */ val Inherited: typings.vsoNodeApi.interfacesCoreInterfacesMod.ProcessType.Inherited & Double = js.native
  
  @js.native
  sealed trait System
    extends StObject
       with ProcessType
  /* 0 */ val System: typings.vsoNodeApi.interfacesCoreInterfacesMod.ProcessType.System & Double = js.native
}
