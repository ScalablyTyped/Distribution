package typings.three

import typings.three.csmMod.CSM
import typings.three.threeMod.Box3Helper
import typings.three.threeMod.BufferGeometry
import typings.three.threeMod.Group
import typings.three.threeMod.LineBasicMaterial
import typings.three.threeMod.LineSegments
import typings.three.threeMod.Mesh
import typings.three.threeMod.MeshBasicMaterial
import typings.three.threeMod.PlaneGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object csmhelperMod {
  
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
    
    var frustumLines: LineSegments[BufferGeometry, LineBasicMaterial] = js.native
    
    var shadowLines: js.Array[Box3Helper] = js.native
    
    def update(): Unit = js.native
    
    def updateVisibility(): Unit = js.native
  }
}
