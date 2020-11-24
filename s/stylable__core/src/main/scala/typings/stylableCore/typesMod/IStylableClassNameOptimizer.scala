package typings.stylableCore.typesMod

import typings.postcss.mod.Root_
import typings.std.Record
import typings.stylableCore.anon.Names
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStylableClassNameOptimizer extends js.Object {
  
  var context: Names = js.native
  
  def generateName(name: String): String = js.native
  
  def optimizeAstAndExports(
    ast: Root_,
    exported: Record[String, String],
    classes: js.Array[String],
    usageMapping: Record[String, Boolean]
  ): Unit = js.native
  def optimizeAstAndExports(
    ast: Root_,
    exported: Record[String, String],
    classes: js.Array[String],
    usageMapping: Record[String, Boolean],
    globals: Record[String, Boolean]
  ): Unit = js.native
  
  def rewriteSelector(selector: String, usageMapping: Record[String, Boolean], globals: Record[String, Boolean]): String = js.native
}
