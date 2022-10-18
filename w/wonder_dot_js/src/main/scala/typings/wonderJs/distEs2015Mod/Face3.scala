package typings.wonderJs.distEs2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "Face3")
@js.native
open class Face3 protected ()
  extends typings.wonderJs.distEs2015StructureFace3Mod.Face3 {
  def this(
    aIndex: Double,
    bIndex: Double,
    cIndex: Double,
    faceNormal: typings.wonderJs.distEs2015MathVector3Mod.Vector3,
    vertexNormals: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<Vector3> */ Any
  ) = this()
}
/* static members */
object Face3 {
  
  @JSImport("wonder.js/dist/es2015", "Face3")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(aIndex: Double, bIndex: Double, cIndex: Double): typings.wonderJs.distEs2015StructureFace3Mod.Face3 = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(aIndex.asInstanceOf[js.Any], bIndex.asInstanceOf[js.Any], cIndex.asInstanceOf[js.Any])).asInstanceOf[typings.wonderJs.distEs2015StructureFace3Mod.Face3]
  inline def create(
    aIndex: Double,
    bIndex: Double,
    cIndex: Double,
    faceNormal: Unit,
    vertexNormals: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<Vector3> */ Any
  ): typings.wonderJs.distEs2015StructureFace3Mod.Face3 = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(aIndex.asInstanceOf[js.Any], bIndex.asInstanceOf[js.Any], cIndex.asInstanceOf[js.Any], faceNormal.asInstanceOf[js.Any], vertexNormals.asInstanceOf[js.Any])).asInstanceOf[typings.wonderJs.distEs2015StructureFace3Mod.Face3]
  inline def create(
    aIndex: Double,
    bIndex: Double,
    cIndex: Double,
    faceNormal: typings.wonderJs.distEs2015MathVector3Mod.Vector3
  ): typings.wonderJs.distEs2015StructureFace3Mod.Face3 = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(aIndex.asInstanceOf[js.Any], bIndex.asInstanceOf[js.Any], cIndex.asInstanceOf[js.Any], faceNormal.asInstanceOf[js.Any])).asInstanceOf[typings.wonderJs.distEs2015StructureFace3Mod.Face3]
  inline def create(
    aIndex: Double,
    bIndex: Double,
    cIndex: Double,
    faceNormal: typings.wonderJs.distEs2015MathVector3Mod.Vector3,
    vertexNormals: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<Vector3> */ Any
  ): typings.wonderJs.distEs2015StructureFace3Mod.Face3 = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(aIndex.asInstanceOf[js.Any], bIndex.asInstanceOf[js.Any], cIndex.asInstanceOf[js.Any], faceNormal.asInstanceOf[js.Any], vertexNormals.asInstanceOf[js.Any])).asInstanceOf[typings.wonderJs.distEs2015StructureFace3Mod.Face3]
}
