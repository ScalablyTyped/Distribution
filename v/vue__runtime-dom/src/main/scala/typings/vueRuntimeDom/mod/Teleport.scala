package typings.vueRuntimeDom.mod

import typings.vueRuntimeDom.vueRuntimeDomBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("@vue/runtime-dom", "Teleport")
@js.native
open class Teleport ()
  extends typings.vueRuntimeCore.mod.Teleport
object Teleport {
  
  @JSImport("@vue/runtime-dom", "Teleport")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@vue/runtime-dom", "Teleport.__isTeleport")
  @js.native
  def isTeleport: `true` = js.native
  
  inline def isTeleport_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__isTeleport")(x.asInstanceOf[js.Any])
}
