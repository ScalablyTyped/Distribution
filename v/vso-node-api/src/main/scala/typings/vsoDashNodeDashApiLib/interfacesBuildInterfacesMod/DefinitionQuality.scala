package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DefinitionQuality extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "DefinitionQuality")
@js.native
object DefinitionQuality extends js.Object {
  @js.native
  sealed trait Definition
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.DefinitionQuality
  
  @js.native
  sealed trait Draft
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.DefinitionQuality
  
  /* 1 */ val Definition: Definition with scala.Double = js.native
  /* 2 */ val Draft: Draft with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.DefinitionQuality with scala.Double
  ] = js.native
}

