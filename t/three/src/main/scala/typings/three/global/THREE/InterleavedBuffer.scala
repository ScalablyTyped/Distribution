package typings.three.global.THREE

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.InterleavedBuffer")
@js.native
open class InterleavedBuffer protected ()
  extends typings.three.mod.InterleavedBuffer {
  /**
    * Create a new instance of {@link InterleavedBuffer}
    * @param array A {@link https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray | TypedArray} with a shared buffer. Stores the geometry data.
    * @param stride The number of typed-array elements per vertex. Expects a `Integer`
    */
  def this(array: ArrayLike[Double], stride: Double) = this()
}
