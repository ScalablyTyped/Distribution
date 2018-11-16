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
  
  val agile: agile with java.lang.String = js.native
  val invalidMarshaling: invalidMarshaling with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val standard: standard with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.FoundationNs.MetadataNs.MarshalingType with java.lang.String] = js.native
}

