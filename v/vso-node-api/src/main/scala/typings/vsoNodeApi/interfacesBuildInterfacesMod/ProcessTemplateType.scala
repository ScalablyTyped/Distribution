package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProcessTemplateType extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "ProcessTemplateType")
@js.native
object ProcessTemplateType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProcessTemplateType & Double] = js.native
  
  /**
    * Indicates a custom template.
    */
  @js.native
  sealed trait Custom
    extends StObject
       with ProcessTemplateType
  /* 0 */ val Custom: typings.vsoNodeApi.interfacesBuildInterfacesMod.ProcessTemplateType.Custom & Double = js.native
  
  /**
    * Indicates a default template.
    */
  @js.native
  sealed trait Default
    extends StObject
       with ProcessTemplateType
  /* 1 */ val Default: typings.vsoNodeApi.interfacesBuildInterfacesMod.ProcessTemplateType.Default & Double = js.native
  
  /**
    * Indicates an upgrade template.
    */
  @js.native
  sealed trait Upgrade
    extends StObject
       with ProcessTemplateType
  /* 2 */ val Upgrade: typings.vsoNodeApi.interfacesBuildInterfacesMod.ProcessTemplateType.Upgrade & Double = js.native
}
