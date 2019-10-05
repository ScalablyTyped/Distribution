package typings.winrtDashUwp.Windows.Web.Syndication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SyndicationFormat extends js.Object

/** Specifies the syndication formats supported by the API. */
@JSGlobal("Windows.Web.Syndication.SyndicationFormat")
@js.native
object SyndicationFormat extends js.Object {
  /** The API supports the Atom 0.3 format. */
  @js.native
  sealed trait atom03 extends SyndicationFormat
  
  /** The API supports the Atom 1.0 format. */
  @js.native
  sealed trait atom10 extends SyndicationFormat
  
  /** The API supports the RSS 0.91 format. */
  @js.native
  sealed trait rss091 extends SyndicationFormat
  
  /** The API supports the RSS 0.92 format. */
  @js.native
  sealed trait rss092 extends SyndicationFormat
  
  /** The API supports the RSS 1.0 format. */
  @js.native
  sealed trait rss10 extends SyndicationFormat
  
  /** The API supports the RSS 2.0 format. */
  @js.native
  sealed trait rss20 extends SyndicationFormat
  
  /* 5 */ val atom03: typings.winrtDashUwp.Windows.Web.Syndication.SyndicationFormat.atom03 with Double = js.native
  /* 0 */ val atom10: typings.winrtDashUwp.Windows.Web.Syndication.SyndicationFormat.atom10 with Double = js.native
  /* 4 */ val rss091: typings.winrtDashUwp.Windows.Web.Syndication.SyndicationFormat.rss091 with Double = js.native
  /* 3 */ val rss092: typings.winrtDashUwp.Windows.Web.Syndication.SyndicationFormat.rss092 with Double = js.native
  /* 2 */ val rss10: typings.winrtDashUwp.Windows.Web.Syndication.SyndicationFormat.rss10 with Double = js.native
  /* 1 */ val rss20: typings.winrtDashUwp.Windows.Web.Syndication.SyndicationFormat.rss20 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SyndicationFormat with Double] = js.native
}

