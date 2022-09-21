package typings.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProductInfoSiServerType extends StObject
@JSImport("tizen-tv-webapis", "ProductInfoSiServerType")
@js.native
object ProductInfoSiServerType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProductInfoSiServerType & Double] = js.native
  
  /**
    * Developing
    *
    * @since 2.3
    *
    */
  @js.native
  sealed trait SI_TYPE_DEVELOPING_SERVER
    extends StObject
       with ProductInfoSiServerType
  /* 2 */ val SI_TYPE_DEVELOPING_SERVER: typings.tizenTvWebapis.mod.ProductInfoSiServerType.SI_TYPE_DEVELOPING_SERVER & Double = js.native
  
  /**
    * Development
    *
    * @since 2.3
    *
    */
  @js.native
  sealed trait SI_TYPE_DEVELOPMENT_SERVER
    extends StObject
       with ProductInfoSiServerType
  /* 1 */ val SI_TYPE_DEVELOPMENT_SERVER: typings.tizenTvWebapis.mod.ProductInfoSiServerType.SI_TYPE_DEVELOPMENT_SERVER & Double = js.native
  
  /**
    * Operating
    *
    * @since 2.3
    *
    */
  @js.native
  sealed trait SI_TYPE_OPERATIING_SERVER
    extends StObject
       with ProductInfoSiServerType
  /* 0 */ val SI_TYPE_OPERATIING_SERVER: typings.tizenTvWebapis.mod.ProductInfoSiServerType.SI_TYPE_OPERATIING_SERVER & Double = js.native
}
