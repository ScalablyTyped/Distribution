package typings.workerpool.workerpoolMod

import org.scalablytyped.runtime.StringDictionary
import typings.workerpool.workerpoolStrings.browser
import typings.workerpool.workerpoolStrings.node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workerpool", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val cpus: Double = js.native
  val isMainThread: Boolean = js.native
  val platform: node | browser = js.native
  def pool(): WorkerPool = js.native
  def pool(options: WorkerPoolOptions): WorkerPool = js.native
  def pool(pathToScript: String): WorkerPool = js.native
  def pool(pathToScript: String, options: WorkerPoolOptions): WorkerPool = js.native
  def worker(): js.Any = js.native
  def worker(methods: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): js.Any = js.native
}

