package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcThreeMod.Group
import typings.three.srcThreeMod.InstancedMesh
import typings.three.srcThreeMod.Mesh
import typings.three.srcThreeMod.Object3D
import typings.three.srcThreeMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmUtilsSceneUtilsMod {
  
  @JSImport("three/examples/jsm/utils/SceneUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attach(child: Object3D[Event], scene: Scene, parent: Object3D[Event]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attach")(child.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createMeshesFromInstancedMesh(instancedMesh: InstancedMesh[BufferGeometry, Material | js.Array[Material]]): Group = ^.asInstanceOf[js.Dynamic].applyDynamic("createMeshesFromInstancedMesh")(instancedMesh.asInstanceOf[js.Any]).asInstanceOf[Group]
  
  inline def createMeshesFromMultiMaterialMesh(mesh: Mesh[BufferGeometry, Material | js.Array[Material]]): Group = ^.asInstanceOf[js.Dynamic].applyDynamic("createMeshesFromMultiMaterialMesh")(mesh.asInstanceOf[js.Any]).asInstanceOf[Group]
  
  inline def createMultiMaterialObject(
    geometry: typings.three.srcThreeMod.BufferGeometry,
    materials: js.Array[typings.three.srcThreeMod.Material]
  ): Group = (^.asInstanceOf[js.Dynamic].applyDynamic("createMultiMaterialObject")(geometry.asInstanceOf[js.Any], materials.asInstanceOf[js.Any])).asInstanceOf[Group]
  
  inline def detach(child: Object3D[Event], parent: Object3D[Event], scene: Scene): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detach")(child.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
