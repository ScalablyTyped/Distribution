package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RaphaelContext extends IRenderContext {
  
  @JSName("glow")
  def glow_Color(): Color = js.native
  
  def rect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  
  //TODO remove the following lines once TypeScript allows subclass overrides with type changes or type inconsistencies mentioned below are fixed
  @JSName("setLineWidth")
  def setLineWidth_RaphaelContext(width: Double): RaphaelContext = js.native
  
  def setViewBox(viewBox: String): Unit = js.native
}
