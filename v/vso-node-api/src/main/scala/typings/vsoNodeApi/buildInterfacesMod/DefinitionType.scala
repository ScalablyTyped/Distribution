package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DefinitionType extends js.Object
@JSImport("vso-node-api/interfaces/BuildInterfaces", "DefinitionType")
@js.native
object DefinitionType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DefinitionType with Double] = js.native
  
  @js.native
  sealed trait Build extends DefinitionType
  /* 2 */ @js.native
  object Build
    extends TopLevel[typings.vsoNodeApi.buildInterfacesMod.DefinitionType.Build with Double]
  
  @js.native
  sealed trait Xaml extends DefinitionType
  /* 1 */ @js.native
  object Xaml extends TopLevel[Xaml with Double]
}
