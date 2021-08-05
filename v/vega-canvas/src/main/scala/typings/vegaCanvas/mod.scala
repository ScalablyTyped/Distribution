package typings.vegaCanvas

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
  
  inline def canvas(w: Double, h: Double): HTMLCanvasElement | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Canvas */ js.Any) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("canvas")(w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Canvas */ js.Any) | Null]
  
  inline def canvas_pdf(w: Double, h: Double, `type`: pdf): HTMLCanvasElement | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Canvas */ js.Any) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("canvas")(w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Canvas */ js.Any) | Null]
  
  inline def canvas_svg(w: Double, h: Double, `type`: svg): HTMLCanvasElement | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Canvas */ js.Any) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("canvas")(w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Canvas */ js.Any) | Null]
  
  inline def domCanvas(w: Double, h: Double): HTMLCanvasElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("domCanvas")(w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement | Null]
  
  inline def image(): HTMLImageElement | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Image */ js.Any) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("image")().asInstanceOf[HTMLImageElement | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Image */ js.Any) | Null]
  
  inline def nodeCanvas(w: Double, h: Double): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Canvas */ js.Any) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeCanvas")(w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[(/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Canvas */ js.Any) | Null]
  
  inline def nodeCanvas_pdf(w: Double, h: Double, `type`: pdf): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Canvas */ js.Any) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeCanvas")(w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[(/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Canvas */ js.Any) | Null]
  
  inline def nodeCanvas_svg(w: Double, h: Double, `type`: svg): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Canvas */ js.Any) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeCanvas")(w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[(/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Canvas */ js.Any) | Null]
}
