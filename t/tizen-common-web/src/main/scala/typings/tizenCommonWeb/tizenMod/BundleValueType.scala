package typings.tizenCommonWeb.tizenMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BundleValueType extends js.Object
@JSImport("tizen-common-web/tizen", "BundleValueType")
@js.native
object BundleValueType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BundleValueType with String] = js.native
  
  @js.native
  sealed trait BYTES extends BundleValueType
  /* "BYTES" */ @js.native
  object BYTES extends TopLevel[BYTES with String]
  
  @js.native
  sealed trait BYTES_ARRAY extends BundleValueType
  /* "BYTES_ARRAY" */ @js.native
  object BYTES_ARRAY extends TopLevel[BYTES_ARRAY with String]
  
  @js.native
  sealed trait STRING extends BundleValueType
  /* "STRING" */ @js.native
  object STRING extends TopLevel[STRING with String]
  
  @js.native
  sealed trait STRING_ARRAY extends BundleValueType
  /* "STRING_ARRAY" */ @js.native
  object STRING_ARRAY extends TopLevel[STRING_ARRAY with String]
}
