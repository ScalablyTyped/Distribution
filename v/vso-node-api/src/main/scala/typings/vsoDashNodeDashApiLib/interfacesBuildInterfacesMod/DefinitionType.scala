package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DefinitionType extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "DefinitionType")
@js.native
object DefinitionType extends js.Object {
  @js.native
  sealed trait Build
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.DefinitionType
  
  @js.native
  sealed trait Xaml
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.DefinitionType
  
  /* 2 */ val Build: Build with scala.Double = js.native
  /* 1 */ val Xaml: Xaml with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.DefinitionType with scala.Double
  ] = js.native
}

