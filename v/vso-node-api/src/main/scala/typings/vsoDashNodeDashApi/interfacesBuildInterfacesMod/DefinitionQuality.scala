package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DefinitionQuality extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "DefinitionQuality")
@js.native
object DefinitionQuality extends js.Object {
  @js.native
  sealed trait Definition extends DefinitionQuality
  
  @js.native
  sealed trait Draft extends DefinitionQuality
  
  /* 1 */ val Definition: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.DefinitionQuality.Definition with Double = js.native
  /* 2 */ val Draft: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.DefinitionQuality.Draft with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DefinitionQuality with Double] = js.native
}

