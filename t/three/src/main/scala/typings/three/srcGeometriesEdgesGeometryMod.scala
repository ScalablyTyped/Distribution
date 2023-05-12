package typings.three

import typings.three.anon.Geometry
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGeometriesEdgesGeometryMod {
  
  @JSImport("three/src/geometries/EdgesGeometry", "EdgesGeometry")
  @js.native
  /**
    * Create a new instance of {@link EdgesGeometry}
    * @param geometry Any geometry object. Default `null`.
    * @param thresholdAngle An edge is only rendered if the angle (in degrees) between the face normals of the adjoining faces exceeds this value. Expects a `Integer`. Default `1` _degree_.
    */
  open class EdgesGeometry[TBufferGeometry /* <: BufferGeometry[NormalBufferAttributes] */] () extends BufferGeometry[NormalBufferAttributes] {
    def this(geometry: TBufferGeometry) = this()
    def this(geometry: TBufferGeometry, thresholdAngle: Double) = this()
    def this(geometry: Null, thresholdAngle: Double) = this()
    def this(geometry: Unit, thresholdAngle: Double) = this()
    
    /**
      * An object with a property for each of the constructor parameters.
      * @remarks Any modification after instantiation does not change the geometry.
      */
    val parameters: Geometry[TBufferGeometry] = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @defaultValue `EdgesGeometry`
      */
    @JSName("type")
    val type_EdgesGeometry: String | typings.three.threeStrings.EdgesGeometry = js.native
  }
}
