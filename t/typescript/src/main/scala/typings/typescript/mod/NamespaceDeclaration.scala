package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamespaceDeclaration
  extends ModuleDeclaration
     with NamespaceBody {
  
  @JSName("body")
  val body_NamespaceDeclaration: NamespaceBody = js.native
  
  @JSName("name")
  val name_NamespaceDeclaration: Identifier = js.native
}
