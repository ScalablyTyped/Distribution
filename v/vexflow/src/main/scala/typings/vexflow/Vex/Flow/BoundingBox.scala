package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.IRenderContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoundingBox extends StObject {
  
  def draw(ctx: IRenderContext, x: Double, y: Double): Unit = js.native
  
  def getH(): Double = js.native
  
  def getW(): Double = js.native
  
  def getX(): Double = js.native
  
  def getY(): Double = js.native
  
  def mergeWith(boundingBox: BoundingBox): BoundingBox = js.native
  def mergeWith(boundingBox: BoundingBox, ctx: IRenderContext): BoundingBox = js.native
  
  def move(x: Double, y: Double): Unit = js.native
  
  def setH(h: Double): BoundingBox = js.native
  
  def setW(w: Double): BoundingBox = js.native
  
  def setX(x: Double): BoundingBox = js.native
  
  def setY(y: Double): BoundingBox = js.native
}
