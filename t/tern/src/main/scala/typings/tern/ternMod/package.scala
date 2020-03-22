package typings.tern

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ternMod {
  type ConstructorOptions = typings.tern.ternMod.CtorOptions with (typings.tern.ternMod.SyncConstructorOptions | typings.tern.ternMod.ASyncConstructorOptions)
  type Query = /* import warning: importer.ImportType#apply Failed type conversion: tern.AnonResult | tern.AnonQueryResult | tern.AnonQueryRefsQuery | tern.AnonQueryRenameQuery | tern.AnonQueryDefinitionQuery | tern.AnonQueryCompletionsQuery | tern.AnonQueryPropertiesQuery | tern.AnonQueryDocumentationQuery['query'] */ js.Any
  type QueryResult[Q /* <: typings.tern.ternMod.Query */] = /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.QueryRegistry[Q['type']]['result'] */ js.Any
}
