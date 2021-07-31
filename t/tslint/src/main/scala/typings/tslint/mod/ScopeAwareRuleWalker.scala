package typings.tslint.mod

import typings.tslint.ruleMod.IOptions
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint", "ScopeAwareRuleWalker")
@js.native
abstract class ScopeAwareRuleWalker[T] protected ()
  extends typings.tslint.walkerMod.ScopeAwareRuleWalker[T] {
  def this(sourceFile: SourceFile, options: IOptions) = this()
}
