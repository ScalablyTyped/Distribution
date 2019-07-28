package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

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
  
  /* 1 */ val Daily: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionStatsAggregateType.Daily with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionStatsAggregateType with Double] = js.native
}

