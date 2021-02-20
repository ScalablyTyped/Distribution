package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProcessTemplateType extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "ProcessTemplateType")
@js.native
object ProcessTemplateType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProcessTemplateType with Double] = js.native
  
  /**
    * Indicates a custom template.
    */
  @js.native
  sealed trait Custom extends ProcessTemplateType
  /* 0 */ val Custom: typings.vsoNodeApi.buildInterfacesMod.ProcessTemplateType.Custom with Double = js.native
  
  /**
    * Indicates a default template.
    */
  @js.native
  sealed trait Default extends ProcessTemplateType
  /* 1 */ val Default: typings.vsoNodeApi.buildInterfacesMod.ProcessTemplateType.Default with Double = js.native
  
  /**
    * Indicates an upgrade template.
    */
  @js.native
  sealed trait Upgrade extends ProcessTemplateType
  /* 2 */ val Upgrade: typings.vsoNodeApi.buildInterfacesMod.ProcessTemplateType.Upgrade with Double = js.native
}
