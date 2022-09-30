package typings.svelte

import typings.svelte.svelteInts.`-1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("svelte/types/runtime/internal/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def actionDestroyer(action_result: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("action_destroyer")(action_result.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def addLocation(element: Any, file: Any, line: Any, column: Any, char: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add_location")(element.asInstanceOf[js.Any], file.asInstanceOf[js.Any], line.asInstanceOf[js.Any], column.asInstanceOf[js.Any], char.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def assign[T, S](tar: T, src: S): T & S = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(tar.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[T & S]
  
  inline def blankObject(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("blank_object")().asInstanceOf[Any]
  
  inline def componentSubscribe(component: Any, store: Any, callback: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("component_subscribe")(component.asInstanceOf[js.Any], store.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def computeRestProps(props: Any, keys: Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("compute_rest_props")(props.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def computeSlots(slots: Any): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("compute_slots")(slots.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def createSlot(definition: Any, ctx: Any, DollarDollarscope: Any, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create_slot")(definition.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], DollarDollarscope.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def excludeInternalProps(props: Any): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("exclude_internal_props")(props.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def getAllDirtyFromScope(DollarDollarscope: Any): js.Array[Any] | `-1` = ^.asInstanceOf[js.Dynamic].applyDynamic("get_all_dirty_from_scope")(DollarDollarscope.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any] | `-1`]
  
  inline def getSlotChanges(definition: Any, DollarDollarscope: Any, dirty: Any, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get_slot_changes")(definition.asInstanceOf[js.Any], DollarDollarscope.asInstanceOf[js.Any], dirty.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getStoreValue[T](
    store: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Readable<T> */ Any
  ): T = ^.asInstanceOf[js.Dynamic].applyDynamic("get_store_value")(store.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def hasProp(obj: Any, prop: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("has_prop")(obj.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def identity(x: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(x.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def isEmpty(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_empty")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFunction(thing: Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_function")(thing.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  inline def isPromise[T](value: Any): /* is std.PromiseLike<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_promise")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.PromiseLike<T> */ Boolean]
  
  inline def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
  
  inline def notEqual(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("not_equal")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def nullToEmpty(value: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("null_to_empty")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def once(fn: Any): js.ThisFunction1[/* this */ Any, /* repeated */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("once")(fn.asInstanceOf[js.Any]).asInstanceOf[js.ThisFunction1[/* this */ Any, /* repeated */ Any, Unit]]
  
  inline def run(fn: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(fn.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def runAll(fns: js.Array[js.Function]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("run_all")(fns.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def safeNotEqual(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("safe_not_equal")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def setStoreValue(store: Any, ret: Any, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set_store_value")(store.asInstanceOf[js.Any], ret.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def srcUrlEqual(element_src: Any, url: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("src_url_equal")(element_src.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def subscribe(store: Any, callbacks: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(scala.List(store.asInstanceOf[js.Any]).`++`(callbacks.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
  inline def updateSlot(
    slot: Any,
    slot_definition: Any,
    ctx: Any,
    DollarDollarscope: Any,
    dirty: Any,
    get_slot_changes_fn: Any,
    get_slot_context_fn: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update_slot")(slot.asInstanceOf[js.Any], slot_definition.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], DollarDollarscope.asInstanceOf[js.Any], dirty.asInstanceOf[js.Any], get_slot_changes_fn.asInstanceOf[js.Any], get_slot_context_fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def updateSlotBase(
    slot: Any,
    slot_definition: Any,
    ctx: Any,
    DollarDollarscope: Any,
    slot_changes: Any,
    get_slot_context_fn: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update_slot_base")(slot.asInstanceOf[js.Any], slot_definition.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], DollarDollarscope.asInstanceOf[js.Any], slot_changes.asInstanceOf[js.Any], get_slot_context_fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateStore(store: Any, name: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validate_store")(store.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
