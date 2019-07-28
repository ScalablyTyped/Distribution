package typings.atUirouterCore.libTransitionTransitionEventTypeMod

import typings.atUirouterCore.libTransitionInterfaceMod.PathType
import typings.atUirouterCore.libTransitionInterfaceMod.TransitionHookPhase
import typings.atUirouterCore.libTransitionTransitionHookMod.ErrorHandler
import typings.atUirouterCore.libTransitionTransitionHookMod.GetErrorHandler
import typings.atUirouterCore.libTransitionTransitionHookMod.GetResultHandler
import typings.atUirouterCore.libTransitionTransitionHookMod.ResultHandler
import typings.atUirouterCore.libTransitionTransitionHookMod.TransitionHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/transition/transitionEventType", "TransitionEventType")
@js.native
class TransitionEventType protected () extends js.Object {
  def this(name: String, hookPhase: TransitionHookPhase, hookOrder: Double, criteriaMatchPath: PathType) = this()
  def this(
    name: String,
    hookPhase: TransitionHookPhase,
    hookOrder: Double,
    criteriaMatchPath: PathType,
    reverseSort: Boolean
  ) = this()
  def this(
    name: String,
    hookPhase: TransitionHookPhase,
    hookOrder: Double,
    criteriaMatchPath: PathType,
    reverseSort: Boolean,
    getResultHandler: GetResultHandler
  ) = this()
  def this(
    name: String,
    hookPhase: TransitionHookPhase,
    hookOrder: Double,
    criteriaMatchPath: PathType,
    reverseSort: Boolean,
    getResultHandler: GetResultHandler,
    getErrorHandler: GetErrorHandler
  ) = this()
  def this(
    name: String,
    hookPhase: TransitionHookPhase,
    hookOrder: Double,
    criteriaMatchPath: PathType,
    reverseSort: Boolean,
    getResultHandler: GetResultHandler,
    getErrorHandler: GetErrorHandler,
    synchronous: Boolean
  ) = this()
  var criteriaMatchPath: PathType = js.native
  @JSName("getErrorHandler")
  var getErrorHandler_Original: GetErrorHandler = js.native
  @JSName("getResultHandler")
  var getResultHandler_Original: GetResultHandler = js.native
  var hookOrder: Double = js.native
  var hookPhase: TransitionHookPhase = js.native
  var name: String = js.native
  var reverseSort: Boolean = js.native
  var synchronous: Boolean = js.native
  def getErrorHandler(hook: TransitionHook): ErrorHandler = js.native
  def getResultHandler(hook: TransitionHook): ResultHandler = js.native
}

