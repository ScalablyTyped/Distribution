package typings.vegaCanvas

import typings.canvas.mod.Canvas
import typings.canvas.mod.Image
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.vegaCanvas.vegaCanvasStrings.pdf
import typings.vegaCanvas.vegaCanvasStrings.svg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vega-canvas", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def canvas(w: Double, h: Double): HTMLCanvasElement | Canvas | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("canvas")(w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement | Canvas | Null]
  inline def canvas(w: Double, h: Double, `type`: pdf | svg): HTMLCanvasElement | Canvas | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("canvas")(w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement | Canvas | Null]
  
  inline def domCanvas(w: Double, h: Double): HTMLCanvasElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("domCanvas")(w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement | Null]
  
  inline def image(): HTMLImageElement | Image | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("image")().asInstanceOf[HTMLImageElement | Image | Null]
  
  inline def nodeCanvas(w: Double, h: Double): Canvas | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeCanvas")(w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[Canvas | Null]
  inline def nodeCanvas(w: Double, h: Double, `type`: pdf | svg): Canvas | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeCanvas")(w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Canvas | Null]
}
