package typings.tizenCommonWeb.tizenMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BundleValueType extends js.Object

@JSImport("tizen-common-web/tizen", "BundleValueType")
@js.native
object BundleValueType extends js.Object {
  @js.native
  sealed trait BYTES extends BundleValueType
  
  @js.native
  sealed trait BYTES_ARRAY extends BundleValueType
  
  @js.native
  sealed trait STRING extends BundleValueType
  
  @js.native
  sealed trait STRING_ARRAY extends BundleValueType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BundleValueType with String] = js.native
  /* "BYTES" */ @js.native
  object BYTES extends TopLevel[BYTES with String]
  
  /* "BYTES_ARRAY" */ @js.native
  object BYTES_ARRAY extends TopLevel[BYTES_ARRAY with String]
  
  /* "STRING" */ @js.native
  object STRING extends TopLevel[STRING with String]
  
  /* "STRING_ARRAY" */ @js.native
  object STRING_ARRAY extends TopLevel[STRING_ARRAY with String]
  
}

