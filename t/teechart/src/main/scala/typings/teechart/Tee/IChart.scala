package typings.teechart.Tee

import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChart extends StObject {
  
  def addSeries(series: ISeries): ISeries = js.native
  
  def draw(): js.Any = js.native
  def draw(context: CanvasRenderingContext2D): js.Any = js.native
}
