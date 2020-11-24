package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PropertySelectorType extends js.Object
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "PropertySelectorType")
@js.native
object PropertySelectorType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PropertySelectorType with Double] = js.native
  
  @js.native
  sealed trait Exclusion extends PropertySelectorType
  /* 1 */ @js.native
  object Exclusion extends TopLevel[Exclusion with Double]
  
  @js.native
  sealed trait Inclusion extends PropertySelectorType
  /* 0 */ @js.native
  object Inclusion extends TopLevel[Inclusion with Double]
}
