package typings.svelte

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object environmentMod {
  
  @JSImport("svelte/types/runtime/internal/environment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("svelte/types/runtime/internal/environment", "is_client")
  @js.native
  val isClient: Boolean = js.native
  
  @JSImport("svelte/types/runtime/internal/environment", "now")
  @js.native
  def now: js.Function0[Double] = js.native
  inline def now_=(x: js.Function0[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("now")(x.asInstanceOf[js.Any])
  
  @JSImport("svelte/types/runtime/internal/environment", "raf")
  @js.native
  def raf: js.Function0[Unit] | (js.Function1[/* cb */ Any, Double]) = js.native
  inline def raf_=(x: js.Function0[Unit] | (js.Function1[/* cb */ Any, Double])): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("raf")(x.asInstanceOf[js.Any])
  
  inline def setNow(fn: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("set_now")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setRaf(fn: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("set_raf")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
