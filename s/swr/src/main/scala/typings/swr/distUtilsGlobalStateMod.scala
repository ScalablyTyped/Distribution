package typings.swr

import typings.std.Record
import typings.std.WeakMap
import typings.swr.distTypesMod.Cache
import typings.swr.distTypesMod.RevalidateCallback
import typings.swr.distTypesMod.ScopedMutator
import typings.swr.distTypesMod.StateUpdateCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsGlobalStateMod {
  
  @JSImport("swr/dist/utils/global-state", "SWRGlobalState")
  @js.native
  val SWRGlobalState: WeakMap[Cache[Any], GlobalState] = js.native
  
  type GlobalState = js.Tuple5[
    Record[String, js.Array[RevalidateCallback]], 
    Record[String, js.Array[StateUpdateCallback[Any, Any]]], 
    Record[String, js.Tuple2[Double, Double]], 
    Record[String, js.Tuple2[Any, Double]], 
    ScopedMutator[Any]
  ]
}
