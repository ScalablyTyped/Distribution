package typings.atWordpressHooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atWordpressHooksMod {
  import typings.atWordpressHooks.Anon_Current
  import typings.std.Record

  type ActionCallback = js.Function1[/* repeated */ js.Any, Unit]
  type CurrentHook = js.Function0[String | Null]
  type DidHook = js.Function1[/* hookName */ String, Double]
  type DoingHook = js.Function1[/* hookName */ js.UndefOr[String], Boolean]
  type FilterCallback = js.Function2[/* firstArg */ js.Any, /* repeated */ js.Any, Double | String]
  type HasHook = js.Function1[/* hookName */ String, Boolean]
  type HookMap[T /* <: js.Function1[/* repeated */ js.Any, _] */] = Anon_Current[T] with (Record[String, js.UndefOr[js.Array[Hook[T]]]])
  type RemoveHook = js.Function2[/* hookName */ String, /* namespace */ String, Double]
  type RunHook = js.Function3[
    /* hookName */ String, 
    /* firstArg */ js.UndefOr[js.Any], 
    /* repeated */ js.Any, 
    Double | String
  ]
}
