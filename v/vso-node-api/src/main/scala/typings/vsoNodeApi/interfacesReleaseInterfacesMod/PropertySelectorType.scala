package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PropertySelectorType extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "PropertySelectorType")
@js.native
object PropertySelectorType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PropertySelectorType & Double] = js.native
  
  @js.native
  sealed trait Exclusion
    extends StObject
       with PropertySelectorType
  /* 1 */ val Exclusion: typings.vsoNodeApi.interfacesReleaseInterfacesMod.PropertySelectorType.Exclusion & Double = js.native
  
  @js.native
  sealed trait Inclusion
    extends StObject
       with PropertySelectorType
  /* 0 */ val Inclusion: typings.vsoNodeApi.interfacesReleaseInterfacesMod.PropertySelectorType.Inclusion & Double = js.native
}
