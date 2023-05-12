package typings.vueRuntimeCore.mod

import typings.vueRuntimeCore.anon.`0`
import typings.vueRuntimeCore.vueRuntimeCoreBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("@vue/runtime-core", "KeepAlive")
@js.native
open class KeepAlive ()
  extends StObject
     with typings.vueRuntimeCore.anon.Slots {
  
  /* CompleteClass */
  @JSName("$props")
  var $props: VNodeProps & KeepAliveProps = js.native
  
  /* CompleteClass */
  @JSName("$slots")
  var $slots: `0` = js.native
}
object KeepAlive {
  
  @JSImport("@vue/runtime-core", "KeepAlive")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@vue/runtime-core", "KeepAlive.__isKeepAlive")
  @js.native
  def isKeepAlive: `true` = js.native
  
  inline def isKeepAlive_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__isKeepAlive")(x.asInstanceOf[js.Any])
}
