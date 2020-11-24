package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TimedMetadataKind extends js.Object
/** Specifies the types of metadata that may be present in a TimedMetadataTrack . */
@JSGlobal("Windows.Media.Core.TimedMetadataKind")
@js.native
object TimedMetadataKind extends js.Object {
  
  /** The metadata contains caption text. */
  @js.native
  sealed trait caption extends TimedMetadataKind
  
  /** The metadata contains chapter information. */
  @js.native
  sealed trait chapter extends TimedMetadataKind
  
  /** The metadata contains custom data. */
  @js.native
  sealed trait custom extends TimedMetadataKind
  
  /** The metadata contains data. */
  @js.native
  sealed trait data extends TimedMetadataKind
  
  /** The metadata contains description text. */
  @js.native
  sealed trait description extends TimedMetadataKind
  
  /** The metadata contains subtitle text. */
  @js.native
  sealed trait subtitle extends TimedMetadataKind
}
