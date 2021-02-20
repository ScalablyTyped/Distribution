package typings.vegaCanvas

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.vegaCanvas.vegaCanvasStrings.pdf
import typings.vegaCanvas.vegaCanvasStrings.svg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vega-canvas", "canvas")
  @js.native
  def canvas(w: Double, h: Double): HTMLCanvasElement | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Canvas */ js.Any) | Null = js.native
  @JSImport("vega-canvas", "canvas")
  @js.native
  def canvas_pdf(w: Double, h: Double, `type`: pdf): HTMLCanvasElement | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Canvas */ js.Any) | Null = js.native
  @JSImport("vega-canvas", "canvas")
  @js.native
  def canvas_svg(w: Double, h: Double, `type`: svg): HTMLCanvasElement | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Canvas */ js.Any) | Null = js.native
  
  @JSImport("vega-canvas", "domCanvas")
  @js.native
  def domCanvas(w: Double, h: Double): HTMLCanvasElement | Null = js.native
  
  @JSImport("vega-canvas", "image")
  @js.native
  def image(): HTMLImageElement | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Image */ js.Any) | Null = js.native
  
  @JSImport("vega-canvas", "nodeCanvas")
  @js.native
  def nodeCanvas(w: Double, h: Double): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Canvas */ js.Any) | Null = js.native
  @JSImport("vega-canvas", "nodeCanvas")
  @js.native
  def nodeCanvas_pdf(w: Double, h: Double, `type`: pdf): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Canvas */ js.Any) | Null = js.native
  @JSImport("vega-canvas", "nodeCanvas")
  @js.native
  def nodeCanvas_svg(w: Double, h: Double, `type`: svg): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Canvas */ js.Any) | Null = js.native
}
