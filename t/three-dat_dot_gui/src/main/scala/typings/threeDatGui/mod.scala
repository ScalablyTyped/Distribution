package typings.threeDatGui

import typings.three.mod.Camera
import typings.three.mod.Euler
import typings.three.mod.Fog
import typings.three.mod.FogExp2
import typings.three.mod.Light
import typings.three.mod.Material
import typings.three.mod.Mesh
import typings.three.mod.Object3D
import typings.three.mod.Scene
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcLightsLightShadowMod.LightShadow
import typings.three.srcMathVector2Mod.Vector
import typings.threeDatGui.anon.GUI
import typings.threeDatGui.anon.Inner
import typings.threeDatGui.anon.Recursive
import typings.threeDatGui.anon.Step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // FIXME: Get rid of the "unknown" here.
  inline def apply(dat: GUI): Unit = ^.asInstanceOf[js.Dynamic].apply(dat.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("three-dat.gui", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* augmented module */
  object datGuiAugmentingMod {
    
    @js.native
    trait GUI extends StObject {
      
      def addCamera(name: String, camera: Camera): typings.threeDatGui.mod.datGuiAugmentingMod.GUI = js.native
      
      def addFog(name: String, fog: Fog): typings.threeDatGui.mod.datGuiAugmentingMod.GUI = js.native
      def addFog(name: String, fog: FogExp2): typings.threeDatGui.mod.datGuiAugmentingMod.GUI = js.native
      
      def addLight(name: String, light: Light[js.UndefOr[LightShadow[typings.three.srcCamerasCameraMod.Camera]]]): typings.threeDatGui.mod.datGuiAugmentingMod.GUI = js.native
      
      def addMaterial(name: String, material: Material): typings.threeDatGui.mod.datGuiAugmentingMod.GUI = js.native
      
      def addMesh(
        name: String,
        mesh: Mesh[
              BufferGeometry[NormalBufferAttributes], 
              typings.three.srcMaterialsMaterialMod.Material | js.Array[typings.three.srcMaterialsMaterialMod.Material]
            ]
      ): typings.threeDatGui.mod.datGuiAugmentingMod.GUI = js.native
      def addMesh(
        name: String,
        mesh: Mesh[
              BufferGeometry[NormalBufferAttributes], 
              typings.three.srcMaterialsMaterialMod.Material | js.Array[typings.three.srcMaterialsMaterialMod.Material]
            ],
        options: Recursive
      ): typings.threeDatGui.mod.datGuiAugmentingMod.GUI = js.native
      
      def addObject3D(name: String, mesh: Object3D[Event]): typings.threeDatGui.mod.datGuiAugmentingMod.GUI = js.native
      def addObject3D(name: String, mesh: Object3D[Event], options: Inner): typings.threeDatGui.mod.datGuiAugmentingMod.GUI = js.native
      
      def addScene(name: String, mesh: Object3D[Event]): typings.threeDatGui.mod.datGuiAugmentingMod.GUI = js.native
      def addScene(name: String, mesh: Object3D[Event], options: Recursive): typings.threeDatGui.mod.datGuiAugmentingMod.GUI = js.native
      def addScene(name: String, mesh: Scene): typings.threeDatGui.mod.datGuiAugmentingMod.GUI = js.native
      def addScene(name: String, mesh: Scene, options: Recursive): typings.threeDatGui.mod.datGuiAugmentingMod.GUI = js.native
      
      def addVector(name: String, vector: Euler): typings.threeDatGui.mod.datGuiAugmentingMod.GUI = js.native
      def addVector(name: String, vector: Euler, options: Step): typings.threeDatGui.mod.datGuiAugmentingMod.GUI = js.native
      def addVector(name: String, vector: Vector): typings.threeDatGui.mod.datGuiAugmentingMod.GUI = js.native
      def addVector(name: String, vector: Vector, options: Step): typings.threeDatGui.mod.datGuiAugmentingMod.GUI = js.native
    }
  }
}
