package typings.typedoc.mod.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.WatchFileKind")
@js.native
object WatchFileKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.typescript.mod.WatchFileKind & Double] = js.native
  
  /* 2 */ val DynamicPriorityPolling: typings.typescript.mod.WatchFileKind.DynamicPriorityPolling & Double = js.native
  
  /* 3 */ val FixedChunkSizePolling: typings.typescript.mod.WatchFileKind.FixedChunkSizePolling & Double = js.native
  
  /* 0 */ val FixedPollingInterval: typings.typescript.mod.WatchFileKind.FixedPollingInterval & Double = js.native
  
  /* 1 */ val PriorityPollingInterval: typings.typescript.mod.WatchFileKind.PriorityPollingInterval & Double = js.native
  
  /* 4 */ val UseFsEvents: typings.typescript.mod.WatchFileKind.UseFsEvents & Double = js.native
  
  /* 5 */ val UseFsEventsOnParentDirectory: typings.typescript.mod.WatchFileKind.UseFsEventsOnParentDirectory & Double = js.native
}
