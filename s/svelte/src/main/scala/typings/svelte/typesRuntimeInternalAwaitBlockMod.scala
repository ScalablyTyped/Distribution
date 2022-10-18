package typings.svelte

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRuntimeInternalAwaitBlockMod {
  
  @JSImport("svelte/types/runtime/internal/await_block", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def handlePromise(promise: Any, info: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("handle_promise")(promise.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def updateAwaitBlockBranch(info: Any, ctx: Any, dirty: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update_await_block_branch")(info.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], dirty.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
