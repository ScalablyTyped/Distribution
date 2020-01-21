package typings.wonderJs

import typings.wonderJs.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/structure/Face3", JSImport.Namespace)
@js.native
object face3Mod extends js.Object {
  @js.native
  class Face3 protected () extends js.Object {
    def this(
      aIndex: Double,
      bIndex: Double,
      cIndex: Double,
      faceNormal: Vector3,
      vertexNormals: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<Vector3> */ js.Any
    ) = this()
    var aIndex: Double = js.native
    var bIndex: Double = js.native
    var cIndex: Double = js.native
    var faceNormal: Vector3 = js.native
    var vertexNormals: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<Vector3> */ js.Any = js.native
    def hasFaceNormal(): Boolean = js.native
    def hasVertexNormal(): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Face3 extends js.Object {
    def create(aIndex: Double, bIndex: Double, cIndex: Double): Face3 = js.native
    def create(aIndex: Double, bIndex: Double, cIndex: Double, faceNormal: Vector3): Face3 = js.native
    def create(
      aIndex: Double,
      bIndex: Double,
      cIndex: Double,
      faceNormal: Vector3,
      vertexNormals: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<Vector3> */ js.Any
    ): Face3 = js.native
  }
  
}

