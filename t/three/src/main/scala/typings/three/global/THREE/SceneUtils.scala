package typings.three.global.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SceneUtils {
  
  @JSGlobal("THREE.SceneUtils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def attach(
    child: typings.three.object3DMod.Object3D,
    scene: typings.three.sceneMod.Scene,
    parent: typings.three.object3DMod.Object3D
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attach")(child.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createMultiMaterialObject(
    geometry: typings.three.geometryMod.Geometry,
    materials: js.Array[typings.three.materialMod.Material]
  ): typings.three.object3DMod.Object3D = (^.asInstanceOf[js.Dynamic].applyDynamic("createMultiMaterialObject")(geometry.asInstanceOf[js.Any], materials.asInstanceOf[js.Any])).asInstanceOf[typings.three.object3DMod.Object3D]
  
  inline def detach(
    child: typings.three.object3DMod.Object3D,
    parent: typings.three.object3DMod.Object3D,
    scene: typings.three.sceneMod.Scene
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detach")(child.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
