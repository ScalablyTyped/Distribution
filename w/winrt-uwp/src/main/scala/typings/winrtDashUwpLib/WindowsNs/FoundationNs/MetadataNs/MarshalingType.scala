package typings
package winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MarshalingType extends js.Object

/** Specifies the marshaling type for the class. */
@JSGlobal("Windows.Foundation.Metadata.MarshalingType")
@js.native
object MarshalingType extends js.Object {
  /** The class marshals and unmarshals to the same pointer value on all interfaces. */
  @js.native
  sealed trait agile
    extends winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs.MarshalingType
  
  /** The class can't be marshaled. */
  @js.native
  sealed trait invalidMarshaling
    extends winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs.MarshalingType
  
  /** The class prevents marshaling on all interfaces. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs.MarshalingType
  
  /** The class does not implement IMarshal or forwards to CoGetStandardMarshal on all interfaces. */
  @js.native
  sealed trait standard
    extends winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs.MarshalingType
  
  /* 1 */ val agile: agile with scala.Double = js.native
  /* 3 */ val invalidMarshaling: invalidMarshaling with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 2 */ val standard: standard with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs.MarshalingType with scala.Double
  ] = js.native
}

