package typings.winrtUwp.Windows.Media.Protection.PlayReady

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlayReadyITADataFormat extends StObject
/** Specifies the format for the ITA serialized data. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyITADataFormat")
@js.native
object PlayReadyITADataFormat extends StObject {
  
  /** Returns the serialized IPropertySet as detailed in the remarks for the PlayReadyITADataGenerator.GenerateData method. */
  @js.native
  sealed trait serializedProperties
    extends StObject
       with PlayReadyITADataFormat
  
  /** Returns the entire serialized blob including the content protection system GUID, the stream count, and the next stream ID block. */
  @js.native
  sealed trait serializedProperties_WithContentProtectionWrapper
    extends StObject
       with PlayReadyITADataFormat
}
