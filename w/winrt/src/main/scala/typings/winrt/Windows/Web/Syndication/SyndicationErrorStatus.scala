package typings.winrt.Windows.Web.Syndication

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Web.Syndication.SyndicationErrorStatus.invalidXml
import typings.winrt.Windows.Web.Syndication.SyndicationErrorStatus.missingRequiredAttribute
import typings.winrt.Windows.Web.Syndication.SyndicationErrorStatus.missingRequiredElement
import typings.winrt.Windows.Web.Syndication.SyndicationErrorStatus.unexpectedContent
import typings.winrt.Windows.Web.Syndication.SyndicationErrorStatus.unknown
import typings.winrt.Windows.Web.Syndication.SyndicationErrorStatus.unsupportedFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SyndicationErrorStatus extends js.Object

@JSGlobal("Windows.Web.Syndication.SyndicationErrorStatus")
@js.native
object SyndicationErrorStatus extends js.Object {
  @js.native
  sealed trait invalidXml extends SyndicationErrorStatus
  
  @js.native
  sealed trait missingRequiredAttribute extends SyndicationErrorStatus
  
  @js.native
  sealed trait missingRequiredElement extends SyndicationErrorStatus
  
  @js.native
  sealed trait unexpectedContent extends SyndicationErrorStatus
  
  @js.native
  sealed trait unknown extends SyndicationErrorStatus
  
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

