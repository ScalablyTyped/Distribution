package typings.useGestureCore

import org.scalablytyped.runtime.Shortcut
import typings.std.Map
import typings.useGestureCore.actionMod.Action
import typings.useGestureCore.actionMod.EngineClass
import typings.useGestureCore.configMod.GestureKey
import typings.useGestureCore.controllerMod.Controller
import typings.useGestureCore.engineMod.Engine
import typings.useGestureCore.resolverMod.ResolverMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionsMod {
  
  @JSImport("@use-gesture/core/dist/declarations/src/actions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@use-gesture/core/dist/declarations/src/actions", "ConfigResolverMap")
  @js.native
  val ConfigResolverMap: Map[GestureKey, ResolverMap] = js.native
  
  @JSImport("@use-gesture/core/dist/declarations/src/actions", "EngineMap")
  @js.native
  val EngineMap: Map[GestureKey, EngineClass[Any]] = js.native
  
  object dragAction extends Shortcut {
    
    @JSImport("@use-gesture/core/dist/declarations/src/actions", "dragAction")
    @js.native
    val ^ : Action = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@use-gesture/core/dist/declarations/src/actions", "dragAction.engine")
    @js.native
    open class engine protected () extends Engine[GestureKey] {
      def this(controller: Controller, args: js.Array[Any], key: GestureKey) = this()
    }
    
    type _To = Action
    
    /* This means you don't have to write `^`, but can instead just say `dragAction.foo` */
    override def _to: Action = ^
  }
  
  object hoverAction extends Shortcut {
    
    @JSImport("@use-gesture/core/dist/declarations/src/actions", "hoverAction")
    @js.native
    val ^ : Action = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@use-gesture/core/dist/declarations/src/actions", "hoverAction.engine")
    @js.native
    open class engine protected () extends Engine[GestureKey] {
      def this(controller: Controller, args: js.Array[Any], key: GestureKey) = this()
    }
    
    type _To = Action
    
    /* This means you don't have to write `^`, but can instead just say `hoverAction.foo` */
    override def _to: Action = ^
  }
  
  object moveAction extends Shortcut {
    
    @JSImport("@use-gesture/core/dist/declarations/src/actions", "moveAction")
    @js.native
    val ^ : Action = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@use-gesture/core/dist/declarations/src/actions", "moveAction.engine")
    @js.native
    open class engine protected () extends Engine[GestureKey] {
      def this(controller: Controller, args: js.Array[Any], key: GestureKey) = this()
    }
    
    type _To = Action
    
    /* This means you don't have to write `^`, but can instead just say `moveAction.foo` */
    override def _to: Action = ^
  }
  
  object pinchAction extends Shortcut {
    
    @JSImport("@use-gesture/core/dist/declarations/src/actions", "pinchAction")
    @js.native
    val ^ : Action = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@use-gesture/core/dist/declarations/src/actions", "pinchAction.engine")
    @js.native
    open class engine protected () extends Engine[GestureKey] {
      def this(controller: Controller, args: js.Array[Any], key: GestureKey) = this()
    }
    
    type _To = Action
    
    /* This means you don't have to write `^`, but can instead just say `pinchAction.foo` */
    override def _to: Action = ^
  }
  
  inline def registerAction(action: Action): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerAction")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  object scrollAction extends Shortcut {
    
    @JSImport("@use-gesture/core/dist/declarations/src/actions", "scrollAction")
    @js.native
    val ^ : Action = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@use-gesture/core/dist/declarations/src/actions", "scrollAction.engine")
    @js.native
    open class engine protected () extends Engine[GestureKey] {
      def this(controller: Controller, args: js.Array[Any], key: GestureKey) = this()
    }
    
    type _To = Action
    
    /* This means you don't have to write `^`, but can instead just say `scrollAction.foo` */
    override def _to: Action = ^
  }
  
  object wheelAction extends Shortcut {
    
    @JSImport("@use-gesture/core/dist/declarations/src/actions", "wheelAction")
    @js.native
    val ^ : Action = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@use-gesture/core/dist/declarations/src/actions", "wheelAction.engine")
    @js.native
    open class engine protected () extends Engine[GestureKey] {
      def this(controller: Controller, args: js.Array[Any], key: GestureKey) = this()
    }
    
    type _To = Action
    
    /* This means you don't have to write `^`, but can instead just say `wheelAction.foo` */
    override def _to: Action = ^
  }
}
