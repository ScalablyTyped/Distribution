package typings.systemjs.System

import typings.systemjs.anon.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  @JSName("import")
  var import_Original: ImportFn = js.native
  var meta: Url = js.native
  def `import`[T /* <: Module */](moduleId: String): js.Promise[T] = js.native
  def `import`[T /* <: Module */](moduleId: String, parentUrl: String): js.Promise[T] = js.native
}

