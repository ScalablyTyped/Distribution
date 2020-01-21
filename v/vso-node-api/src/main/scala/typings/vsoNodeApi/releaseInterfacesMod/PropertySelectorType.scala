package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PropertySelectorType extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "PropertySelectorType")
@js.native
object PropertySelectorType extends js.Object {
  @js.native
  sealed trait Exclusion extends PropertySelectorType
  
  @js.native
  sealed trait Inclusion extends PropertySelectorType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PropertySelectorType with Double] = js.native
  /* 1 */ @js.native
  object Exclusion extends TopLevel[Exclusion with Double]
  
  /* 0 */ @js.native
  object Inclusion extends TopLevel[Inclusion with Double]
  
}

