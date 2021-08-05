package typings.wonderJs

import typings.wonderJs.vector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object face3Mod {
  
  @JSImport("wonder.js/dist/es2015/structure/Face3", "Face3")
  @js.native
  class Face3 protected () extends StObject {
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
    
    def hasFaceNormal(): Boolean = js.native
    
    def hasVertexNormal(): Boolean = js.native
    
    var vertexNormals: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<Vector3> */ js.Any = js.native
  }
  /* static members */
  object Face3 {
    
    @JSImport("wonder.js/dist/es2015/structure/Face3", "Face3")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(aIndex: Double, bIndex: Double, cIndex: Double): Face3 = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(aIndex.asInstanceOf[js.Any], bIndex.asInstanceOf[js.Any], cIndex.asInstanceOf[js.Any])).asInstanceOf[Face3]
    inline def create(
      aIndex: Double,
      bIndex: Double,
      cIndex: Double,
      faceNormal: Unit,
      vertexNormals: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<Vector3> */ js.Any
    ): Face3 = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(aIndex.asInstanceOf[js.Any], bIndex.asInstanceOf[js.Any], cIndex.asInstanceOf[js.Any], faceNormal.asInstanceOf[js.Any], vertexNormals.asInstanceOf[js.Any])).asInstanceOf[Face3]
    inline def create(aIndex: Double, bIndex: Double, cIndex: Double, faceNormal: Vector3): Face3 = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(aIndex.asInstanceOf[js.Any], bIndex.asInstanceOf[js.Any], cIndex.asInstanceOf[js.Any], faceNormal.asInstanceOf[js.Any])).asInstanceOf[Face3]
    inline def create(
      aIndex: Double,
      bIndex: Double,
      cIndex: Double,
      faceNormal: Vector3,
      vertexNormals: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<Vector3> */ js.Any
    ): Face3 = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(aIndex.asInstanceOf[js.Any], bIndex.asInstanceOf[js.Any], cIndex.asInstanceOf[js.Any], faceNormal.asInstanceOf[js.Any], vertexNormals.asInstanceOf[js.Any])).asInstanceOf[Face3]
  }
}
