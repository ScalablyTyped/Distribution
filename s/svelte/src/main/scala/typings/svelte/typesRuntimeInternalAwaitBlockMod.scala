package typings.svelte

import typings.std.HTMLElement
import typings.svelte.typesRuntimeInternalTypesMod.Fragment
import typings.svelte.typesRuntimeInternalTypesMod.FragmentFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRuntimeInternalAwaitBlockMod {
  
  @JSImport("svelte/types/runtime/internal/await_block", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def handlePromise[T](promise: js.Promise[T], info: PromiseInfo[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("handle_promise")(promise.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def updateAwaitBlockBranch(info: Any, ctx: Any, dirty: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update_await_block_branch")(info.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], dirty.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait PromiseInfo[T] extends StObject {
    
    var anchor: HTMLElement
    
    var block: Fragment | Null
    
    var blocks: js.Tuple3[Null | Fragment, Null | Fragment, Null | Fragment]
    
    def `catch`(ctx: Any): Fragment
    @JSName("catch")
    var catch_Original: FragmentFactory
    
    var ctx: Null | Any
    
    var current: FragmentFactory | Null
    
    var error: Double
    
    var hasCatch: Boolean
    
    def mount(): HTMLElement
    
    def pending(ctx: Any): Fragment
    @JSName("pending")
    var pending_Original: FragmentFactory
    
    var resolved: js.UndefOr[T] = js.undefined
    
    def `then`(ctx: Any): Fragment
    @JSName("then")
    var then_Original: FragmentFactory
    
    var value: Double
  }
  object PromiseInfo {
    
    inline def apply[T](
      anchor: HTMLElement,
      blocks: js.Tuple3[Null | Fragment, Null | Fragment, Null | Fragment],
      `catch`: /* ctx */ Any => Fragment,
      error: Double,
      hasCatch: Boolean,
      mount: () => HTMLElement,
      pending: /* ctx */ Any => Fragment,
      `then`: /* ctx */ Any => Fragment,
      value: Double
    ): PromiseInfo[T] = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], blocks = blocks.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], hasCatch = hasCatch.asInstanceOf[js.Any], mount = js.Any.fromFunction0(mount), pending = js.Any.fromFunction1(pending), value = value.asInstanceOf[js.Any], block = null, ctx = null, current = null)
      __obj.updateDynamic("catch")(js.Any.fromFunction1(`catch`))
      __obj.updateDynamic("then")(js.Any.fromFunction1(`then`))
      __obj.asInstanceOf[PromiseInfo[T]]
    }
    
    extension [Self <: PromiseInfo[?], T](x: Self & PromiseInfo[T]) {
      
      inline def setAnchor(value: HTMLElement): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setBlock(value: Fragment): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setBlockNull: Self = StObject.set(x, "block", null)
      
      inline def setBlocks(value: js.Tuple3[Null | Fragment, Null | Fragment, Null | Fragment]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
      
      inline def setCatch(value: /* ctx */ Any => Fragment): Self = StObject.set(x, "catch", js.Any.fromFunction1(value))
      
      inline def setCtx(value: Any): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setCtxNull: Self = StObject.set(x, "ctx", null)
      
      inline def setCurrent(value: /* ctx */ Any => Fragment): Self = StObject.set(x, "current", js.Any.fromFunction1(value))
      
      inline def setCurrentNull: Self = StObject.set(x, "current", null)
      
      inline def setError(value: Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setHasCatch(value: Boolean): Self = StObject.set(x, "hasCatch", value.asInstanceOf[js.Any])
      
      inline def setMount(value: () => HTMLElement): Self = StObject.set(x, "mount", js.Any.fromFunction0(value))
      
      inline def setPending(value: /* ctx */ Any => Fragment): Self = StObject.set(x, "pending", js.Any.fromFunction1(value))
      
      inline def setResolved(value: T): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
      
      inline def setResolvedUndefined: Self = StObject.set(x, "resolved", js.undefined)
      
      inline def setThen(value: /* ctx */ Any => Fragment): Self = StObject.set(x, "then", js.Any.fromFunction1(value))
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
