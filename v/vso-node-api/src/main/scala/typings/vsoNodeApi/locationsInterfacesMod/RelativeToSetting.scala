package typings.vsoNodeApi.locationsInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RelativeToSetting extends js.Object
@JSImport("vso-node-api/interfaces/LocationsInterfaces", "RelativeToSetting")
@js.native
object RelativeToSetting extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RelativeToSetting with Double] = js.native
  
  @js.native
  sealed trait Context extends RelativeToSetting
  /* 0 */ @js.native
  object Context extends TopLevel[Context with Double]
  
  @js.native
  sealed trait FullyQualified extends RelativeToSetting
  /* 3 */ @js.native
  object FullyQualified extends TopLevel[FullyQualified with Double]
  
  @js.native
  sealed trait WebApplication extends RelativeToSetting
  /* 2 */ @js.native
  object WebApplication extends TopLevel[WebApplication with Double]
}
