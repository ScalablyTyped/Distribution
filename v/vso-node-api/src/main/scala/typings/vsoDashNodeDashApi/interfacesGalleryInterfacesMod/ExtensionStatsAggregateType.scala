package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExtensionStatsAggregateType extends js.Object

@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ExtensionStatsAggregateType")
@js.native
object ExtensionStatsAggregateType extends js.Object {
  @js.native
  sealed trait Daily extends ExtensionStatsAggregateType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionStatsAggregateType with Double] = js.native
  /* 1 */ @js.native
  object Daily extends TopLevel[Daily with Double]
  
}

