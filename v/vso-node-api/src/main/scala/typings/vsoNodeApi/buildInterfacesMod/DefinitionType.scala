package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DefinitionType extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "DefinitionType")
@js.native
object DefinitionType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DefinitionType & Double] = js.native
  
  @js.native
  sealed trait Build
    extends StObject
       with DefinitionType
  /* 2 */ val Build: typings.vsoNodeApi.buildInterfacesMod.DefinitionType.Build & Double = js.native
  
  @js.native
  sealed trait Xaml
    extends StObject
       with DefinitionType
  /* 1 */ val Xaml: typings.vsoNodeApi.buildInterfacesMod.DefinitionType.Xaml & Double = js.native
}
