package typings.tern.libTernMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Desc[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.Query['type'] */ js.Any */] extends js.Object {
  var takesFile: js.UndefOr[Boolean] = js.native
  @JSName("run")
  def run_query(
    Server: Server,
    query: /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.QueryRegistry[T]['query'] */ js.Any
  ): /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.QueryRegistry[T]['result'] */ js.Any = js.native
  @JSName("run")
  def run_query(
    Server: Server,
    query: /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.QueryRegistry[T]['query'] */ js.Any,
    file: File
  ): /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.QueryRegistry[T]['result'] */ js.Any = js.native
}

