package typings.vueRuntimeDom.mod

import typings.vueRuntimeDom.vueRuntimeDomBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("@vue/runtime-dom", "KeepAlive")
@js.native
open class KeepAlive ()
  extends typings.vueRuntimeCore.mod.KeepAlive
object KeepAlive {
  
  @JSImport("@vue/runtime-dom", "KeepAlive")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@vue/runtime-dom", "KeepAlive.__isKeepAlive")
  @js.native
  def isKeepAlive: `true` = js.native
  
  inline def isKeepAlive_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__isKeepAlive")(x.asInstanceOf[js.Any])
}
