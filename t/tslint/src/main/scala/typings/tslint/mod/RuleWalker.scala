package typings.tslint.mod

import typings.tslint.ruleMod.IOptions
import typings.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint", "RuleWalker")
@js.native
class RuleWalker protected ()
  extends typings.tslint.walkerMod.RuleWalker {
  def this(sourceFile: SourceFile, options: IOptions) = this()
}
