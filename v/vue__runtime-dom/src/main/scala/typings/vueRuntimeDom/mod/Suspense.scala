package typings.vueRuntimeDom.mod

import typings.vueRuntimeDom.vueRuntimeDomBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("@vue/runtime-dom", "Suspense")
@js.native
open class Suspense ()
  extends typings.vueRuntimeCore.mod.Suspense
object Suspense {
  
  @JSImport("@vue/runtime-dom", "Suspense")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@vue/runtime-dom", "Suspense.__isSuspense")
  @js.native
  def isSuspense: `true` = js.native
  
  inline def isSuspense_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__isSuspense")(x.asInstanceOf[js.Any])
}
