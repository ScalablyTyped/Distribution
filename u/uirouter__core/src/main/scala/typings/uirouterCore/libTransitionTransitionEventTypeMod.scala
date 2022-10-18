package typings.uirouterCore

import typings.uirouterCore.libTransitionInterfaceMod.PathType
import typings.uirouterCore.libTransitionInterfaceMod.TransitionHookPhase
import typings.uirouterCore.libTransitionTransitionHookMod.ErrorHandler
import typings.uirouterCore.libTransitionTransitionHookMod.GetErrorHandler
import typings.uirouterCore.libTransitionTransitionHookMod.GetResultHandler
import typings.uirouterCore.libTransitionTransitionHookMod.ResultHandler
import typings.uirouterCore.libTransitionTransitionHookMod.TransitionHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTransitionTransitionEventTypeMod {
  
  @JSImport("@uirouter/core/lib/transition/transitionEventType", "TransitionEventType")
  @js.native
  open class TransitionEventType protected () extends StObject {
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
      reverseSort: Unit,
      getResultHandler: GetResultHandler
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: Unit,
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
      reverseSort: Unit,
      getResultHandler: Unit,
      getErrorHandler: GetErrorHandler
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Unit,
      getResultHandler: GetResultHandler,
      getErrorHandler: GetErrorHandler
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: Unit,
      getErrorHandler: Unit,
      synchronous: Boolean
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: Unit,
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
      getErrorHandler: Unit,
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
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Unit,
      getResultHandler: Unit,
      getErrorHandler: Unit,
      synchronous: Boolean
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Unit,
      getResultHandler: Unit,
      getErrorHandler: GetErrorHandler,
      synchronous: Boolean
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Unit,
      getResultHandler: GetResultHandler,
      getErrorHandler: Unit,
      synchronous: Boolean
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Unit,
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
