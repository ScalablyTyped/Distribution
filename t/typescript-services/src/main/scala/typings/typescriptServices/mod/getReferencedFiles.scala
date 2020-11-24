package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.IFileReference
import typings.typescriptServices.TypeScript.IScriptSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "getReferencedFiles")
@js.native
object getReferencedFiles extends js.Object {
  
  def apply(fileName: String, sourceText: IScriptSnapshot): js.Array[IFileReference] = js.native
}
