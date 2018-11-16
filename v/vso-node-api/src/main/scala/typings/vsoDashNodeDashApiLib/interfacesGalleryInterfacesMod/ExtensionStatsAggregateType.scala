package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExtensionStatsAggregateType extends js.Object

@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ExtensionStatsAggregateType")
@js.native
object ExtensionStatsAggregateType extends js.Object {
  @js.native
  sealed trait Daily
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionStatsAggregateType
  
  /* 1 */ val Daily: Daily with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionStatsAggregateType with scala.Double
  ] = js.native
}

