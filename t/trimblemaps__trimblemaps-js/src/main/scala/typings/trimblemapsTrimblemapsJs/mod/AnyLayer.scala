package typings.trimblemapsTrimblemapsJs.mod

import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.trimblemapsTrimblemapsJs.mod.BackgroundLayer
  - typings.trimblemapsTrimblemapsJs.mod.CircleLayer
  - typings.trimblemapsTrimblemapsJs.mod.FillExtrusionLayer
  - typings.trimblemapsTrimblemapsJs.mod.FillLayer
  - typings.trimblemapsTrimblemapsJs.mod.HeatmapLayer
  - typings.trimblemapsTrimblemapsJs.mod.HillshadeLayer
  - typings.trimblemapsTrimblemapsJs.mod.LineLayer
  - typings.trimblemapsTrimblemapsJs.mod.RasterLayer
  - typings.trimblemapsTrimblemapsJs.mod.SymbolLayer
  - typings.trimblemapsTrimblemapsJs.mod.CustomLayerInterface
*/
trait AnyLayer extends StObject
object AnyLayer {
  
  inline def BackgroundLayer(id: String): typings.trimblemapsTrimblemapsJs.mod.BackgroundLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("background")
    __obj.asInstanceOf[typings.trimblemapsTrimblemapsJs.mod.BackgroundLayer]
  }
  
  inline def CircleLayer(id: String): typings.trimblemapsTrimblemapsJs.mod.CircleLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("circle")
    __obj.asInstanceOf[typings.trimblemapsTrimblemapsJs.mod.CircleLayer]
  }
  
  inline def CustomLayerInterface(id: String, render: (WebGLRenderingContext, js.Array[Double]) => Unit): typings.trimblemapsTrimblemapsJs.mod.CustomLayerInterface = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], render = js.Any.fromFunction2(render))
    __obj.updateDynamic("type")("custom")
    __obj.asInstanceOf[typings.trimblemapsTrimblemapsJs.mod.CustomLayerInterface]
  }
  
  inline def FillExtrusionLayer(id: String): typings.trimblemapsTrimblemapsJs.mod.FillExtrusionLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fill-extrusion")
    __obj.asInstanceOf[typings.trimblemapsTrimblemapsJs.mod.FillExtrusionLayer]
  }
  
  inline def FillLayer(id: String): typings.trimblemapsTrimblemapsJs.mod.FillLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fill")
    __obj.asInstanceOf[typings.trimblemapsTrimblemapsJs.mod.FillLayer]
  }
  
  inline def HeatmapLayer(id: String): typings.trimblemapsTrimblemapsJs.mod.HeatmapLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("heatmap")
    __obj.asInstanceOf[typings.trimblemapsTrimblemapsJs.mod.HeatmapLayer]
  }
  
  inline def HillshadeLayer(id: String): typings.trimblemapsTrimblemapsJs.mod.HillshadeLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("hillshade")
    __obj.asInstanceOf[typings.trimblemapsTrimblemapsJs.mod.HillshadeLayer]
  }
  
  inline def LineLayer(id: String): typings.trimblemapsTrimblemapsJs.mod.LineLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("line")
    __obj.asInstanceOf[typings.trimblemapsTrimblemapsJs.mod.LineLayer]
  }
  
  inline def RasterLayer(id: String): typings.trimblemapsTrimblemapsJs.mod.RasterLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("raster")
    __obj.asInstanceOf[typings.trimblemapsTrimblemapsJs.mod.RasterLayer]
  }
  
  inline def SymbolLayer(id: String): typings.trimblemapsTrimblemapsJs.mod.SymbolLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("symbol")
    __obj.asInstanceOf[typings.trimblemapsTrimblemapsJs.mod.SymbolLayer]
  }
}
