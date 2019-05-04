package typings
package vegaDashLiteLib.buildSrcCompileSplitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/compile/split", "Split")
@js.native
class Split[T /* <: js.Object */] () extends js.Object {
  def this(explicit: stdLib.Partial[T]) = this()
  def this(explicit: stdLib.Partial[T], `implicit`: stdLib.Partial[T]) = this()
  val explicit: stdLib.Partial[T] = js.native
  val `implicit`: stdLib.Partial[T] = js.native
  def combine(): stdLib.Partial[T] = js.native
  /**
    * Merge split object into this split object. Properties from the other split
    * overwrite properties from this split.
    */
  def copyAll(other: Split[T]): scala.Unit = js.native
  def copyKeyFromObject[S /* <: stdLib.Partial[T] */](key: java.lang.String, s: S): scala.Unit = js.native
  def copyKeyFromSplit[S /* <: T */](key: java.lang.String, s: Split[S]): scala.Unit = js.native
  def get[K /* <: java.lang.String */](key: K): /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any = js.native
  def getWithExplicit[K /* <: java.lang.String */](key: K): Explicit[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any] = js.native
  def set[K /* <: java.lang.String */](
    key: K,
    value: /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any,
    explicit: scala.Boolean
  ): this.type = js.native
  def setWithExplicit[K /* <: java.lang.String */](
    key: K,
    value: Explicit[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any]
  ): scala.Unit = js.native
}

