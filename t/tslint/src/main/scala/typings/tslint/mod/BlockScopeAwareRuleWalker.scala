package typings.tslint.mod

import typings.tslint.libLanguageRuleRuleMod.IOptions
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("tslint", "BlockScopeAwareRuleWalker")
@js.native
open class BlockScopeAwareRuleWalker[T, U] protected ()
  extends typings.tslint.libLanguageWalkerMod.BlockScopeAwareRuleWalker[T, U] {
  def this(sourceFile: SourceFile, options: IOptions) = this()
}
