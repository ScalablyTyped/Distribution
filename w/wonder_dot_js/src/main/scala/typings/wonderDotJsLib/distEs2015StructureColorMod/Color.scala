package typings
package wonderDotJsLib.distEs2015StructureColorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/structure/Color", "Color")
@js.native
class Color () extends js.Object {
  var a: scala.Double = js.native
  var b: scala.Double = js.native
  var dirty: scala.Boolean = js.native
  var g: scala.Double = js.native
  var r: scala.Double = js.native
  def initWhenCreate(): scala.Unit = js.native
  def initWhenCreate(colorVal: java.lang.String): scala.Unit = js.native
  def isEqual(color: Color): scala.Boolean = js.native
  def toVector3(): wonderDotJsLib.distEs2015MathVector3Mod.Vector3 = js.native
  def toVector4(): js.Any = js.native
}

/* static members */
@JSImport("wonder.js/dist/es2015/structure/Color", "Color")
@js.native
object Color extends js.Object {
  def create(): wonderDotJsLib.distEs2015StructureColorMod.Color = js.native
  def create(colorVal: java.lang.String): wonderDotJsLib.distEs2015StructureColorMod.Color = js.native
}

