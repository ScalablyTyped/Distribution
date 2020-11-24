package typings.typedoc.mod.TypeScript

import typings.typescript.mod.LineAndCharacter
import typings.typescript.mod.SourceFileLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.getLineAndCharacterOfPosition")
@js.native
object getLineAndCharacterOfPosition extends js.Object {
  
  def apply(sourceFile: SourceFileLike, position: Double): LineAndCharacter = js.native
}
