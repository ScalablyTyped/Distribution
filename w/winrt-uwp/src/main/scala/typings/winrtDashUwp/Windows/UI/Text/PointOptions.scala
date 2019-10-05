package typings.winrtDashUwp.Windows.UI.Text

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
  sealed trait allowOffClient extends PointOptions
  
  /** Return client coordinates instead of screen coordinates. */
  @js.native
  sealed trait clientCoordinates extends PointOptions
  
  /** Add left and top insets to the left and top coordinates of the rectangle, and subtract right and bottom insets from the right and bottom coordinates. */
  @js.native
  sealed trait includeInset extends PointOptions
  
  /** Horizontal scrolling is disabled. */
  @js.native
  sealed trait noHorizontalScroll extends PointOptions
  
  /** Vertical scrolling is disabled. */
  @js.native
  sealed trait noVerticalScroll extends PointOptions
  
  /** No options. */
  @js.native
  sealed trait none extends PointOptions
  
  /** The start position of the text range. */
  @js.native
  sealed trait start extends PointOptions
  
  /** Transform coordinates using a world transform supplied by the host app. */
  @js.native
  sealed trait transform extends PointOptions
  
  /* 4 */ val allowOffClient: typings.winrtDashUwp.Windows.UI.Text.PointOptions.allowOffClient with Double = js.native
  /* 3 */ val clientCoordinates: typings.winrtDashUwp.Windows.UI.Text.PointOptions.clientCoordinates with Double = js.native
  /* 1 */ val includeInset: typings.winrtDashUwp.Windows.UI.Text.PointOptions.includeInset with Double = js.native
  /* 6 */ val noHorizontalScroll: typings.winrtDashUwp.Windows.UI.Text.PointOptions.noHorizontalScroll with Double = js.native
  /* 7 */ val noVerticalScroll: typings.winrtDashUwp.Windows.UI.Text.PointOptions.noVerticalScroll with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.Windows.UI.Text.PointOptions.none with Double = js.native
  /* 2 */ val start: typings.winrtDashUwp.Windows.UI.Text.PointOptions.start with Double = js.native
  /* 5 */ val transform: typings.winrtDashUwp.Windows.UI.Text.PointOptions.transform with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PointOptions with Double] = js.native
}

