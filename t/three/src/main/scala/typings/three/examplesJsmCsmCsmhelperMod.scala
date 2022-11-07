package typings.three

import typings.three.examplesJsmCsmCsmMod.CSM
import typings.three.srcThreeMod.Box3Helper
import typings.three.srcThreeMod.BufferGeometry
import typings.three.srcThreeMod.Group
import typings.three.srcThreeMod.LineBasicMaterial
import typings.three.srcThreeMod.LineSegments
import typings.three.srcThreeMod.Mesh
import typings.three.srcThreeMod.MeshBasicMaterial
import typings.three.srcThreeMod.PlaneGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmCsmCsmhelperMod {
  
  @JSImport("three/examples/jsm/csm/CSMHelper", "CSMHelper")
  @js.native
  open class CSMHelper[TCSM /* <: CSM */] protected () extends Group {
    def this(csm: TCSM) = this()
    
    var cascadeLines: js.Array[Box3Helper] = js.native
    
    var cascadePlanes: js.Array[Mesh[PlaneGeometry, MeshBasicMaterial]] = js.native
    
    var csm: TCSM = js.native
    
    var displayFrustum: Boolean = js.native
    
    var displayPlanes: Boolean = js.native
    
    var displayShadowBounds: Boolean = js.native
    
    def dispose(): Unit = js.native
    
    var frustumLines: LineSegments[BufferGeometry, LineBasicMaterial] = js.native
    
    var shadowLines: js.Array[Box3Helper] = js.native
    
    def update(): Unit = js.native
    
    def updateVisibility(): Unit = js.native
  }
}
