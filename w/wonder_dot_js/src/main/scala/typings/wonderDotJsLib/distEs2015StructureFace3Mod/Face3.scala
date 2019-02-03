package typings
package wonderDotJsLib.distEs2015StructureFace3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/structure/Face3", "Face3")
@js.native
class Face3 protected () extends js.Object {
  def this(aIndex: scala.Double, bIndex: scala.Double, cIndex: scala.Double, faceNormal: wonderDotJsLib.distEs2015MathVector3Mod.Vector3, vertexNormals: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Collection<Vector3> */ js.Any) = this()
  var aIndex: scala.Double = js.native
  var bIndex: scala.Double = js.native
  var cIndex: scala.Double = js.native
  var faceNormal: wonderDotJsLib.distEs2015MathVector3Mod.Vector3 = js.native
  var vertexNormals: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Collection<Vector3> */ js.Any = js.native
  def hasFaceNormal(): scala.Boolean = js.native
  def hasVertexNormal(): scala.Boolean = js.native
}

/* static members */
@JSImport("wonder.js/dist/es2015/structure/Face3", "Face3")
@js.native
object Face3 extends js.Object {
  def create(aIndex: scala.Double, bIndex: scala.Double, cIndex: scala.Double): wonderDotJsLib.distEs2015StructureFace3Mod.Face3 = js.native
  def create(
    aIndex: scala.Double,
    bIndex: scala.Double,
    cIndex: scala.Double,
    faceNormal: wonderDotJsLib.distEs2015MathVector3Mod.Vector3
  ): wonderDotJsLib.distEs2015StructureFace3Mod.Face3 = js.native
  def create(
    aIndex: scala.Double,
    bIndex: scala.Double,
    cIndex: scala.Double,
    faceNormal: wonderDotJsLib.distEs2015MathVector3Mod.Vector3,
    vertexNormals: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Collection<Vector3> */ js.Any
  ): wonderDotJsLib.distEs2015StructureFace3Mod.Face3 = js.native
}

