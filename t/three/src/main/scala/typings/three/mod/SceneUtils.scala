package typings.three.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SceneUtils {
  
  @JSImport("three", "SceneUtils.attach")
  @js.native
  def attach(
    child: typings.three.object3DMod.Object3D,
    scene: typings.three.sceneMod.Scene,
    parent: typings.three.object3DMod.Object3D
  ): Unit = js.native
  
  @JSImport("three", "SceneUtils.createMultiMaterialObject")
  @js.native
  def createMultiMaterialObject(
    geometry: typings.three.geometryMod.Geometry,
    materials: js.Array[typings.three.materialMod.Material]
  ): typings.three.object3DMod.Object3D = js.native
  
  @JSImport("three", "SceneUtils.detach")
  @js.native
  def detach(
    child: typings.three.object3DMod.Object3D,
    parent: typings.three.object3DMod.Object3D,
    scene: typings.three.sceneMod.Scene
  ): Unit = js.native
}
