package typings
package atUifabricUtilitiesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/memoize", JSImport.Namespace)
@js.native
object libMemoizeMod extends js.Object {
  def memoize[T /* <: js.Function */](target: js.Any, key: java.lang.String, descriptor: stdLib.TypedPropertyDescriptor[T]): atUifabricUtilitiesLib.Anon_Get[T] = js.native
  def memoizeFunction[T /* <: js.Function1[/* repeated */js.Any, RET_TYPE] */, RET_TYPE](cb: T): T = js.native
  def memoizeFunction[T /* <: js.Function1[/* repeated */js.Any, RET_TYPE] */, RET_TYPE](cb: T, maxCacheSize: scala.Double): T = js.native
  def resetMemoizations(): scala.Unit = js.native
  def setMemoizeWeakMap(weakMap: js.Any): scala.Unit = js.native
}

