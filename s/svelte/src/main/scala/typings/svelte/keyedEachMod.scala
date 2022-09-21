package typings.svelte

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyedEachMod {
  
  @JSImport("svelte/types/runtime/internal/keyed_each", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def destroyBlock(block: Any, lookup: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("destroy_block")(block.asInstanceOf[js.Any], lookup.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fixAndDestroyBlock(block: Any, lookup: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fix_and_destroy_block")(block.asInstanceOf[js.Any], lookup.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fixAndOutroAndDestroyBlock(block: Any, lookup: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fix_and_outro_and_destroy_block")(block.asInstanceOf[js.Any], lookup.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def outroAndDestroyBlock(block: Any, lookup: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outro_and_destroy_block")(block.asInstanceOf[js.Any], lookup.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def updateKeyedEach(
    old_blocks: Any,
    dirty: Any,
    get_key: Any,
    dynamic: Any,
    ctx: Any,
    list: Any,
    lookup: Any,
    node: Any,
    destroy: Any,
    create_each_block: Any,
    next: Any,
    get_context: Any
  ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("update_keyed_each")(old_blocks.asInstanceOf[js.Any], dirty.asInstanceOf[js.Any], get_key.asInstanceOf[js.Any], dynamic.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], list.asInstanceOf[js.Any], lookup.asInstanceOf[js.Any], node.asInstanceOf[js.Any], destroy.asInstanceOf[js.Any], create_each_block.asInstanceOf[js.Any], next.asInstanceOf[js.Any], get_context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def validateEachKeys(ctx: Any, list: Any, get_context: Any, get_key: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validate_each_keys")(ctx.asInstanceOf[js.Any], list.asInstanceOf[js.Any], get_context.asInstanceOf[js.Any], get_key.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
