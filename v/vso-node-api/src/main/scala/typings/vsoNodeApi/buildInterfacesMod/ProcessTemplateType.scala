package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProcessTemplateType extends js.Object
@JSImport("vso-node-api/interfaces/BuildInterfaces", "ProcessTemplateType")
@js.native
object ProcessTemplateType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProcessTemplateType with Double] = js.native
  
  /**
    * Indicates a custom template.
    */
  @js.native
  sealed trait Custom extends ProcessTemplateType
  /* 0 */ @js.native
  object Custom extends TopLevel[Custom with Double]
  
  /**
    * Indicates a default template.
    */
  @js.native
  sealed trait Default extends ProcessTemplateType
  /* 1 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  /**
    * Indicates an upgrade template.
    */
  @js.native
  sealed trait Upgrade extends ProcessTemplateType
  /* 2 */ @js.native
  object Upgrade extends TopLevel[Upgrade with Double]
}
