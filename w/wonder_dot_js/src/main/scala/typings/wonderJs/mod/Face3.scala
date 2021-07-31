package typings.wonderJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "Face3")
@js.native
class Face3 protected ()
  extends typings.wonderJs.face3Mod.Face3 {
  def this(
    aIndex: Double,
    bIndex: Double,
    cIndex: Double,
    faceNormal: typings.wonderJs.vector3Mod.Vector3,
    vertexNormals: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<Vector3> */ js.Any
  ) = this()
}
/* static members */
object Face3 {
  
  @JSImport("wonder.js/dist/es2015", "Face3")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(aIndex: Double, bIndex: Double, cIndex: Double): typings.wonderJs.face3Mod.Face3 = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(aIndex.asInstanceOf[js.Any], bIndex.asInstanceOf[js.Any], cIndex.asInstanceOf[js.Any])).asInstanceOf[typings.wonderJs.face3Mod.Face3]
  @scala.inline
  def create(
    aIndex: Double,
    bIndex: Double,
    cIndex: Double,
    faceNormal: Unit,
    vertexNormals: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<Vector3> */ js.Any
  ): typings.wonderJs.face3Mod.Face3 = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(aIndex.asInstanceOf[js.Any], bIndex.asInstanceOf[js.Any], cIndex.asInstanceOf[js.Any], faceNormal.asInstanceOf[js.Any], vertexNormals.asInstanceOf[js.Any])).asInstanceOf[typings.wonderJs.face3Mod.Face3]
  @scala.inline
  def create(aIndex: Double, bIndex: Double, cIndex: Double, faceNormal: typings.wonderJs.vector3Mod.Vector3): typings.wonderJs.face3Mod.Face3 = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(aIndex.asInstanceOf[js.Any], bIndex.asInstanceOf[js.Any], cIndex.asInstanceOf[js.Any], faceNormal.asInstanceOf[js.Any])).asInstanceOf[typings.wonderJs.face3Mod.Face3]
  @scala.inline
  def create(
    aIndex: Double,
    bIndex: Double,
    cIndex: Double,
    faceNormal: typings.wonderJs.vector3Mod.Vector3,
    vertexNormals: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<Vector3> */ js.Any
  ): typings.wonderJs.face3Mod.Face3 = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(aIndex.asInstanceOf[js.Any], bIndex.asInstanceOf[js.Any], cIndex.asInstanceOf[js.Any], faceNormal.asInstanceOf[js.Any], vertexNormals.asInstanceOf[js.Any])).asInstanceOf[typings.wonderJs.face3Mod.Face3]
}
