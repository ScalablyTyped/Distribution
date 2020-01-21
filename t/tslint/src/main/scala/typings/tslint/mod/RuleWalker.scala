package typings.tslint.mod

import typings.tslint.ruleMod.IOptions
import typings.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "RuleWalker")
@js.native
class RuleWalker protected ()
  extends typings.tslint.walkerMod.RuleWalker {
  def this(sourceFile: SourceFile, options: IOptions) = this()
}

