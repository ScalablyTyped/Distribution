package typings.winrt.Windows.Web.Syndication

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
  
}

