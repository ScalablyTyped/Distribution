package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtensionStatsAggregateType extends StObject
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ExtensionStatsAggregateType")
@js.native
object ExtensionStatsAggregateType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionStatsAggregateType & Double] = js.native
  
  @js.native
  sealed trait Daily
    extends StObject
       with ExtensionStatsAggregateType
  /* 1 */ val Daily: typings.vsoNodeApi.galleryInterfacesMod.ExtensionStatsAggregateType.Daily & Double = js.native
}
