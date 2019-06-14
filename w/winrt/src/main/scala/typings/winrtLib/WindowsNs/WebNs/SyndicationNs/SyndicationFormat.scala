package typings
package winrtLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SyndicationFormat extends js.Object

@JSGlobal("Windows.Web.Syndication.SyndicationFormat")
@js.native
object SyndicationFormat extends js.Object {
  @js.native
  sealed trait atom03
    extends winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationFormat
  
  @js.native
  sealed trait atom10
    extends winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationFormat
  
  @js.native
  sealed trait rss091
    extends winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationFormat
  
  @js.native
  sealed trait rss092
    extends winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationFormat
  
  @js.native
  sealed trait rss10
    extends winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationFormat
  
  @js.native
  sealed trait rss20
    extends winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationFormat
  
  /* 5 */ val atom03: atom03 with scala.Double = js.native
  /* 0 */ val atom10: atom10 with scala.Double = js.native
  /* 4 */ val rss091: rss091 with scala.Double = js.native
  /* 3 */ val rss092: rss092 with scala.Double = js.native
  /* 2 */ val rss10: rss10 with scala.Double = js.native
  /* 1 */ val rss20: rss20 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationFormat with scala.Double] = js.native
}

