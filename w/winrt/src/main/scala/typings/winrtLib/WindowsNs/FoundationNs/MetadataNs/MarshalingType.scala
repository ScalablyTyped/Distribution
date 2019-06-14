package typings
package winrtLib.WindowsNs.FoundationNs.MetadataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MarshalingType extends js.Object

@JSGlobal("Windows.Foundation.Metadata.MarshalingType")
@js.native
object MarshalingType extends js.Object {
  @js.native
  sealed trait agile
    extends winrtLib.WindowsNs.FoundationNs.MetadataNs.MarshalingType
  
  @js.native
  sealed trait invalidMarshaling
    extends winrtLib.WindowsNs.FoundationNs.MetadataNs.MarshalingType
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.FoundationNs.MetadataNs.MarshalingType
  
  @js.native
  sealed trait standard
    extends winrtLib.WindowsNs.FoundationNs.MetadataNs.MarshalingType
  
  /* 1 */ val agile: agile with scala.Double = js.native
  /* 3 */ val invalidMarshaling: invalidMarshaling with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 2 */ val standard: standard with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.FoundationNs.MetadataNs.MarshalingType with scala.Double] = js.native
}

