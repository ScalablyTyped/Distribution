package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProcessTemplateType extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "ProcessTemplateType")
@js.native
object ProcessTemplateType extends js.Object {
  /**
    * Indicates a custom template.
    */
  @js.native
  sealed trait Custom
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.ProcessTemplateType
  
  /**
    * Indicates a default template.
    */
  @js.native
  sealed trait Default
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.ProcessTemplateType
  
  /**
    * Indicates an upgrade template.
    */
  @js.native
  sealed trait Upgrade
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.ProcessTemplateType
  
  /* 0 */ val Custom: Custom with scala.Double = js.native
  /* 1 */ val Default: Default with scala.Double = js.native
  /* 2 */ val Upgrade: Upgrade with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.ProcessTemplateType with scala.Double
  ] = js.native
}

