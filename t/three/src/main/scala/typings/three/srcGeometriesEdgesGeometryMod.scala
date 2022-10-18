package typings.three

import typings.three.anon.Geometry
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGeometriesEdgesGeometryMod {
  
  @JSImport("three/src/geometries/EdgesGeometry", "EdgesGeometry")
  @js.native
  /**
    * @param geometry
    * @param [thresholdAngle=1]
    */
  open class EdgesGeometry[TBufferGeometry /* <: BufferGeometry */] () extends BufferGeometry {
    def this(geometry: TBufferGeometry) = this()
    def this(geometry: TBufferGeometry, thresholdAngle: Double) = this()
    def this(geometry: Unit, thresholdAngle: Double) = this()
    
    var parameters: Geometry[TBufferGeometry] = js.native
  }
}
