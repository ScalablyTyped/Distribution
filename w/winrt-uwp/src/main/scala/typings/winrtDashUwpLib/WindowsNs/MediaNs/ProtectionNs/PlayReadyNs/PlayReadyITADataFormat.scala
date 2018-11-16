package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PlayReadyITADataFormat extends js.Object

/** Specifies the format for the ITA serialized data. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyITADataFormat")
@js.native
object PlayReadyITADataFormat extends js.Object {
  /** Returns he serialized IPropertySet as detailed in the remarks for the PlayReadyITADataGenerator.GenerateData method. */
  @js.native
  sealed trait serializedProperties
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.PlayReadyITADataFormat
  
  /** Returns the entire serialized blob including the content protection system GUID, the stream count, and the next stream ID block. */
  @js.native
  sealed trait serializedProperties_WithContentProtectionWrapper
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.PlayReadyITADataFormat
  
  val serializedProperties: serializedProperties with java.lang.String = js.native
  val serializedProperties_WithContentProtectionWrapper: serializedProperties_WithContentProtectionWrapper with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.PlayReadyITADataFormat with java.lang.String
  ] = js.native
}

