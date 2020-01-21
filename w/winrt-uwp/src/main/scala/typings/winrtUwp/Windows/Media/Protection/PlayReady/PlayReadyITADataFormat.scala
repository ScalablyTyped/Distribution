package typings.winrtUwp.Windows.Media.Protection.PlayReady

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PlayReadyITADataFormat extends js.Object

/** Specifies the format for the ITA serialized data. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyITADataFormat")
@js.native
object PlayReadyITADataFormat extends js.Object {
  /** Returns the serialized IPropertySet as detailed in the remarks for the PlayReadyITADataGenerator.GenerateData method. */
  @js.native
  sealed trait serializedProperties extends PlayReadyITADataFormat
  
  /** Returns the entire serialized blob including the content protection system GUID, the stream count, and the next stream ID block. */
  @js.native
  sealed trait serializedProperties_WithContentProtectionWrapper extends PlayReadyITADataFormat
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PlayReadyITADataFormat with Double] = js.native
  /* 0 */ @js.native
  object serializedProperties extends TopLevel[serializedProperties with Double]
  
  /* 1 */ @js.native
  object serializedProperties_WithContentProtectionWrapper extends TopLevel[serializedProperties_WithContentProtectionWrapper with Double]
  
}

