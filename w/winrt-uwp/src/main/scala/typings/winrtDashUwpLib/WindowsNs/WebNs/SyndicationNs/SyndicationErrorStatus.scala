package typings
package winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs

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
  sealed trait invalidXml
    extends winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.SyndicationErrorStatus
  
  /** A required attribute is missing. */
  @js.native
  sealed trait missingRequiredAttribute
    extends winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.SyndicationErrorStatus
  
  /** A required element is missing. */
  @js.native
  sealed trait missingRequiredElement
    extends winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.SyndicationErrorStatus
  
  /** An unexpected error was encountered with the content. */
  @js.native
  sealed trait unexpectedContent
    extends winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.SyndicationErrorStatus
  
  /** An unknown error has occurred. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.SyndicationErrorStatus
  
  /** The content is not presented in a supported format. */
  @js.native
  sealed trait unsupportedFormat
    extends winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.SyndicationErrorStatus
  
  /* 3 */ val invalidXml: invalidXml with scala.Double = js.native
  /* 2 */ val missingRequiredAttribute: missingRequiredAttribute with scala.Double = js.native
  /* 1 */ val missingRequiredElement: missingRequiredElement with scala.Double = js.native
  /* 4 */ val unexpectedContent: unexpectedContent with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  /* 5 */ val unsupportedFormat: unsupportedFormat with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.SyndicationErrorStatus with scala.Double
  ] = js.native
}

