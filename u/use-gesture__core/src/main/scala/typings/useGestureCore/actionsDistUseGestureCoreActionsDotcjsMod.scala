package typings.useGestureCore

import org.scalablytyped.runtime.Shortcut
import typings.std.Map
import typings.useGestureCore.distDeclarationsSrcConfigResolverMod.ResolverMap
import typings.useGestureCore.distDeclarationsSrcControllerMod.Controller
import typings.useGestureCore.distDeclarationsSrcEnginesEngineMod.Engine
import typings.useGestureCore.distDeclarationsSrcTypesActionMod.Action
import typings.useGestureCore.distDeclarationsSrcTypesActionMod.EngineClass
import typings.useGestureCore.distDeclarationsSrcTypesConfigMod.GestureKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionsDistUseGestureCoreActionsDotcjsMod {
  
  @JSImport("@use-gesture/core/actions/dist/use-gesture-core-actions.cjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@use-gesture/core/actions/dist/use-gesture-core-actions.cjs", "ConfigResolverMap")
  @js.native
  val ConfigResolverMap: Map[GestureKey, ResolverMap] = js.native
  
  @JSImport("@use-gesture/core/actions/dist/use-gesture-core-actions.cjs", "EngineMap")
  @js.native
  val EngineMap: Map[GestureKey, EngineClass[Any]] = js.native
  
  object dragAction extends Shortcut {
    
    @JSImport("@use-gesture/core/actions/dist/use-gesture-core-actions.cjs", "dragAction")
    @js.native
    val ^ : Action = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@use-gesture/core/actions/dist/use-gesture-core-actions.cjs", "dragAction.engine")
    @js.native
    open class engine protected () extends Engine[GestureKey] {
      def this(controller: Controller, args: js.Array[Any], key: GestureKey) = this()
    }
    
    type _To = Action
    
    /* This means you don't have to write `^`, but can instead just say `dragAction.foo` */
    override def _to: Action = ^
  }
  
  object hoverAction extends Shortcut {
    
    @JSImport("@use-gesture/core/actions/dist/use-gesture-core-actions.cjs", "hoverAction")
    @js.native
    val ^ : Action = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@use-gesture/core/actions/dist/use-gesture-core-actions.cjs", "hoverAction.engine")
    @js.native
    open class engine protected () extends Engine[GestureKey] {
      def this(controller: Controller, args: js.Array[Any], key: GestureKey) = this()
    }
    
    type _To = Action
    
    /* This means you don't have to write `^`, but can instead just say `hoverAction.foo` */
    override def _to: Action = ^
  }
  
  object moveAction extends Shortcut {
    
    @JSImport("@use-gesture/core/actions/dist/use-gesture-core-actions.cjs", "moveAction")
    @js.native
    val ^ : Action = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@use-gesture/core/actions/dist/use-gesture-core-actions.cjs", "moveAction.engine")
    @js.native
    open class engine protected () extends Engine[GestureKey] {
      def this(controller: Controller, args: js.Array[Any], key: GestureKey) = this()
    }
    
    type _To = Action
    
    /* This means you don't have to write `^`, but can instead just say `moveAction.foo` */
    override def _to: Action = ^
  }
  
  object pinchAction extends Shortcut {
    
    @JSImport("@use-gesture/core/actions/dist/use-gesture-core-actions.cjs", "pinchAction")
    @js.native
    val ^ : Action = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@use-gesture/core/actions/dist/use-gesture-core-actions.cjs", "pinchAction.engine")
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
    
    @JSImport("@use-gesture/core/actions/dist/use-gesture-core-actions.cjs", "scrollAction")
    @js.native
    val ^ : Action = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@use-gesture/core/actions/dist/use-gesture-core-actions.cjs", "scrollAction.engine")
    @js.native
    open class engine protected () extends Engine[GestureKey] {
      def this(controller: Controller, args: js.Array[Any], key: GestureKey) = this()
    }
    
    type _To = Action
    
    /* This means you don't have to write `^`, but can instead just say `scrollAction.foo` */
    override def _to: Action = ^
  }
  
  object wheelAction extends Shortcut {
    
    @JSImport("@use-gesture/core/actions/dist/use-gesture-core-actions.cjs", "wheelAction")
    @js.native
    val ^ : Action = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@use-gesture/core/actions/dist/use-gesture-core-actions.cjs", "wheelAction.engine")
    @js.native
    open class engine protected () extends Engine[GestureKey] {
      def this(controller: Controller, args: js.Array[Any], key: GestureKey) = this()
    }
    
    type _To = Action
    
    /* This means you don't have to write `^`, but can instead just say `wheelAction.foo` */
    override def _to: Action = ^
  }
}
