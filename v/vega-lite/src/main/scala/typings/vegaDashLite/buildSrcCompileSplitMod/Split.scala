package typings.vegaDashLite.buildSrcCompileSplitMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/compile/split", "Split")
@js.native
class Split[T /* <: js.Object */] () extends js.Object {
  def this(explicit: Partial[T]) = this()
  def this(explicit: Partial[T], `implicit`: Partial[T]) = this()
  val explicit: Partial[T] = js.native
  val `implicit`: Partial[T] = js.native
  def combine(): Partial[T] = js.native
  /**
    * Merge split object into this split object. Properties from the other split
    * overwrite properties from this split.
    */
  def copyAll(other: Split[T]): Unit = js.native
  def copyKeyFromObject[S /* <: Partial[T] */](key: String, s: S): Unit = js.native
  def copyKeyFromSplit[S /* <: T */](key: String, s: Split[S]): Unit = js.native
  def get[K /* <: String */](key: K): /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any = js.native
  def getWithExplicit[K /* <: String */](key: K): Explicit[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any] = js.native
  def set[K /* <: String */](
    key: K,
    value: /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any,
    explicit: Boolean
  ): this.type = js.native
  def setWithExplicit[K /* <: String */](
    key: K,
    value: Explicit[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any]
  ): Unit = js.native
}

