package typings.three

import typings.three.examplesJsmPostprocessingPassMod.Pass
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcThreeMod.CubeTexture
import typings.three.srcThreeMod.Mesh
import typings.three.srcThreeMod.PerspectiveCamera
import typings.three.srcThreeMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmPostprocessingCubeTexturePassMod {
  
  @JSImport("three/examples/jsm/postprocessing/CubeTexturePass", "CubeTexturePass")
  @js.native
  open class CubeTexturePass protected () extends Pass {
    def this(camera: PerspectiveCamera) = this()
    def this(camera: PerspectiveCamera, envMap: CubeTexture) = this()
    def this(camera: PerspectiveCamera, envMap: Unit, opacity: Double) = this()
    def this(camera: PerspectiveCamera, envMap: CubeTexture, opacity: Double) = this()
    
    var camera: PerspectiveCamera = js.native
    
    var cubeCamera: PerspectiveCamera = js.native
    
    var cubeMesh: Mesh[BufferGeometry, Material | js.Array[Material]] = js.native
    
    var cubeScene: Scene = js.native
    
    var cubeShader: js.Object = js.native
    
    var envMap: CubeTexture = js.native
    
    var opacity: Double = js.native
  }
}
