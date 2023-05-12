package typings.three

import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcThreeMod.BufferGeometry
import typings.three.srcThreeMod.Curve
import typings.three.srcThreeMod.Mesh
import typings.three.srcThreeMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmMiscRollerCoasterMod {
  
  @JSImport("three/examples/jsm/misc/RollerCoaster", "RollerCoasterGeometry")
  @js.native
  open class RollerCoasterGeometry protected () extends BufferGeometry[NormalBufferAttributes] {
    def this(curve: Curve[Vector3], divisions: Double) = this()
  }
  
  @JSImport("three/examples/jsm/misc/RollerCoaster", "RollerCoasterLiftersGeometry")
  @js.native
  open class RollerCoasterLiftersGeometry protected () extends BufferGeometry[NormalBufferAttributes] {
    def this(curve: Curve[Vector3], divisions: Double) = this()
  }
  
  @JSImport("three/examples/jsm/misc/RollerCoaster", "RollerCoasterShadowGeometry")
  @js.native
  open class RollerCoasterShadowGeometry protected () extends BufferGeometry[NormalBufferAttributes] {
    def this(curve: Curve[Vector3], divisions: Double) = this()
  }
  
  @JSImport("three/examples/jsm/misc/RollerCoaster", "SkyGeometry")
  @js.native
  open class SkyGeometry protected () extends BufferGeometry[NormalBufferAttributes] {
    def this(curve: Curve[Vector3], divisions: Double) = this()
  }
  
  @JSImport("three/examples/jsm/misc/RollerCoaster", "TreesGeometry")
  @js.native
  open class TreesGeometry protected () extends BufferGeometry[NormalBufferAttributes] {
    def this(landscape: Mesh[
            typings.three.srcCoreBufferGeometryMod.BufferGeometry[NormalBufferAttributes], 
            Material | js.Array[Material]
          ]) = this()
  }
}
