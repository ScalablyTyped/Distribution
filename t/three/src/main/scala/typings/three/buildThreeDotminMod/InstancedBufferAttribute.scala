package typings.three.buildThreeDotminMod

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three.min", "InstancedBufferAttribute")
@js.native
open class InstancedBufferAttribute protected ()
  extends typings.three.srcThreeMod.InstancedBufferAttribute {
  /**
    * Create a new instance of {@link THREE.InstancedBufferAttribute | InstancedBufferAttribute}
    * @param array
    * @param itemSize
    * @param normalized
    * @param meshPerAttribute
    */
  def this(array: ArrayLike[Double], itemSize: Double) = this()
  def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean) = this()
  def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean, meshPerAttribute: Double) = this()
  def this(array: ArrayLike[Double], itemSize: Double, normalized: Unit, meshPerAttribute: Double) = this()
}
