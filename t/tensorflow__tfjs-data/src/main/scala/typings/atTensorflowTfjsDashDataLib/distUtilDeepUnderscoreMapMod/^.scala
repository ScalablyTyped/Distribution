package typings
package atTensorflowTfjsDashDataLib.distUtilDeepUnderscoreMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/util/deep_map", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def canTensorify(obj: js.Any): scala.Boolean = js.native
  def deepMap(input: js.Any, mapFn: js.Function1[/* x */ js.Any, DeepMapResult]): js.Any | js.Array[_] = js.native
  def deepMapAndAwaitAll(input: js.Any, mapFn: js.Function1[/* x */ js.Any, DeepMapAsyncResult]): js.Promise[_ | js.Array[_]] = js.native
  def deepZip(inputs: js.Array[_]): js.Any | js.Array[_] = js.native
  def deepZip(inputs: js.Array[_], zipFn: js.Function1[/* xs */ js.Array[_], DeepMapResult]): js.Any | js.Array[_] = js.native
  def isIterable(obj: js.Any): scala.Boolean = js.native
  def zipToList(x: js.Array[_]): DeepMapResult = js.native
}

