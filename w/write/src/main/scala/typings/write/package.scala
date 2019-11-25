package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object write {
  import typings.std.Extract
  import typings.std.Record

  type CreateWriteStreamOptions = Extract[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.createWriteStream * / any>[1] */ js.Any, 
    Record[String, js.Any]
  ]
}
