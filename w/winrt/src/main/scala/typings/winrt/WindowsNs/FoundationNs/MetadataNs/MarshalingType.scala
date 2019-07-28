package typings.winrt.WindowsNs.FoundationNs.MetadataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MarshalingType extends js.Object

@JSGlobal("Windows.Foundation.Metadata.MarshalingType")
@js.native
object MarshalingType extends js.Object {
  @js.native
  sealed trait agile extends MarshalingType
  
  @js.native
  sealed trait invalidMarshaling extends MarshalingType
  
  @js.native
  sealed trait none extends MarshalingType
  
  @js.native
  sealed trait standard extends MarshalingType
  
  /* 1 */ val agile: typings.winrt.WindowsNs.FoundationNs.MetadataNs.MarshalingType.agile with Double = js.native
  /* 3 */ val invalidMarshaling: typings.winrt.WindowsNs.FoundationNs.MetadataNs.MarshalingType.invalidMarshaling with Double = js.native
  /* 0 */ val none: typings.winrt.WindowsNs.FoundationNs.MetadataNs.MarshalingType.none with Double = js.native
  /* 2 */ val standard: typings.winrt.WindowsNs.FoundationNs.MetadataNs.MarshalingType.standard with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MarshalingType with Double] = js.native
}

