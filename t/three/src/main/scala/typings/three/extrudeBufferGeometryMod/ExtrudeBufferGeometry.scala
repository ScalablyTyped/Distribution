package typings.three.extrudeBufferGeometryMod

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.shapeMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/geometries/ExtrudeBufferGeometry", "ExtrudeBufferGeometry")
@js.native
class ExtrudeBufferGeometry protected () extends BufferGeometry {
  def this(shapes: js.Array[Shape]) = this()
  def this(shapes: Shape) = this()
  def this(shapes: js.Array[Shape], options: ExtrudeGeometryOptions) = this()
  def this(shapes: Shape, options: ExtrudeGeometryOptions) = this()
  
  def addShape(shape: Shape): Unit = js.native
  def addShape(shape: Shape, options: js.Any): Unit = js.native
  
  def addShapeList(shapes: js.Array[Shape]): Unit = js.native
  def addShapeList(shapes: js.Array[Shape], options: js.Any): Unit = js.native
}
