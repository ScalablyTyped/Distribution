package typings.tslint.mod

import typings.tslint.libLanguageRuleRuleMod.IOptions
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("tslint", "ScopeAwareRuleWalker")
@js.native
open class ScopeAwareRuleWalker[T] protected ()
  extends typings.tslint.libLanguageWalkerMod.ScopeAwareRuleWalker[T] {
  def this(sourceFile: SourceFile, options: IOptions) = this()
}
