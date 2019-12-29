package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DefinitionType extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "DefinitionType")
@js.native
object DefinitionType extends js.Object {
  @js.native
  sealed trait Build extends DefinitionType
  
  @js.native
  sealed trait Xaml extends DefinitionType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DefinitionType with Double] = js.native
  /* 2 */ @js.native
  object Build
    extends TopLevel[
          typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.DefinitionType.Build with Double
        ]
  
  /* 1 */ @js.native
  object Xaml extends TopLevel[Xaml with Double]
  
}

