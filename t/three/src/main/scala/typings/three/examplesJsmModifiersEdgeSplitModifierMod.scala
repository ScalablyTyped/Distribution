package typings.three

import typings.three.srcThreeMod.BufferGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmModifiersEdgeSplitModifierMod {
  
  @JSImport("three/examples/jsm/modifiers/EdgeSplitModifier", "EdgeSplitModifier")
  @js.native
  open class EdgeSplitModifier () extends StObject {
    
    /**
      * @param geometry					The geometry to modify by splitting edges.
      * 									This geometry can be any of any type: Geometry or BufferGeometry, indexed or
      * 									not...
      *
      * @param cutOffPoint				The cutoff angle in radians. If the angle between two face normals is higher
      * 									than this value, a split will be made.
      *
      * @param [tryKeepNormals = true]	Set to true to keep the normal values for vertices that won't be split.
      * 									To use this feature, you also need to pass an indexed geometry with a 'normal'
      * 									BufferAttribute.
      */
    def modify(geometry: BufferGeometry, cutOffPoint: Double, tryKeepNormals: Boolean): BufferGeometry = js.native
  }
}
