package typings.useGestureCore

import typings.std.AddEventListenerOptions
import typings.std.NonNullable
import typings.std.UIEvent
import typings.useGestureCore.distDeclarationsSrcControllerMod.Controller
import typings.useGestureCore.distDeclarationsSrcTypesConfigMod.GestureKey
import typings.useGestureCore.distDeclarationsSrcTypesInternalConfigMod.InternalGenericOptions
import typings.useGestureCore.distDeclarationsSrcTypesStateMod.IngKey
import typings.useGestureCore.distDeclarationsSrcTypesStateMod.SharedGestureState
import typings.useGestureCore.distDeclarationsSrcTypesUtilsMod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcEnginesEngineMod {
  
  /* note: abstract class */ @JSImport("@use-gesture/core/dist/declarations/src/engines/Engine", "Engine")
  @js.native
  open class Engine[Key /* <: GestureKey */] protected () extends StObject {
    def this(ctrl: Controller, args: js.Array[Any], key: Key) = this()
    
    /**
      * The arguments passed to the `bind` function.
      */
    /**
      * State prop that aliases state values (`xy` or `da`).
      */
    val aliasKey: String = js.native
    
    var args: js.Array[Any] = js.native
    
    /**
      * Function used by some gestures to determine the intentionality of a
      * a movement depending on thresholds. The intent function can change the
      * `state._active` or `state._blocked` flags if the gesture isn't intentional.
      * @param event
      */
    var axisIntent: js.UndefOr[js.Function1[/* event */ js.UndefOr[UIEvent], Unit]] = js.native
    
    /**
      * Executes the bind function so that listeners are properly set by the
      * Controller.
      * @param bindFunction
      */
    def bind(
      bindFunction: js.Function4[
          /* device */ String, 
          /* action */ String, 
          /* handler */ js.Function1[/* event */ Any, Unit], 
          /* options */ js.UndefOr[AddEventListenerOptions], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Cleans the gesture timeouts and event listeners.
      */
    def clean(): Unit = js.native
    
    /**
      * Computes all sorts of state attributes, including kinematics.
      * @param event
      */
    def compute(): Unit = js.native
    
    /**
      * Assign `state._values` to `state._initial` and transformed `state.values` to
      * `state.initial`.
      * @param values
      */
    def computeInitial(): Unit = js.native
    
    /**
      * Function implemented by the gestures that compute the movement from the
      * corrected offset (after bounds and potential rubberbanding).
      */
    def computeMovement(): Unit = js.native
    
    /**
      * Function implemented by gestures that compute the offset from the state
      * movement.
      */
    def computeOffset(): Unit = js.native
    
    /**
      * Assign raw values to `state._values` and transformed values to
      * `state.values`.
      * @param values
      */
    def computeValues(values: Vector2): Unit = js.native
    
    @JSName("compute")
    def compute_event(
      event: /* import warning: importer.ImportType#apply Failed type conversion: @use-gesture/core.@use-gesture/core/dist/declarations/src/types/utils.NonUndefined<@use-gesture/core.@use-gesture/core/dist/declarations/src/types/state.State[Key]>['event'] */ js.Any
    ): Unit = js.native
    
    /**
      * Shortcut to the gesture config read from the Controller.
      */
    def config: NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: @use-gesture/core.@use-gesture/core/dist/declarations/src/types/internalConfig.InternalConfig[Key] */ js.Any
      ] = js.native
    
    /**
      * The Controller handling state.
      */
    var ctrl: Controller = js.native
    
    /**
      * Fires the gesture handler.
      */
    def emit(): Unit = js.native
    
    /**
      * Shortcut to the gesture event store read from the Controller.
      */
    def eventStore: NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: @use-gesture/core.anon.Drag[Key] */ js.Any
      ] = js.native
    
    /**
      * Shortcut to the gesture handler read from the Controller.
      */
    def handler: NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: @use-gesture/core.@use-gesture/core/dist/declarations/src/types/handlers.InternalHandlers[Key] */ js.Any
      ] = js.native
    
    /**
      * The key representing the active state of the gesture in the shared state.
      * ('dragging' | 'pinching' | 'wheeling' | 'scrolling' | 'moving' | 'hovering')
      */
    val ingKey: IngKey = js.native
    
    /**
      * Function that some gestures can use to add initilization
      * properties to the state when it is created.
      */
    var init: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * The gesture key ('drag' | 'pinch' | 'wheel' | 'scroll' | 'move' | 'hover')
      */
    val key: Key = js.native
    
    def reset(): Unit = js.native
    
    var restrictToAxis: js.UndefOr[js.Function1[/* movement */ Vector2, Unit]] = js.native
    
    /**
      * Setup function that some gestures can use to set additional properties of
      * the state when the gesture starts.
      */
    var setup: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Shortcut to the shared state read from the Controller
      */
    def shared: SharedGestureState = js.native
    
    /**
      * Shortcut to the shared config read from the Controller.
      */
    def sharedConfig: InternalGenericOptions = js.native
    
    /**
      * Function ran at the start of the gesture.
      * @param event
      */
    @JSName("start")
    def start_event(
      event: /* import warning: importer.ImportType#apply Failed type conversion: @use-gesture/core.@use-gesture/core/dist/declarations/src/types/utils.NonUndefined<@use-gesture/core.@use-gesture/core/dist/declarations/src/types/state.State[Key]>['event'] */ js.Any
    ): Unit = js.native
    
    /**
      * Shortcut to the gesture state read from the Controller.
      */
    def state: NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: @use-gesture/core.@use-gesture/core/dist/declarations/src/types/state.State[Key] */ js.Any
      ] = js.native
    def state_=(
      state: NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: @use-gesture/core.@use-gesture/core/dist/declarations/src/types/state.State[Key] */ js.Any
        ]
    ): Unit = js.native
    
    /**
      * Shortcut to the gesture timeout store read from the Controller.
      */
    def timeoutStore: NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: @use-gesture/core.anon.Hover[Key] */ js.Any
      ] = js.native
  }
}
