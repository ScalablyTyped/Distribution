package typings.three

import typings.three.anon.GeometryTBufferGeometry
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGeometriesWireframeGeometryMod {
  
  @JSImport("three/src/geometries/WireframeGeometry", "WireframeGeometry")
  @js.native
  /**
    * Create a new instance of {@link WireframeGeometry}
    * @param geometry Any geometry object. Default `null`.
    */
  open class WireframeGeometry[TBufferGeometry /* <: BufferGeometry[NormalBufferAttributes] */] () extends BufferGeometry[NormalBufferAttributes] {
    def this(geometry: TBufferGeometry) = this()
    
    /**
      * An object with a property for each of the constructor parameters.
      * @remarks Any modification after instantiation does not change the geometry.
      */
    val parameters: GeometryTBufferGeometry[TBufferGeometry] = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @defaultValue `WireframeGeometry`
      */
    @JSName("type")
    val type_WireframeGeometry: String | typings.three.threeStrings.WireframeGeometry = js.native
  }
}
