package typings.yamlAstParser

import org.scalablytyped.runtime.Shortcut
import typings.yamlAstParser.schemaMod.Schema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultSafeMod extends Shortcut {
  
  @JSImport("yaml-ast-parser/dist/src/schema/default_safe", JSImport.Namespace)
  @js.native
  val ^ : Schema = js.native
  
  type _To = Schema
  
  /* This means you don't have to write `^`, but can instead just say `defaultSafeMod.foo` */
  override def _to: Schema = ^
}
