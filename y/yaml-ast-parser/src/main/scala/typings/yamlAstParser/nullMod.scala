package typings.yamlAstParser

import org.scalablytyped.runtime.Shortcut
import typings.yamlAstParser.typeMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nullMod extends Shortcut {
  
  @JSImport("yaml-ast-parser/dist/src/type/null", JSImport.Namespace)
  @js.native
  val ^ : Type = js.native
  
  type _To = Type
  
  /* This means you don't have to write `^`, but can instead just say `nullMod.foo` */
  override def _to: Type = ^
}
