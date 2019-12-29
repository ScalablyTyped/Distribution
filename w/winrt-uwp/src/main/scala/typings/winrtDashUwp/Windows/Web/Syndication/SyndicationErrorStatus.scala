package typings.winrtDashUwp.Windows.Web.Syndication

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SyndicationErrorStatus with Double] = js.native
  /* 3 */ @js.native
  object invalidXml extends TopLevel[invalidXml with Double]
  
  /* 2 */ @js.native
  object missingRequiredAttribute extends TopLevel[missingRequiredAttribute with Double]
  
  /* 1 */ @js.native
  object missingRequiredElement extends TopLevel[missingRequiredElement with Double]
  
  /* 4 */ @js.native
  object unexpectedContent extends TopLevel[unexpectedContent with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
  /* 5 */ @js.native
  object unsupportedFormat extends TopLevel[unsupportedFormat with Double]
  
}

