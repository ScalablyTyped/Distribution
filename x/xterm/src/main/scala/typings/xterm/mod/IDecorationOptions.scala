package typings.xterm.mod

import typings.xterm.xtermStrings.bottom
import typings.xterm.xtermStrings.left
import typings.xterm.xtermStrings.right
import typings.xterm.xtermStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDecorationOptions extends StObject {
  
  /*
    * Where the decoration will be anchored -
    * defaults to the left edge
    */
  val anchor: js.UndefOr[right | left] = js.undefined
  
  /**
    * The background color of the cell(s). When 2 decorations both set the foreground color the
    * last registered decoration will be used. Only the `#RRGGBB` format is supported.
    */
  val backgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * The foreground color of the cell(s). When 2 decorations both set the foreground color the
    * last registered decoration will be used. Only the `#RRGGBB` format is supported.
    */
  val foregroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * The height of the decoration in cells, defaults to 1.
    */
  val height: js.UndefOr[Double] = js.undefined
  
  /**
    * What layer to render the decoration at when {@link backgroundColor} or
    * {@link foregroundColor} are used. `'bottom'` will render under the selection, `'top`' will
    * render above the selection\*.
    *
    * *\* The selection will render on top regardless of layer on the canvas renderer due to how
    * it renders selection separately.*
    */
  val layer: js.UndefOr[bottom | top] = js.undefined
  
  /**
    * The line in the terminal where
    * the decoration will be displayed
    */
  val marker: IMarker
  
  /**
    * When defined, renders the decoration in the overview ruler to the right
    * of the terminal. {@link ITerminalOptions.overviewRulerWidth} must be set
    * in order to see the overview ruler.
    * @param color The color of the decoration.
    * @param position The position of the decoration.
    */
  var overviewRulerOptions: js.UndefOr[IDecorationOverviewRulerOptions] = js.undefined
  
  /**
    * The width of the decoration in cells, defaults to 1.
    */
  val width: js.UndefOr[Double] = js.undefined
  
  /**
    * The x position offset relative to the anchor
    */
  val x: js.UndefOr[Double] = js.undefined
}
object IDecorationOptions {
  
  inline def apply(marker: IMarker): IDecorationOptions = {
    val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDecorationOptions]
  }
  
  extension [Self <: IDecorationOptions](x: Self) {
    
    inline def setAnchor(value: right | left): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setForegroundColor(value: String): Self = StObject.set(x, "foregroundColor", value.asInstanceOf[js.Any])
    
    inline def setForegroundColorUndefined: Self = StObject.set(x, "foregroundColor", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLayer(value: bottom | top): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    inline def setMarker(value: IMarker): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setOverviewRulerOptions(value: IDecorationOverviewRulerOptions): Self = StObject.set(x, "overviewRulerOptions", value.asInstanceOf[js.Any])
    
    inline def setOverviewRulerOptionsUndefined: Self = StObject.set(x, "overviewRulerOptions", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
