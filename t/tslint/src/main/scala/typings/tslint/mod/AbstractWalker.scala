package typings.tslint.mod

import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint", "AbstractWalker")
@js.native
abstract class AbstractWalker[T] protected ()
  extends typings.tslint.walkerMod.AbstractWalker[T] {
  def this(sourceFile: SourceFile, ruleName: String, options: T) = this()
}
