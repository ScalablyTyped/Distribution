package typings.uirouterCore

import typings.uirouterCore.transitionHookMod.ErrorHandler
import typings.uirouterCore.transitionHookMod.GetErrorHandler
import typings.uirouterCore.transitionHookMod.GetResultHandler
import typings.uirouterCore.transitionHookMod.ResultHandler
import typings.uirouterCore.transitionHookMod.TransitionHook
import typings.uirouterCore.transitionInterfaceMod.PathType
import typings.uirouterCore.transitionInterfaceMod.TransitionHookPhase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transitionEventTypeMod {
  
  @JSImport("@uirouter/core/lib/transition/transitionEventType", "TransitionEventType")
  @js.native
  class TransitionEventType protected () extends StObject {
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
      reverseSort: js.UndefOr[scala.Nothing],
      getResultHandler: GetResultHandler
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
      reverseSort: js.UndefOr[scala.Nothing],
      getResultHandler: js.UndefOr[scala.Nothing],
      getErrorHandler: GetErrorHandler
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: js.UndefOr[scala.Nothing],
      getResultHandler: GetResultHandler,
      getErrorHandler: GetErrorHandler
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: js.UndefOr[scala.Nothing],
      getErrorHandler: GetErrorHandler
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
      reverseSort: js.UndefOr[scala.Nothing],
      getResultHandler: js.UndefOr[scala.Nothing],
      getErrorHandler: js.UndefOr[scala.Nothing],
      synchronous: Boolean
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: js.UndefOr[scala.Nothing],
      getResultHandler: js.UndefOr[scala.Nothing],
      getErrorHandler: GetErrorHandler,
      synchronous: Boolean
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: js.UndefOr[scala.Nothing],
      getResultHandler: GetResultHandler,
      getErrorHandler: js.UndefOr[scala.Nothing],
      synchronous: Boolean
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: js.UndefOr[scala.Nothing],
      getResultHandler: GetResultHandler,
      getErrorHandler: GetErrorHandler,
      synchronous: Boolean
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: js.UndefOr[scala.Nothing],
      getErrorHandler: js.UndefOr[scala.Nothing],
      synchronous: Boolean
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: js.UndefOr[scala.Nothing],
      getErrorHandler: GetErrorHandler,
      synchronous: Boolean
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: GetResultHandler,
      getErrorHandler: js.UndefOr[scala.Nothing],
      synchronous: Boolean
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
    
    def getErrorHandler(hook: TransitionHook): ErrorHandler = js.native
    @JSName("getErrorHandler")
    var getErrorHandler_Original: GetErrorHandler = js.native
    
    def getResultHandler(hook: TransitionHook): ResultHandler = js.native
    @JSName("getResultHandler")
    var getResultHandler_Original: GetResultHandler = js.native
    
    var hookOrder: Double = js.native
    
    var hookPhase: TransitionHookPhase = js.native
    
    var name: String = js.native
    
    var reverseSort: Boolean = js.native
    
    var synchronous: Boolean = js.native
  }
}
