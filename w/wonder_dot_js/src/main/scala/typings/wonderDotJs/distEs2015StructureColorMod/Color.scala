package typings.wonderDotJs.distEs2015StructureColorMod

import typings.wonderDotJs.distEs2015MathVector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/structure/Color", "Color")
@js.native
class Color () extends js.Object {
  var a: Double = js.native
  var b: Double = js.native
  var dirty: Boolean = js.native
  var g: Double = js.native
  var r: Double = js.native
  def initWhenCreate(): Unit = js.native
  def initWhenCreate(colorVal: String): Unit = js.native
  def isEqual(color: Color): Boolean = js.native
  def toVector3(): Vector3 = js.native
  def toVector4(): js.Any = js.native
}

/* static members */
@JSImport("wonder.js/dist/es2015/structure/Color", "Color")
@js.native
object Color extends js.Object {
  def create(): Color = js.native
  def create(colorVal: String): Color = js.native
}

