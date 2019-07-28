package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

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
  sealed trait Custom extends ProcessTemplateType
  
  /**
    * Indicates a default template.
    */
  @js.native
  sealed trait Default extends ProcessTemplateType
  
  /**
    * Indicates an upgrade template.
    */
  @js.native
  sealed trait Upgrade extends ProcessTemplateType
  
  /* 0 */ val Custom: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.ProcessTemplateType.Custom with Double = js.native
  /* 1 */ val Default: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.ProcessTemplateType.Default with Double = js.native
  /* 2 */ val Upgrade: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.ProcessTemplateType.Upgrade with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProcessTemplateType with Double] = js.native
}

