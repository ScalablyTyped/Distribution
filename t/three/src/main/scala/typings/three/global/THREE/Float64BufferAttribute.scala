package typings.three.global.THREE

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.Float64BufferAttribute")
@js.native
open class Float64BufferAttribute protected ()
  extends typings.three.mod.Float64BufferAttribute {
  def this(array: js.Iterable[Double], itemSize: Double) = this()
  def this(array: js.typedarray.ArrayBuffer, itemSize: Double) = this()
  def this(array: Double, itemSize: Double) = this()
  def this(array: ArrayLike[Double], itemSize: Double) = this()
  def this(array: js.Iterable[Double], itemSize: Double, normalized: Boolean) = this()
  def this(array: js.typedarray.ArrayBuffer, itemSize: Double, normalized: Boolean) = this()
  def this(array: Double, itemSize: Double, normalized: Boolean) = this()
  def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean) = this()
}
