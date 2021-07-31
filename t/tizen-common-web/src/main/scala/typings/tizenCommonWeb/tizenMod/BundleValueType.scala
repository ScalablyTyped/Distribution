package typings.tizenCommonWeb.tizenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BundleValueType extends StObject
@JSImport("tizen-common-web/tizen", "BundleValueType")
@js.native
object BundleValueType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BundleValueType & String] = js.native
  
  @js.native
  sealed trait BYTES
    extends StObject
       with BundleValueType
  /* "BYTES" */ val BYTES: typings.tizenCommonWeb.tizenMod.BundleValueType.BYTES & String = js.native
  
  @js.native
  sealed trait BYTES_ARRAY
    extends StObject
       with BundleValueType
  /* "BYTES_ARRAY" */ val BYTES_ARRAY: typings.tizenCommonWeb.tizenMod.BundleValueType.BYTES_ARRAY & String = js.native
  
  @js.native
  sealed trait STRING
    extends StObject
       with BundleValueType
  /* "STRING" */ val STRING: typings.tizenCommonWeb.tizenMod.BundleValueType.STRING & String = js.native
  
  @js.native
  sealed trait STRING_ARRAY
    extends StObject
       with BundleValueType
  /* "STRING_ARRAY" */ val STRING_ARRAY: typings.tizenCommonWeb.tizenMod.BundleValueType.STRING_ARRAY & String = js.native
}
