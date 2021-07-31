package typings.teechart.Tee

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Chart
  extends StObject
     with IChart {
  
  //public aspect: IAspect;
  var axes: IAxes = js.native
  
  var bounds: IRectangle = js.native
  
  var canvas: HTMLCanvasElement = js.native
  
  var chartRect: IRectangle = js.native
  
  var footer: ITitle = js.native
  
  def getSeries(index: Double): ISeries = js.native
  
  var legend: ILegend = js.native
  
  var palette: IPalette = js.native
  
  var panel: IPanel = js.native
  
  def removeSeries(series: ISeries): Unit = js.native
  
  var scroll: IScroll = js.native
  
  var series: ISeriesList = js.native
  
  var title: ITitle = js.native
  
  def toImage(image: HTMLImageElement, format: String, quality: Double): Unit = js.native
  
  var tools: ITools = js.native
  
  var walls: IWalls = js.native
  
  var zoom: IZoom = js.native
}
