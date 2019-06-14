package typings
package winrtDashUwpLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PointOptions extends js.Object

/** Defines options for specifying or retrieving a point. */
@JSGlobal("Windows.UI.Text.PointOptions")
@js.native
object PointOptions extends js.Object {
  /** Allow points outside of the client area. */
  @js.native
  sealed trait allowOffClient
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.PointOptions
  
  /** Return client coordinates instead of screen coordinates. */
  @js.native
  sealed trait clientCoordinates
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.PointOptions
  
  /** Add left and top insets to the left and top coordinates of the rectangle, and subtract right and bottom insets from the right and bottom coordinates. */
  @js.native
  sealed trait includeInset
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.PointOptions
  
  /** Horizontal scrolling is disabled. */
  @js.native
  sealed trait noHorizontalScroll
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.PointOptions
  
  /** Vertical scrolling is disabled. */
  @js.native
  sealed trait noVerticalScroll
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.PointOptions
  
  /** No options. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.PointOptions
  
  /** The start position of the text range. */
  @js.native
  sealed trait start
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.PointOptions
  
  /** Transform coordinates using a world transform supplied by the host app. */
  @js.native
  sealed trait transform
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.PointOptions
  
  /* 4 */ val allowOffClient: allowOffClient with scala.Double = js.native
  /* 3 */ val clientCoordinates: clientCoordinates with scala.Double = js.native
  /* 1 */ val includeInset: includeInset with scala.Double = js.native
  /* 6 */ val noHorizontalScroll: noHorizontalScroll with scala.Double = js.native
  /* 7 */ val noVerticalScroll: noVerticalScroll with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 2 */ val start: start with scala.Double = js.native
  /* 5 */ val transform: transform with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.TextNs.PointOptions with scala.Double] = js.native
}

