package typings.styledJsx

import typings.react.mod.ReactElement
import typings.styledJsx.anon.Nonce
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverMod {
  
  @JSImport("styled-jsx/server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T](): js.Array[ReactElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Array[ReactElement]]
  @scala.inline
  def default[T](opts: Nonce): js.Array[ReactElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Array[ReactElement]]
  
  @scala.inline
  def flushToHTML(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("flushToHTML")().asInstanceOf[String]
  @scala.inline
  def flushToHTML(opts: Nonce): String = ^.asInstanceOf[js.Dynamic].applyDynamic("flushToHTML")(opts.asInstanceOf[js.Any]).asInstanceOf[String]
}
