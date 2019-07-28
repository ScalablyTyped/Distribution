package typings.three.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "Face3")
@js.native
class Face3 protected ()
  extends typings.three.srcCoreFace3Mod.Face3 {
  /**
  	 * @param a Vertex A index.
  	 * @param b Vertex B index.
  	 * @param c Vertex C index.
  	 * @param normal Face normal or array of vertex normals.
  	 * @param color Face color or array of vertex colors.
  	 * @param materialIndex Material index.
  	 */
  def this(a: Double, b: Double, c: Double) = this()
  def this(a: Double, b: Double, c: Double, normal: typings.three.srcMathVector3Mod.Vector3) = this()
  def this(a: Double, b: Double, c: Double, vertexNormals: js.Array[typings.three.srcMathVector3Mod.Vector3]) = this()
  def this(
    a: Double,
    b: Double,
    c: Double,
    normal: typings.three.srcMathVector3Mod.Vector3,
    color: typings.three.srcMathColorMod.Color
  ) = this()
  def this(
    a: Double,
    b: Double,
    c: Double,
    normal: typings.three.srcMathVector3Mod.Vector3,
    vertexColors: js.Array[typings.three.srcMathColorMod.Color]
  ) = this()
  def this(
    a: Double,
    b: Double,
    c: Double,
    vertexNormals: js.Array[typings.three.srcMathVector3Mod.Vector3],
    color: typings.three.srcMathColorMod.Color
  ) = this()
  def this(
    a: Double,
    b: Double,
    c: Double,
    vertexNormals: js.Array[typings.three.srcMathVector3Mod.Vector3],
    vertexColors: js.Array[typings.three.srcMathColorMod.Color]
  ) = this()
  def this(
    a: Double,
    b: Double,
    c: Double,
    normal: typings.three.srcMathVector3Mod.Vector3,
    color: typings.three.srcMathColorMod.Color,
    materialIndex: Double
  ) = this()
  def this(
    a: Double,
    b: Double,
    c: Double,
    normal: typings.three.srcMathVector3Mod.Vector3,
    vertexColors: js.Array[typings.three.srcMathColorMod.Color],
    materialIndex: Double
  ) = this()
  def this(
    a: Double,
    b: Double,
    c: Double,
    vertexNormals: js.Array[typings.three.srcMathVector3Mod.Vector3],
    color: typings.three.srcMathColorMod.Color,
    materialIndex: Double
  ) = this()
  def this(
    a: Double,
    b: Double,
    c: Double,
    vertexNormals: js.Array[typings.three.srcMathVector3Mod.Vector3],
    vertexColors: js.Array[typings.three.srcMathColorMod.Color],
    materialIndex: Double
  ) = this()
}

