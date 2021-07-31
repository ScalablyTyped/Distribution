package typings.utilPromisify

import typings.utilPromisify.anon.FnCall
import typings.utilPromisify.anon.Typeofpromisify
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polyfillMod {
  
  @scala.inline
  def apply(): FnCall | Typeofpromisify = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[FnCall | Typeofpromisify]
  
  @JSImport("util.promisify/polyfill", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
