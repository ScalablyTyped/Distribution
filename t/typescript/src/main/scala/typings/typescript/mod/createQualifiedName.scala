package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createQualifiedName")
@js.native
object createQualifiedName extends js.Object {
  
  /** @deprecated Use `factory.createQualifiedName` or the factory supplied by your transformation context instead. */
  def apply(left: EntityName, right: java.lang.String): QualifiedName = js.native
  def apply(left: EntityName, right: Identifier): QualifiedName = js.native
}
