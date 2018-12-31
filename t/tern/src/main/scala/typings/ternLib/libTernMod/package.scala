package typings
package ternLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTernMod {
  type ConstructorOptions = CtorOptions with (SyncConstructorOptions | ASyncConstructorOptions)
  type Query = /* import warning: ImportType.apply Failed type conversion: tern.Anon_Result | tern.Anon_ResultQuery | tern.Anon_ResultQueryDefinitionQueryResult | tern.Anon_ResultQueryDocumentationQueryResult | tern.Anon_ResultQueryRefsQueryResult | tern.Anon_ResultQueryRenameQueryResult | tern.Anon_ResultQueryPropertiesQueryResult | tern.Anon_ResultQueryFilesQueryResult['query'] */ js.Any
  type QueryResult[Q /* <: Query */] = /* import warning: ImportType.apply Failed type conversion: tern.tern/lib/tern.QueryRegistry[Q['type']]['result'] */ js.Any
}
