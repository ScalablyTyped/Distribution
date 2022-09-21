package typings.vexflow.Vex.Flow

import typings.std.Element
import typings.vexflow.anon.Left
import typings.vexflow.anon.Linethickness
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiMeasureRest
  extends StObject
     with Element {
  
  def draw(): Unit = js.native
  
  def drawLine(ctx: Any, left: Any, right: Any, sbl: Any): Unit = js.native
  
  def drawSymbols(ctx: Any, left: Any, right: Any, sbl: Any): Unit = js.native
  
  def getStave(): Any = js.native
  
  def getXs(): Left = js.native
  
  var number_of_measures: Any = js.native
  
  var render_options: Linethickness = js.native
  
  def setStave(stave: Any): MultiMeasureRest = js.native
  
  var stave: Any = js.native
  
  var xs: Left = js.native
}
