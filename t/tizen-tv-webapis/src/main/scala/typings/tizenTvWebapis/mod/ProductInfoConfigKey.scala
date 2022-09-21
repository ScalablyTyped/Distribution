package typings.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProductInfoConfigKey extends StObject
@JSImport("tizen-tv-webapis", "ProductInfoConfigKey")
@js.native
object ProductInfoConfigKey extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProductInfoConfigKey & Double] = js.native
  
  /**
    * Data service configuration, it can be setted as string ype with numbers
    *
    * @since 2.3
    *
    */
  @js.native
  sealed trait CONFIG_KEY_DATA_SERVICE
    extends StObject
       with ProductInfoConfigKey
  /* 0 */ val CONFIG_KEY_DATA_SERVICE: typings.tizenTvWebapis.mod.ProductInfoConfigKey.CONFIG_KEY_DATA_SERVICE & Double = js.native
  
  /**
    * Service country, readonly
    *
    * @since 2.3
    *
    */
  @js.native
  sealed trait CONFIG_KEY_SERVICE_COUNTRY
    extends StObject
       with ProductInfoConfigKey
  /* 1 */ val CONFIG_KEY_SERVICE_COUNTRY: typings.tizenTvWebapis.mod.ProductInfoConfigKey.CONFIG_KEY_SERVICE_COUNTRY & Double = js.native
}
