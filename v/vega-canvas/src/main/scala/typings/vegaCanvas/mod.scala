package typings.vegaCanvas

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.vegaCanvas.vegaCanvasStrings.pdf
import typings.vegaCanvas.vegaCanvasStrings.svg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vega-canvas", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def canvas(w: Double, h: Double): HTMLCanvasElement | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Canvas */ js.Any) | Null = js.native
  @JSName("canvas")
  def canvas_pdf(w: Double, h: Double, `type`: pdf): HTMLCanvasElement | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Canvas */ js.Any) | Null = js.native
  @JSName("canvas")
  def canvas_svg(w: Double, h: Double, `type`: svg): HTMLCanvasElement | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Canvas */ js.Any) | Null = js.native
  
  def domCanvas(w: Double, h: Double): HTMLCanvasElement | Null = js.native
  
  def image(): HTMLImageElement | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Image */ js.Any) | Null = js.native
  
  def nodeCanvas(w: Double, h: Double): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Canvas */ js.Any) | Null = js.native
  @JSName("nodeCanvas")
  def nodeCanvas_pdf(w: Double, h: Double, `type`: pdf): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Canvas */ js.Any) | Null = js.native
  @JSName("nodeCanvas")
  def nodeCanvas_svg(w: Double, h: Double, `type`: svg): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Canvas */ js.Any) | Null = js.native
}
