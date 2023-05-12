package typings.three.global.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.InterleavedBufferAttribute")
@js.native
open class InterleavedBufferAttribute protected ()
  extends typings.three.mod.InterleavedBufferAttribute {
  /**
    * Create a new instance of {@link THREE.InterleavedBufferAttribute | InterleavedBufferAttribute}.
    * @param interleavedBuffer
    * @param itemSize
    * @param offset
    * @param normalized Default `false`.
    */
  def this(
    interleavedBuffer: typings.three.srcCoreInterleavedBufferMod.InterleavedBuffer,
    itemSize: Double,
    offset: Double
  ) = this()
  def this(
    interleavedBuffer: typings.three.srcCoreInterleavedBufferMod.InterleavedBuffer,
    itemSize: Double,
    offset: Double,
    normalized: Boolean
  ) = this()
}
