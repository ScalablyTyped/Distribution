package typings
package threeLib.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "Face3")
@js.native
class Face3 protected ()
  extends threeLib.srcCoreFace3Mod.Face3 {
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
}

