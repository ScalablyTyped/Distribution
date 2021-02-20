package typings.styledJsx

import typings.react.mod.ReactElement
import typings.styledJsx.anon.Nonce
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverMod {
  
  @JSImport("styled-jsx/server", JSImport.Default)
  @js.native
  def default[T](): js.Array[ReactElement] = js.native
  @JSImport("styled-jsx/server", JSImport.Default)
  @js.native
  def default[T](opts: Nonce): js.Array[ReactElement] = js.native
  
  @JSImport("styled-jsx/server", "flushToHTML")
  @js.native
  def flushToHTML(): String = js.native
  @JSImport("styled-jsx/server", "flushToHTML")
  @js.native
  def flushToHTML(opts: Nonce): String = js.native
}
