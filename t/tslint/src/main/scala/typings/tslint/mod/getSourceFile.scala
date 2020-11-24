package typings.tslint.mod

import typings.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint", "getSourceFile")
@js.native
object getSourceFile extends js.Object {
  
  def apply(fileName: String, source: String): SourceFile = js.native
}
