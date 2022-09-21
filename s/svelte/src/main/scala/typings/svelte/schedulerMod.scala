package typings.svelte

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schedulerMod {
  
  @JSImport("svelte/types/runtime/internal/scheduler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addFlushCallback(fn: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add_flush_callback")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addRenderCallback(fn: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add_render_callback")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("svelte/types/runtime/internal/scheduler", "binding_callbacks")
  @js.native
  val bindingCallbacks: js.Array[Any] = js.native
  
  @JSImport("svelte/types/runtime/internal/scheduler", "dirty_components")
  @js.native
  val dirtyComponents: js.Array[Any] = js.native
  
  inline def flush(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")().asInstanceOf[Unit]
  
  object intros {
    
    @JSImport("svelte/types/runtime/internal/scheduler", "intros")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("svelte/types/runtime/internal/scheduler", "intros.enabled")
    @js.native
    def enabled: Boolean = js.native
    inline def enabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enabled")(x.asInstanceOf[js.Any])
  }
  
  inline def scheduleUpdate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("schedule_update")().asInstanceOf[Unit]
  
  inline def tick(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("tick")().asInstanceOf[js.Promise[Unit]]
}
