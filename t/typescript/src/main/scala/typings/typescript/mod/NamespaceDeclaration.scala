package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamespaceDeclaration
  extends ModuleDeclaration
     with NamespaceBody {
  @JSName("body")
  var body_NamespaceDeclaration: NamespaceBody = js.native
  @JSName("name")
  var name_NamespaceDeclaration: Identifier = js.native
}

