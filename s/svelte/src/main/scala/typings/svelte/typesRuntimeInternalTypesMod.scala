package typings.svelte

import typings.std.Element
import typings.std.HTMLElement
import typings.std.Map
import typings.std.Record
import typings.std.ShadowRoot
import typings.svelte.svelteBooleans.`false`
import typings.svelte.svelteInts.`0`
import typings.svelte.svelteInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRuntimeInternalTypesMod {
  
  trait Fragment extends StObject {
    
    def a(): Unit
    
    def c(): Unit
    
    def d(detaching: `0` | `1`): Unit
    
    def f(): Unit
    
    var first: Null
    
    def h(): Unit
    
    def i(local: Any): Unit
    
    var key: String | Null
    
    def l(nodes: Any): Unit
    
    def m(target: HTMLElement, anchor: Any): Unit
    
    def o(local: Any): Unit
    
    def p(ctx: js.Array[Any], dirty: js.Array[Double]): Unit
    
    def r(): Unit
  }
  object Fragment {
    
    inline def apply(
      a: () => Unit,
      c: () => Unit,
      d: `0` | `1` => Unit,
      f: () => Unit,
      first: Null,
      h: () => Unit,
      i: Any => Unit,
      l: Any => Unit,
      m: (HTMLElement, Any) => Unit,
      o: Any => Unit,
      p: (js.Array[Any], js.Array[Double]) => Unit,
      r: () => Unit
    ): Fragment = {
      val __obj = js.Dynamic.literal(a = js.Any.fromFunction0(a), c = js.Any.fromFunction0(c), d = js.Any.fromFunction1(d), f = js.Any.fromFunction0(f), first = first.asInstanceOf[js.Any], h = js.Any.fromFunction0(h), i = js.Any.fromFunction1(i), l = js.Any.fromFunction1(l), m = js.Any.fromFunction2(m), o = js.Any.fromFunction1(o), p = js.Any.fromFunction2(p), r = js.Any.fromFunction0(r), key = null)
      __obj.asInstanceOf[Fragment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Fragment] (val x: Self) extends AnyVal {
      
      inline def setA(value: () => Unit): Self = StObject.set(x, "a", js.Any.fromFunction0(value))
      
      inline def setC(value: () => Unit): Self = StObject.set(x, "c", js.Any.fromFunction0(value))
      
      inline def setD(value: `0` | `1` => Unit): Self = StObject.set(x, "d", js.Any.fromFunction1(value))
      
      inline def setF(value: () => Unit): Self = StObject.set(x, "f", js.Any.fromFunction0(value))
      
      inline def setFirst(value: Null): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setH(value: () => Unit): Self = StObject.set(x, "h", js.Any.fromFunction0(value))
      
      inline def setI(value: Any => Unit): Self = StObject.set(x, "i", js.Any.fromFunction1(value))
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyNull: Self = StObject.set(x, "key", null)
      
      inline def setL(value: Any => Unit): Self = StObject.set(x, "l", js.Any.fromFunction1(value))
      
      inline def setM(value: (HTMLElement, Any) => Unit): Self = StObject.set(x, "m", js.Any.fromFunction2(value))
      
      inline def setO(value: Any => Unit): Self = StObject.set(x, "o", js.Any.fromFunction1(value))
      
      inline def setP(value: (js.Array[Any], js.Array[Double]) => Unit): Self = StObject.set(x, "p", js.Any.fromFunction2(value))
      
      inline def setR(value: () => Unit): Self = StObject.set(x, "r", js.Any.fromFunction0(value))
    }
  }
  
  type FragmentFactory = js.Function1[/* ctx */ Any, Fragment]
  
  trait T extends StObject {
    
    var after_update: js.Array[Any]
    
    var before_update: js.Array[Any]
    
    var bound: Any
    
    var callbacks: Any
    
    var context: Map[Any, Any]
    
    var ctx: js.Array[Any]
    
    var dirty: js.Array[Double]
    
    var fragment: Null | `false` | Fragment
    
    var not_equal: Any
    
    var on_destroy: js.Array[Any]
    
    var on_disconnect: js.Array[Any]
    
    var on_mount: js.Array[Any]
    
    var props: Record[String, `0` | String]
    
    var root: Element | ShadowRoot
    
    var skip_bound: Boolean
    
    def update(): Unit
  }
  object T {
    
    inline def apply(
      after_update: js.Array[Any],
      before_update: js.Array[Any],
      bound: Any,
      callbacks: Any,
      context: Map[Any, Any],
      ctx: js.Array[Any],
      dirty: js.Array[Double],
      not_equal: Any,
      on_destroy: js.Array[Any],
      on_disconnect: js.Array[Any],
      on_mount: js.Array[Any],
      props: Record[String, `0` | String],
      root: Element | ShadowRoot,
      skip_bound: Boolean,
      update: () => Unit
    ): T = {
      val __obj = js.Dynamic.literal(after_update = after_update.asInstanceOf[js.Any], before_update = before_update.asInstanceOf[js.Any], bound = bound.asInstanceOf[js.Any], callbacks = callbacks.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], dirty = dirty.asInstanceOf[js.Any], not_equal = not_equal.asInstanceOf[js.Any], on_destroy = on_destroy.asInstanceOf[js.Any], on_disconnect = on_disconnect.asInstanceOf[js.Any], on_mount = on_mount.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], skip_bound = skip_bound.asInstanceOf[js.Any], update = js.Any.fromFunction0(update), fragment = null)
      __obj.asInstanceOf[T]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: T] (val x: Self) extends AnyVal {
      
      inline def setAfter_update(value: js.Array[Any]): Self = StObject.set(x, "after_update", value.asInstanceOf[js.Any])
      
      inline def setAfter_updateVarargs(value: Any*): Self = StObject.set(x, "after_update", js.Array(value*))
      
      inline def setBefore_update(value: js.Array[Any]): Self = StObject.set(x, "before_update", value.asInstanceOf[js.Any])
      
      inline def setBefore_updateVarargs(value: Any*): Self = StObject.set(x, "before_update", js.Array(value*))
      
      inline def setBound(value: Any): Self = StObject.set(x, "bound", value.asInstanceOf[js.Any])
      
      inline def setCallbacks(value: Any): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setContext(value: Map[Any, Any]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setCtx(value: js.Array[Any]): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setCtxVarargs(value: Any*): Self = StObject.set(x, "ctx", js.Array(value*))
      
      inline def setDirty(value: js.Array[Double]): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
      
      inline def setDirtyVarargs(value: Double*): Self = StObject.set(x, "dirty", js.Array(value*))
      
      inline def setFragment(value: `false` | Fragment): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      inline def setFragmentNull: Self = StObject.set(x, "fragment", null)
      
      inline def setNot_equal(value: Any): Self = StObject.set(x, "not_equal", value.asInstanceOf[js.Any])
      
      inline def setOn_destroy(value: js.Array[Any]): Self = StObject.set(x, "on_destroy", value.asInstanceOf[js.Any])
      
      inline def setOn_destroyVarargs(value: Any*): Self = StObject.set(x, "on_destroy", js.Array(value*))
      
      inline def setOn_disconnect(value: js.Array[Any]): Self = StObject.set(x, "on_disconnect", value.asInstanceOf[js.Any])
      
      inline def setOn_disconnectVarargs(value: Any*): Self = StObject.set(x, "on_disconnect", js.Array(value*))
      
      inline def setOn_mount(value: js.Array[Any]): Self = StObject.set(x, "on_mount", value.asInstanceOf[js.Any])
      
      inline def setOn_mountVarargs(value: Any*): Self = StObject.set(x, "on_mount", js.Array(value*))
      
      inline def setProps(value: Record[String, `0` | String]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: Element | ShadowRoot): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSkip_bound(value: Boolean): Self = StObject.set(x, "skip_bound", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
}
