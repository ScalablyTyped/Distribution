package typings
package threeLib.srcCoreFace3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/core/Face3", "Face3")
@js.native
class Face3 protected () extends js.Object {
  /**
  	 * @param a Vertex A index.
  	 * @param b Vertex B index.
  	 * @param c Vertex C index.
  	 * @param normal Face normal or array of vertex normals.
  	 * @param color Face color or array of vertex colors.
  	 * @param materialIndex Material index.
  	 */
  def this(a: scala.Double, b: scala.Double, c: scala.Double) = this()
  def this(a: scala.Double, b: scala.Double, c: scala.Double, normal: threeLib.srcMathVector3Mod.Vector3) = this()
  def this(a: scala.Double, b: scala.Double, c: scala.Double, vertexNormals: js.Array[threeLib.srcMathVector3Mod.Vector3]) = this()
  def this(a: scala.Double, b: scala.Double, c: scala.Double, normal: threeLib.srcMathVector3Mod.Vector3, color: threeLib.srcMathColorMod.Color) = this()
  def this(a: scala.Double, b: scala.Double, c: scala.Double, normal: threeLib.srcMathVector3Mod.Vector3, vertexColors: js.Array[threeLib.srcMathColorMod.Color]) = this()
  def this(a: scala.Double, b: scala.Double, c: scala.Double, vertexNormals: js.Array[threeLib.srcMathVector3Mod.Vector3], color: threeLib.srcMathColorMod.Color) = this()
  def this(a: scala.Double, b: scala.Double, c: scala.Double, vertexNormals: js.Array[threeLib.srcMathVector3Mod.Vector3], vertexColors: js.Array[threeLib.srcMathColorMod.Color]) = this()
  def this(a: scala.Double, b: scala.Double, c: scala.Double, normal: threeLib.srcMathVector3Mod.Vector3, color: threeLib.srcMathColorMod.Color, materialIndex: scala.Double) = this()
  def this(a: scala.Double, b: scala.Double, c: scala.Double, normal: threeLib.srcMathVector3Mod.Vector3, vertexColors: js.Array[threeLib.srcMathColorMod.Color], materialIndex: scala.Double) = this()
  def this(a: scala.Double, b: scala.Double, c: scala.Double, vertexNormals: js.Array[threeLib.srcMathVector3Mod.Vector3], color: threeLib.srcMathColorMod.Color, materialIndex: scala.Double) = this()
  def this(a: scala.Double, b: scala.Double, c: scala.Double, vertexNormals: js.Array[threeLib.srcMathVector3Mod.Vector3], vertexColors: js.Array[threeLib.srcMathColorMod.Color], materialIndex: scala.Double) = this()
  /**
  	 * Vertex A index.
  	 */
  var a: scala.Double = js.native
  /**
  	 * Vertex B index.
  	 */
  var b: scala.Double = js.native
  /**
  	 * Vertex C index.
  	 */
  var c: scala.Double = js.native
  /**
  	 * Face color.
  	 */
  var color: threeLib.srcMathColorMod.Color = js.native
  /**
  	 * Material index (points to {@link Geometry.materials}).
  	 */
  var materialIndex: scala.Double = js.native
  /**
  	 * Face normal.
  	 */
  var normal: threeLib.srcMathVector3Mod.Vector3 = js.native
  /**
  	 * Array of 4 vertex normals.
  	 */
  var vertexColors: js.Array[threeLib.srcMathColorMod.Color] = js.native
  /**
  	 * Array of 4 vertex normals.
  	 */
  var vertexNormals: js.Array[threeLib.srcMathVector3Mod.Vector3] = js.native
  def copy(source: Face3): this.type = js.native
}

