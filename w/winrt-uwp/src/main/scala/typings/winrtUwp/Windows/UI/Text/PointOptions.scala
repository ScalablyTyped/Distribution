package typings.winrtUwp.Windows.UI.Text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PointOptions extends StObject
/** Defines options for specifying or retrieving a point. */
@JSGlobal("Windows.UI.Text.PointOptions")
@js.native
object PointOptions extends StObject {
  
  /** Allow points outside of the client area. */
  @js.native
  sealed trait allowOffClient
    extends StObject
       with PointOptions
  
  /** Return client coordinates instead of screen coordinates. */
  @js.native
  sealed trait clientCoordinates
    extends StObject
       with PointOptions
  
  /** Add left and top insets to the left and top coordinates of the rectangle, and subtract right and bottom insets from the right and bottom coordinates. */
  @js.native
  sealed trait includeInset
    extends StObject
       with PointOptions
  
  /** Horizontal scrolling is disabled. */
  @js.native
  sealed trait noHorizontalScroll
    extends StObject
       with PointOptions
  
  /** Vertical scrolling is disabled. */
  @js.native
  sealed trait noVerticalScroll
    extends StObject
       with PointOptions
  
  /** No options. */
  @js.native
  sealed trait none
    extends StObject
       with PointOptions
  
  /** The start position of the text range. */
  @js.native
  sealed trait start
    extends StObject
       with PointOptions
  
  /** Transform coordinates using a world transform supplied by the host app. */
  @js.native
  sealed trait transform
    extends StObject
       with PointOptions
}
