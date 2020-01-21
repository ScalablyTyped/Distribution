package typings.tern

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ternMod {
  type ConstructorOptions = typings.tern.ternMod.CtorOptions with (typings.tern.ternMod.SyncConstructorOptions | typings.tern.ternMod.ASyncConstructorOptions)
  type Query = /* import warning: importer.ImportType#apply Failed type conversion: tern.Anon_QueryResult | tern.Anon_QueryResultFilesQuery | tern.Anon_QueryResultRefsQuery | tern.Anon_QueryResultRenameQuery | tern.Anon_QueryResultDefinitionQuery | tern.Anon_QueryResultCompletionsQuery | tern.Anon_QueryResultPropertiesQuery | tern.Anon_QueryResultDocumentationQuery['query'] */ js.Any
  type QueryResult[Q /* <: typings.tern.ternMod.Query */] = /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.QueryRegistry[Q['type']]['result'] */ js.Any
}
