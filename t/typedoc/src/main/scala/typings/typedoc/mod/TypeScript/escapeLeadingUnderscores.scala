package typings.typedoc.mod.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.escapeLeadingUnderscores")
@js.native
object escapeLeadingUnderscores extends js.Object {
  
  /** Add an extra underscore to identifiers that start with two underscores to avoid issues with magic names like '__proto__' */
  def apply(identifier: String): typings.typescript.mod.String = js.native
}
