package typings.winrtDashUwp.Windows.Media.Core

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Media.Core.TimedMetadataKind.caption
import typings.winrtDashUwp.Windows.Media.Core.TimedMetadataKind.chapter
import typings.winrtDashUwp.Windows.Media.Core.TimedMetadataKind.custom
import typings.winrtDashUwp.Windows.Media.Core.TimedMetadataKind.data
import typings.winrtDashUwp.Windows.Media.Core.TimedMetadataKind.description
import typings.winrtDashUwp.Windows.Media.Core.TimedMetadataKind.subtitle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimedMetadataKind with Double] = js.native
  /* 0 */ @js.native
  object caption extends TopLevel[caption with Double]
  
  /* 1 */ @js.native
  object chapter extends TopLevel[chapter with Double]
  
  /* 2 */ @js.native
  object custom extends TopLevel[custom with Double]
  
  /* 3 */ @js.native
  object data extends TopLevel[data with Double]
  
  /* 4 */ @js.native
  object description extends TopLevel[description with Double]
  
  /* 5 */ @js.native
  object subtitle extends TopLevel[subtitle with Double]
  
}

