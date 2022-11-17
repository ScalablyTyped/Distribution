package typings.three

import org.scalablytyped.runtime.StringDictionary
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcMaterialsMaterialMod.Material
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsLineMod {
  
  @JSImport("three/src/objects/Line", "Line")
  @js.native
  open class Line[TGeometry /* <: BufferGeometry */, TMaterial /* <: Material | js.Array[Material] */] () extends Object3D[Event] {
    def this(geometry: TGeometry) = this()
    def this(geometry: TGeometry, material: TMaterial) = this()
    def this(geometry: Unit, material: TMaterial) = this()
    
    def computeLineDistances(): this.type = js.native
    
    var geometry: TGeometry = js.native
    
    val isLine: true = js.native
    
    var material: TMaterial = js.native
    
    var morphTargetDictionary: js.UndefOr[StringDictionary[Double]] = js.native
    
    var morphTargetInfluences: js.UndefOr[js.Array[Double]] = js.native
    
    @JSName("type")
    var type_Line: "Line" | "LineLoop" | "LineSegments" | String = js.native
    
    def updateMorphTargets(): Unit = js.native
  }
}
