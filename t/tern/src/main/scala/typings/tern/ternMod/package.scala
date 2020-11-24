package typings.tern

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object ternMod {
  
  type ConstructorOptions = typings.tern.ternMod.CtorOptions with (typings.tern.ternMod.SyncConstructorOptions | typings.tern.ternMod.ASyncConstructorOptions)
  
  type QueryResult[Q /* <: typings.tern.ternMod.Query */] = /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.QueryRegistry[Q['type']]['result'] */ js.Any
}
