package typings.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProductInfoNoGlass3dSupport extends StObject
@JSImport("tizen-tv-webapis", "ProductInfoNoGlass3dSupport")
@js.native
object ProductInfoNoGlass3dSupport extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProductInfoNoGlass3dSupport & Double] = js.native
  
  /**
    * Glasses-free 3D is not supported
    *
    * @since 2.3
    *
    */
  @js.native
  sealed trait NO_GLASS_3D_NOT_SUPPORTED
    extends StObject
       with ProductInfoNoGlass3dSupport
  /* 0 */ val NO_GLASS_3D_NOT_SUPPORTED: typings.tizenTvWebapis.mod.ProductInfoNoGlass3dSupport.NO_GLASS_3D_NOT_SUPPORTED & Double = js.native
  
  /**
    * Glasses-free 3D is supported
    *
    * @since 2.3
    *
    */
  @js.native
  sealed trait NO_GLASS_3D_SUPPORTED
    extends StObject
       with ProductInfoNoGlass3dSupport
  /* 1 */ val NO_GLASS_3D_SUPPORTED: typings.tizenTvWebapis.mod.ProductInfoNoGlass3dSupport.NO_GLASS_3D_SUPPORTED & Double = js.native
}
