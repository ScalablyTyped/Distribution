package typings.vegaTypings

import typings.vegaTypings.anon.Index
import typings.vegaTypings.anon.Role
import typings.vegaTypings.vegaTypingsStrings.ltr
import typings.vegaTypings.vegaTypingsStrings.rtl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sceneMod {
  
  @JSImport("vega-typings/types/runtime/scene", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vega-typings/types/runtime/scene", "Bounds")
  @js.native
  class Bounds () extends StObject {
    
    def add(x: Double, y: Double): Bounds = js.native
    
    def alignsWith(b: Bounds): Boolean = js.native
    
    def clear(): Bounds = js.native
    
    def contains(x: Double, y: Double): Boolean = js.native
    
    def empty(): Unit = js.native
    
    def encloses(b: Bounds): Boolean = js.native
    
    def equals(b: Bounds): Boolean = js.native
    
    def expand(d: Double): Bounds = js.native
    
    def height(): Double = js.native
    
    def intersects(b: Bounds): Boolean = js.native
    
    def rotate(angle: Double, x: Double, y: Double): Bounds = js.native
    
    def rotatedPoints(angle: Double, x: Double, y: Double): js.Array[Double] = js.native
    
    def round(): Bounds = js.native
    
    def set(x1: Double, y1: Double, x2: Double, y2: Double): Bounds = js.native
    
    def translate(dx: Double, dy: Double): Bounds = js.native
    
    def union(b: Bounds): Bounds = js.native
    
    def width(): Double = js.native
    
    var x1: Double = js.native
    
    var x2: Double = js.native
    
    var y1: Double = js.native
    
    var y2: Double = js.native
  }
  
  inline def sceneVisit(scene: SceneGroup, itemCallback: js.Function1[/* item */ Scene | SceneGroup | SceneItem, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sceneVisit")(scene.asInstanceOf[js.Any], itemCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sceneVisit(scene: Scene, itemCallback: js.Function1[/* item */ Scene | SceneGroup | SceneItem, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sceneVisit")(scene.asInstanceOf[js.Any], itemCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Scene extends StObject {
    
    var bounds: Bounds
    
    var clip: Boolean
    
    var interactive: Boolean
    
    var items: js.Array[SceneGroup]
    
    var marktype: String
    
    var name: String
    
    var role: String
  }
  object Scene {
    
    inline def apply(
      bounds: Bounds,
      clip: Boolean,
      interactive: Boolean,
      items: js.Array[SceneGroup],
      marktype: String,
      name: String,
      role: String
    ): Scene = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], clip = clip.asInstanceOf[js.Any], interactive = interactive.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], marktype = marktype.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scene]
    }
    
    extension [Self <: Scene](x: Self) {
      
      inline def setBounds(value: Bounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setClip(value: Boolean): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
      
      inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      inline def setItems(value: js.Array[SceneGroup]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: SceneGroup*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      inline def setMarktype(value: String): Self = StObject.set(x, "marktype", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    }
  }
  
  trait SceneContext extends StObject {
    
    var background: js.UndefOr[String] = js.undefined
  }
  object SceneContext {
    
    inline def apply(): SceneContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SceneContext]
    }
    
    extension [Self <: SceneContext](x: Self) {
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    }
  }
  
  trait SceneGroup
    extends StObject
       with SceneItem {
    
    var context: SceneContext
    
    var height: Double
    
    var items: js.Array[SceneItem]
    
    var stroke: js.UndefOr[String] = js.undefined
    
    var width: Double
  }
  object SceneGroup {
    
    inline def apply(
      bounds: Bounds,
      context: SceneContext,
      height: Double,
      items: js.Array[SceneItem],
      mark: Role,
      width: Double,
      x: Double,
      y: Double
    ): SceneGroup = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[SceneGroup]
    }
    
    extension [Self <: SceneGroup](x: Self) {
      
      inline def setContext(value: SceneContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setItems(value: js.Array[SceneItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: SceneItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait SceneItem extends StObject {
    
    var bounds: Bounds
    
    var datum: js.UndefOr[js.Object] = js.undefined
    
    var mark: Role
    
    var x: Double
    
    var y: Double
  }
  object SceneItem {
    
    inline def apply(bounds: Bounds, mark: Role, x: Double, y: Double): SceneItem = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[SceneItem]
    }
    
    extension [Self <: SceneItem](x: Self) {
      
      inline def setBounds(value: Bounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setDatum(value: js.Object): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
      
      inline def setDatumUndefined: Self = StObject.set(x, "datum", js.undefined)
      
      inline def setMark(value: Role): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait SceneLegendItem extends StObject {
    
    var datum: Index
  }
  object SceneLegendItem {
    
    inline def apply(datum: Index): SceneLegendItem = {
      val __obj = js.Dynamic.literal(datum = datum.asInstanceOf[js.Any])
      __obj.asInstanceOf[SceneLegendItem]
    }
    
    extension [Self <: SceneLegendItem](x: Self) {
      
      inline def setDatum(value: Index): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
    }
  }
  
  trait SceneLine
    extends StObject
       with SceneItem {
    
    var opacity: Double
    
    var stroke: String
    
    var strokeWidth: Double
    
    var x2: Double
    
    var y2: Double
  }
  object SceneLine {
    
    inline def apply(
      bounds: Bounds,
      mark: Role,
      opacity: Double,
      stroke: String,
      strokeWidth: Double,
      x: Double,
      x2: Double,
      y: Double,
      y2: Double
    ): SceneLine = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
      __obj.asInstanceOf[SceneLine]
    }
    
    extension [Self <: SceneLine](x: Self) {
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    }
  }
  
  trait SceneRect
    extends StObject
       with SceneItem {
    
    var fill: String
    
    var height: Double
    
    var width: Double
  }
  object SceneRect {
    
    inline def apply(bounds: Bounds, fill: String, height: Double, mark: Role, width: Double, x: Double, y: Double): SceneRect = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[SceneRect]
    }
    
    extension [Self <: SceneRect](x: Self) {
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait SceneSymbol
    extends StObject
       with SceneItem {
    
    var fill: String
    
    var shape: String
    
    var size: Double
    
    var strokeWidth: Double
  }
  object SceneSymbol {
    
    inline def apply(
      bounds: Bounds,
      fill: String,
      mark: Role,
      shape: String,
      size: Double,
      strokeWidth: Double,
      x: Double,
      y: Double
    ): SceneSymbol = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[SceneSymbol]
    }
    
    extension [Self <: SceneSymbol](x: Self) {
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    }
  }
  
  trait SceneText
    extends StObject
       with SceneItem {
    
    var align: js.UndefOr[SceneTextAlign] = js.undefined
    
    var angle: js.UndefOr[Double] = js.undefined
    
    var baseline: SceneTextBaseline
    
    var dir: js.UndefOr[rtl | ltr] = js.undefined
    
    var dx: js.UndefOr[Double] = js.undefined
    
    var dy: Double
    
    var ellipsis: js.UndefOr[String] = js.undefined
    
    var fill: String
    
    var font: String
    
    var fontSize: Double
    
    var fontStyle: js.UndefOr[String] = js.undefined
    
    var fontWeight: js.UndefOr[Double | String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var lineBreak: js.UndefOr[String] = js.undefined
    
    var lineHeight: js.UndefOr[Double] = js.undefined
    
    var radius: js.UndefOr[Double] = js.undefined
    
    var text: String
    
    var theta: js.UndefOr[Double] = js.undefined
  }
  object SceneText {
    
    inline def apply(
      baseline: SceneTextBaseline,
      bounds: Bounds,
      dy: Double,
      fill: String,
      font: String,
      fontSize: Double,
      mark: Role,
      text: String,
      x: Double,
      y: Double
    ): SceneText = {
      val __obj = js.Dynamic.literal(baseline = baseline.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[SceneText]
    }
    
    extension [Self <: SceneText](x: Self) {
      
      inline def setAlign(value: SceneTextAlign): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      inline def setBaseline(value: SceneTextBaseline): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
      
      inline def setDir(value: rtl | ltr): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDx(value: Double): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      inline def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
      
      inline def setDy(value: Double): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      inline def setEllipsis(value: String): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: Double | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setLineBreak(value: String): Self = StObject.set(x, "lineBreak", value.asInstanceOf[js.Any])
      
      inline def setLineBreakUndefined: Self = StObject.set(x, "lineBreak", js.undefined)
      
      inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTheta(value: Double): Self = StObject.set(x, "theta", value.asInstanceOf[js.Any])
      
      inline def setThetaUndefined: Self = StObject.set(x, "theta", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.vegaTypingsStrings.left
    - typings.vegaTypings.vegaTypingsStrings.center
    - typings.vegaTypings.vegaTypingsStrings.right
  */
  trait SceneTextAlign extends StObject
  object SceneTextAlign {
    
    inline def center: typings.vegaTypings.vegaTypingsStrings.center = "center".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.center]
    
    inline def left: typings.vegaTypings.vegaTypingsStrings.left = "left".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.left]
    
    inline def right: typings.vegaTypings.vegaTypingsStrings.right = "right".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.right]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.vegaTypingsStrings.top
    - typings.vegaTypings.vegaTypingsStrings.middle
    - typings.vegaTypings.vegaTypingsStrings.bottom
  */
  trait SceneTextBaseline extends StObject
  object SceneTextBaseline {
    
    inline def bottom: typings.vegaTypings.vegaTypingsStrings.bottom = "bottom".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.bottom]
    
    inline def middle: typings.vegaTypings.vegaTypingsStrings.middle = "middle".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.middle]
    
    inline def top: typings.vegaTypings.vegaTypingsStrings.top = "top".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.top]
  }
}
