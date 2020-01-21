package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProcessTemplateType with Double] = js.native
  /* 0 */ @js.native
  object Custom extends TopLevel[Custom with Double]
  
  /* 1 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  /* 2 */ @js.native
  object Upgrade extends TopLevel[Upgrade with Double]
  
}

