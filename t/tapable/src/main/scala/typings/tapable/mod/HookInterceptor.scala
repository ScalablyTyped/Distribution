package typings.tapable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tapable", "HookInterceptor")
@js.native
class HookInterceptor () extends js.Object {
  
  var call: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  
  var context: js.UndefOr[Boolean] = js.native
  
  var loop: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  
  var register: js.UndefOr[
    js.Function1[/* tap */ Tap[TapType, _, _, _, _], js.UndefOr[Tap[TapType, _, _, _, _]]]
  ] = js.native
  
  var tap: js.UndefOr[js.Function1[/* tap */ Tap[TapType, _, _, _, _], Unit]] = js.native
}
