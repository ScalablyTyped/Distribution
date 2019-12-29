package typings.winrt.Windows.Web.Syndication

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SyndicationFormat extends js.Object

@JSGlobal("Windows.Web.Syndication.SyndicationFormat")
@js.native
object SyndicationFormat extends js.Object {
  @js.native
  sealed trait atom03 extends SyndicationFormat
  
  @js.native
  sealed trait atom10 extends SyndicationFormat
  
  @js.native
  sealed trait rss091 extends SyndicationFormat
  
  @js.native
  sealed trait rss092 extends SyndicationFormat
  
  @js.native
  sealed trait rss10 extends SyndicationFormat
  
  @js.native
  sealed trait rss20 extends SyndicationFormat
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SyndicationFormat with Double] = js.native
  /* 5 */ @js.native
  object atom03 extends TopLevel[atom03 with Double]
  
  /* 0 */ @js.native
  object atom10 extends TopLevel[atom10 with Double]
  
  /* 4 */ @js.native
  object rss091 extends TopLevel[rss091 with Double]
  
  /* 3 */ @js.native
  object rss092 extends TopLevel[rss092 with Double]
  
  /* 2 */ @js.native
  object rss10 extends TopLevel[rss10 with Double]
  
  /* 1 */ @js.native
  object rss20 extends TopLevel[rss20 with Double]
  
}

