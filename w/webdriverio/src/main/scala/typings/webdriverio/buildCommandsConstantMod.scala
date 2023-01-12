package typings.webdriverio

import typings.std.Element
import typings.webdriverio.buildTypesMod.ActionTypes
import typings.webdriverio.buildTypesMod.TouchActions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsConstantMod {
  
  @JSImport("webdriverio/build/commands/constant", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatArgs(
    scope: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any,
    actions: js.Array[TouchActions]
  ): js.Array[FormattedActions] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatArgs")(scope.asInstanceOf[js.Any], actions.asInstanceOf[js.Any])).asInstanceOf[js.Array[FormattedActions]]
  inline def formatArgs(scope: Element, actions: js.Array[TouchActions]): js.Array[FormattedActions] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatArgs")(scope.asInstanceOf[js.Any], actions.asInstanceOf[js.Any])).asInstanceOf[js.Array[FormattedActions]]
  
  inline def touchAction(actions: TouchActions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("touchAction")(actions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def validateParameters(params: FormattedActions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateParameters")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait FormattedActions extends StObject {
    
    var action: String
    
    var options: js.UndefOr[FormattedTouchAction] = js.undefined
  }
  object FormattedActions {
    
    inline def apply(action: String): FormattedActions = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormattedActions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormattedActions] (val x: Self) extends AnyVal {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: FormattedTouchAction): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  /* Inlined parent std.Omit<webdriverio.webdriverio/build/types.TouchAction, 'element'> */
  trait FormattedTouchAction extends StObject {
    
    var action: ActionTypes
    
    var element: js.UndefOr[String] = js.undefined
    
    var ms: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object FormattedTouchAction {
    
    inline def apply(action: ActionTypes): FormattedTouchAction = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormattedTouchAction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormattedTouchAction] (val x: Self) extends AnyVal {
      
      inline def setAction(value: ActionTypes): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setMs(value: Double): Self = StObject.set(x, "ms", value.asInstanceOf[js.Any])
      
      inline def setMsUndefined: Self = StObject.set(x, "ms", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
