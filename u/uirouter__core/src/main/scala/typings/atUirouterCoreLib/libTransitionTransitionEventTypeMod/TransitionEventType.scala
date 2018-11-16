package typings
package atUirouterCoreLib.libTransitionTransitionEventTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/transition/transitionEventType", "TransitionEventType")
@js.native
class TransitionEventType protected () extends js.Object {
  def this(name: java.lang.String, hookPhase: atUirouterCoreLib.libTransitionInterfaceMod.TransitionHookPhase, hookOrder: scala.Double, criteriaMatchPath: atUirouterCoreLib.libTransitionInterfaceMod.PathType) = this()
  def this(name: java.lang.String, hookPhase: atUirouterCoreLib.libTransitionInterfaceMod.TransitionHookPhase, hookOrder: scala.Double, criteriaMatchPath: atUirouterCoreLib.libTransitionInterfaceMod.PathType, reverseSort: scala.Boolean) = this()
  def this(name: java.lang.String, hookPhase: atUirouterCoreLib.libTransitionInterfaceMod.TransitionHookPhase, hookOrder: scala.Double, criteriaMatchPath: atUirouterCoreLib.libTransitionInterfaceMod.PathType, reverseSort: scala.Boolean, getResultHandler: atUirouterCoreLib.libTransitionTransitionHookMod.GetResultHandler) = this()
  def this(name: java.lang.String, hookPhase: atUirouterCoreLib.libTransitionInterfaceMod.TransitionHookPhase, hookOrder: scala.Double, criteriaMatchPath: atUirouterCoreLib.libTransitionInterfaceMod.PathType, reverseSort: scala.Boolean, getResultHandler: atUirouterCoreLib.libTransitionTransitionHookMod.GetResultHandler, getErrorHandler: atUirouterCoreLib.libTransitionTransitionHookMod.GetErrorHandler) = this()
  def this(name: java.lang.String, hookPhase: atUirouterCoreLib.libTransitionInterfaceMod.TransitionHookPhase, hookOrder: scala.Double, criteriaMatchPath: atUirouterCoreLib.libTransitionInterfaceMod.PathType, reverseSort: scala.Boolean, getResultHandler: atUirouterCoreLib.libTransitionTransitionHookMod.GetResultHandler, getErrorHandler: atUirouterCoreLib.libTransitionTransitionHookMod.GetErrorHandler, synchronous: scala.Boolean) = this()
  var criteriaMatchPath: atUirouterCoreLib.libTransitionInterfaceMod.PathType = js.native
  @JSName("getErrorHandler")
  var getErrorHandler_Original: atUirouterCoreLib.libTransitionTransitionHookMod.GetErrorHandler = js.native
  @JSName("getResultHandler")
  var getResultHandler_Original: atUirouterCoreLib.libTransitionTransitionHookMod.GetResultHandler = js.native
  var hookOrder: scala.Double = js.native
  var hookPhase: atUirouterCoreLib.libTransitionInterfaceMod.TransitionHookPhase = js.native
  var name: java.lang.String = js.native
  var reverseSort: scala.Boolean = js.native
  var synchronous: scala.Boolean = js.native
  def getErrorHandler(hook: atUirouterCoreLib.libTransitionTransitionHookMod.TransitionHook): atUirouterCoreLib.libTransitionTransitionHookMod.ErrorHandler = js.native
  def getResultHandler(hook: atUirouterCoreLib.libTransitionTransitionHookMod.TransitionHook): atUirouterCoreLib.libTransitionTransitionHookMod.ResultHandler = js.native
}

