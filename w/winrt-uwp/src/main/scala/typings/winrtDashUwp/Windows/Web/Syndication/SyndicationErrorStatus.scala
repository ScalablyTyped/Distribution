package typings.winrtDashUwp.Windows.Web.Syndication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SyndicationErrorStatus extends js.Object

/** Defines errors encountered during a Syndication operation. */
@JSGlobal("Windows.Web.Syndication.SyndicationErrorStatus")
@js.native
object SyndicationErrorStatus extends js.Object {
  /** The provided XML is not valid. */
  @js.native
  sealed trait invalidXml extends SyndicationErrorStatus
  
  /** A required attribute is missing. */
  @js.native
  sealed trait missingRequiredAttribute extends SyndicationErrorStatus
  
  /** A required element is missing. */
  @js.native
  sealed trait missingRequiredElement extends SyndicationErrorStatus
  
  /** An unexpected error was encountered with the content. */
  @js.native
  sealed trait unexpectedContent extends SyndicationErrorStatus
  
  /** An unknown error has occurred. */
  @js.native
  sealed trait unknown extends SyndicationErrorStatus
  
  /** The content is not presented in a supported format. */
  @js.native
  sealed trait unsupportedFormat extends SyndicationErrorStatus
  
  /* 3 */ val invalidXml: typings.winrtDashUwp.Windows.Web.Syndication.SyndicationErrorStatus.invalidXml with Double = js.native
  /* 2 */ val missingRequiredAttribute: typings.winrtDashUwp.Windows.Web.Syndication.SyndicationErrorStatus.missingRequiredAttribute with Double = js.native
  /* 1 */ val missingRequiredElement: typings.winrtDashUwp.Windows.Web.Syndication.SyndicationErrorStatus.missingRequiredElement with Double = js.native
  /* 4 */ val unexpectedContent: typings.winrtDashUwp.Windows.Web.Syndication.SyndicationErrorStatus.unexpectedContent with Double = js.native
  /* 0 */ val unknown: typings.winrtDashUwp.Windows.Web.Syndication.SyndicationErrorStatus.unknown with Double = js.native
  /* 5 */ val unsupportedFormat: typings.winrtDashUwp.Windows.Web.Syndication.SyndicationErrorStatus.unsupportedFormat with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SyndicationErrorStatus with Double] = js.native
}

