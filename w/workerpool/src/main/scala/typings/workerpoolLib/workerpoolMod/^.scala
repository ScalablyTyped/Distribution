package typings
package workerpoolLib.workerpoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workerpool", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val cpus: scala.Double = js.native
  val isMainThread: scala.Boolean = js.native
  val platform: workerpoolLib.workerpoolLibStrings.node | workerpoolLib.workerpoolLibStrings.browser = js.native
  def pool(): workerpoolLib.workerpoolMod.WorkerPool = js.native
  def pool(options: workerpoolLib.workerpoolMod.WorkerPoolOptions): workerpoolLib.workerpoolMod.WorkerPool = js.native
  def pool(pathToScript: java.lang.String): workerpoolLib.workerpoolMod.WorkerPool = js.native
  def pool(pathToScript: java.lang.String, options: workerpoolLib.workerpoolMod.WorkerPoolOptions): workerpoolLib.workerpoolMod.WorkerPool = js.native
  def worker(): js.Any = js.native
  def worker(methods: org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, _]]): js.Any = js.native
}

