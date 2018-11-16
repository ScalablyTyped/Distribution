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
  
  val agile: agile with java.lang.String = js.native
  val invalidMarshaling: invalidMarshaling with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val standard: standard with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs.MarshalingType with java.lang.String
  ] = js.native
}

