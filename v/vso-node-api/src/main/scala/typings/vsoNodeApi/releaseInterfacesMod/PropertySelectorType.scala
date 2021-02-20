package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PropertySelectorType extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "PropertySelectorType")
@js.native
object PropertySelectorType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PropertySelectorType with Double] = js.native
  
  @js.native
  sealed trait Exclusion extends PropertySelectorType
  /* 1 */ val Exclusion: typings.vsoNodeApi.releaseInterfacesMod.PropertySelectorType.Exclusion with Double = js.native
  
  @js.native
  sealed trait Inclusion extends PropertySelectorType
  /* 0 */ val Inclusion: typings.vsoNodeApi.releaseInterfacesMod.PropertySelectorType.Inclusion with Double = js.native
}
