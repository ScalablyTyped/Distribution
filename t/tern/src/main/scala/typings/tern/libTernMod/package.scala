package typings.tern

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTernMod {
  type ConstructorOptions = CtorOptions with (SyncConstructorOptions | ASyncConstructorOptions)
  type Query = /* import warning: importer.ImportType#apply Failed type conversion: tern.Anon_QueryResult | tern.Anon_QueryResultFilesQuery | tern.Anon_QueryResultRenameQuery | tern.Anon_QueryResultRefsQuery | tern.Anon_QueryResultPropertiesQuery | tern.Anon_QueryResultDefinitionQuery | tern.Anon_QueryResultTypeQuery | tern.Anon_QueryResultCompletionsQuery['query'] */ js.Any
  type QueryResult[Q /* <: Query */] = /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.QueryRegistry[Q['type']]['result'] */ js.Any
}
