package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import typings.wordpressComponents.noticeMod.Notice.Props
import typings.wordpressNotices.mod.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noticeMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/notice", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object Notice {
    
    /* Rewritten from type alias, can be one of: 
      - typings.wordpressComponents.noticeMod.Notice.ButtonAction
      - typings.wordpressComponents.noticeMod.Notice.URLAction
    */
    trait Action extends StObject
    object Action {
      
      inline def ButtonAction(label: String, onClick: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): typings.wordpressComponents.noticeMod.Notice.ButtonAction = {
        val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
        __obj.asInstanceOf[typings.wordpressComponents.noticeMod.Notice.ButtonAction]
      }
      
      inline def URLAction(label: String, url: String): typings.wordpressComponents.noticeMod.Notice.URLAction = {
        val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.wordpressComponents.noticeMod.Notice.URLAction]
      }
    }
    
    trait BaseAction extends StObject {
      
      var className: js.UndefOr[String] = js.undefined
      
      var label: String
      
      /**
        * Should default classes be removed from the action?
        */
      var noDefaultClasses: js.UndefOr[Boolean] = js.undefined
    }
    object BaseAction {
      
      inline def apply(label: String): BaseAction = {
        val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
        __obj.asInstanceOf[BaseAction]
      }
      
      extension [Self <: BaseAction](x: Self) {
        
        inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setNoDefaultClasses(value: Boolean): Self = StObject.set(x, "noDefaultClasses", value.asInstanceOf[js.Any])
        
        inline def setNoDefaultClassesUndefined: Self = StObject.set(x, "noDefaultClasses", js.undefined)
      }
    }
    
    trait ButtonAction
      extends StObject
         with BaseAction
         with Action {
      
      var onClick: MouseEventHandler[HTMLButtonElement]
    }
    object ButtonAction {
      
      inline def apply(label: String, onClick: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): ButtonAction = {
        val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
        __obj.asInstanceOf[ButtonAction]
      }
      
      extension [Self <: ButtonAction](x: Self) {
        
        inline def setOnClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      }
    }
    
    trait Props extends StObject {
      
      /**
        * An array of action objects.
        */
      var actions: js.UndefOr[js.Array[Action]] = js.undefined
      
      /**
        * Content to render in the notice.
        */
      var children: ReactNode
      
      var className: js.UndefOr[String] = js.undefined
      
      /**
        * Whether the notice should be dismissible or not.
        * @defaultValue true
        */
      var isDismissible: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Function called when dismissing the notice.
        */
      var onRemove: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      var status: js.UndefOr[Status] = js.undefined
    }
    object Props {
      
      inline def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setActions(value: js.Array[Action]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
        
        inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
        
        inline def setActionsVarargs(value: Action*): Self = StObject.set(x, "actions", js.Array(value :_*))
        
        inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        inline def setIsDismissible(value: Boolean): Self = StObject.set(x, "isDismissible", value.asInstanceOf[js.Any])
        
        inline def setIsDismissibleUndefined: Self = StObject.set(x, "isDismissible", js.undefined)
        
        inline def setOnRemove(value: () => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction0(value))
        
        inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
        
        inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
    trait URLAction
      extends StObject
         with BaseAction
         with Action {
      
      var url: String
    }
    object URLAction {
      
      inline def apply(label: String, url: String): URLAction = {
        val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[URLAction]
      }
      
      extension [Self <: URLAction](x: Self) {
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
  }
}
