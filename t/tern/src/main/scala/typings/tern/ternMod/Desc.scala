package typings.tern.ternMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Desc[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.Query['type'] */ js.Any */] extends js.Object {
  
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
  
  var takesFile: js.UndefOr[Boolean] = js.native
}
