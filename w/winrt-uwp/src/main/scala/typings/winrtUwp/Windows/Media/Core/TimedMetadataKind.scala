package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TimedMetadataKind extends StObject
/** Specifies the types of metadata that may be present in a TimedMetadataTrack . */
@JSGlobal("Windows.Media.Core.TimedMetadataKind")
@js.native
object TimedMetadataKind extends StObject {
  
  /** The metadata contains caption text. */
  @js.native
  sealed trait caption
    extends StObject
       with TimedMetadataKind
  
  /** The metadata contains chapter information. */
  @js.native
  sealed trait chapter
    extends StObject
       with TimedMetadataKind
  
  /** The metadata contains custom data. */
  @js.native
  sealed trait custom
    extends StObject
       with TimedMetadataKind
  
  /** The metadata contains data. */
  @js.native
  sealed trait data
    extends StObject
       with TimedMetadataKind
  
  /** The metadata contains description text. */
  @js.native
  sealed trait description
    extends StObject
       with TimedMetadataKind
  
  /** The metadata contains subtitle text. */
  @js.native
  sealed trait subtitle
    extends StObject
       with TimedMetadataKind
}
