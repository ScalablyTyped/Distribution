package typings.atUirouterCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTransitionTransitionHookMod {
  import typings.atUirouterCore.libTransitionInterfaceMod.HookResult

  type ErrorHandler = js.Function1[/* error */ js.Any, js.Promise[js.Any]]
  type GetErrorHandler = js.Function1[/* hook */ TransitionHook, ErrorHandler]
  type GetResultHandler = js.Function1[/* hook */ TransitionHook, ResultHandler]
  type ResultHandler = js.Function1[/* result */ HookResult, js.Promise[HookResult]]
}
