package typings.subscribeUiEvent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type TouchEventCallback[T /* <: typings.subscribeUiEvent.mod.TouchEventType */] = js.Function2[
    /* event */ typings.std.TouchEvent, 
    /* payload */ typings.subscribeUiEvent.mod.ArgmentedEvent[T], 
    js.Any
  ]
  type UIEventCallback[T /* <: typings.subscribeUiEvent.mod.UIEventType */] = js.Function2[
    /* event */ typings.std.UIEvent, 
    /* payload */ typings.subscribeUiEvent.mod.ArgmentedEvent[T], 
    js.Any
  ]
}
