package typings.stylableRuntime.typesMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeRenderer[I, O /* <: Element */] extends js.Object {
  
  def create(stylesheet: I, key: String): O = js.native
  def create(stylesheet: I, key: Double): O = js.native
  
  def hasKey(node: O): Boolean = js.native
  
  def renderKey(stylesheet: I): String | Double = js.native
  
  def update(stylesheet: I, node: O): O = js.native
}
