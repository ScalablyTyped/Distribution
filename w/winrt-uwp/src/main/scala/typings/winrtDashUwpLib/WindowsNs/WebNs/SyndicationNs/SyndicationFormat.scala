package typings
package winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs

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
  sealed trait atom03
    extends winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.SyndicationFormat
  
  /** The API supports the Atom 1.0 format. */
  @js.native
  sealed trait atom10
    extends winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.SyndicationFormat
  
  /** The API supports the RSS 0.91 format. */
  @js.native
  sealed trait rss091
    extends winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.SyndicationFormat
  
  /** The API supports the RSS 0.92 format. */
  @js.native
  sealed trait rss092
    extends winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.SyndicationFormat
  
  /** The API supports the RSS 1.0 format. */
  @js.native
  sealed trait rss10
    extends winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.SyndicationFormat
  
  /** The API supports the RSS 2.0 format. */
  @js.native
  sealed trait rss20
    extends winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.SyndicationFormat
  
  val atom03: atom03 with java.lang.String = js.native
  val atom10: atom10 with java.lang.String = js.native
  val rss091: rss091 with java.lang.String = js.native
  val rss092: rss092 with java.lang.String = js.native
  val rss10: rss10 with java.lang.String = js.native
  val rss20: rss20 with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.SyndicationFormat with java.lang.String
  ] = js.native
}

