package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtensionStatsAggregateType extends js.Object
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ExtensionStatsAggregateType")
@js.native
object ExtensionStatsAggregateType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionStatsAggregateType with Double] = js.native
  
  @js.native
  sealed trait Daily extends ExtensionStatsAggregateType
  /* 1 */ @js.native
  object Daily extends TopLevel[Daily with Double]
}
