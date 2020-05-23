package typings.styledJsx

import typings.react.mod.ReactElement
import typings.styledJsx.anon.Nonce
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styled-jsx/server", JSImport.Namespace)
@js.native
object serverMod extends js.Object {
  def default[T](): js.Array[ReactElement] = js.native
  def default[T](opts: Nonce): js.Array[ReactElement] = js.native
  def flushToHTML(): String = js.native
  def flushToHTML(opts: Nonce): String = js.native
}

