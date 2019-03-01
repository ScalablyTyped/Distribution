package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamedImports
  extends Node
     with NamedImportBindings
     with NamedImportsOrExports {
  var elements: NodeArray[ImportSpecifier] = js.native
  @JSName("parent")
  var parent_NamedImports: ImportClause = js.native
}

