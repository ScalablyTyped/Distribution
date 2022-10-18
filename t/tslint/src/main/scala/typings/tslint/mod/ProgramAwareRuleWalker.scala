package typings.tslint.mod

import typings.tslint.libLanguageRuleRuleMod.IOptions
import typings.typescript.mod.Program
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint", "ProgramAwareRuleWalker")
@js.native
open class ProgramAwareRuleWalker protected ()
  extends typings.tslint.libLanguageWalkerMod.ProgramAwareRuleWalker {
  def this(sourceFile: SourceFile, options: IOptions, program: Program) = this()
}
