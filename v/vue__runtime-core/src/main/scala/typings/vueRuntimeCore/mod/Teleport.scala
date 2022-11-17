package typings.vueRuntimeCore.mod

import typings.vueRuntimeCore.anon.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("@vue/runtime-core", "Teleport")
@js.native
open class Teleport ()
  extends StObject
     with `2` {
  
  /* CompleteClass */
  @JSName("$props")
  var $props: VNodeProps & TeleportProps = js.native
}
object Teleport {
  
  @JSImport("@vue/runtime-core", "Teleport")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@vue/runtime-core", "Teleport.__isTeleport")
  @js.native
  def isTeleport: true = js.native
  
  inline def isTeleport_=(x: true): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__isTeleport")(x.asInstanceOf[js.Any])
}
