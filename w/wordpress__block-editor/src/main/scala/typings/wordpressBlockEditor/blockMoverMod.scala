package typings.wordpressBlockEditor

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressBlockEditor.blockMoverMod.BlockMover.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockMoverMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/block-editor/components/block-mover", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object BlockMover {
    
    @js.native
    trait Props extends StObject {
      
      var blockElementId: js.UndefOr[String] = js.native
      
      var children: js.UndefOr[scala.Nothing] = js.native
      
      var clientIds: js.Array[String] = js.native
      
      var instanceId: js.UndefOr[String] = js.native
      
      var isDraggable: js.UndefOr[Boolean] = js.native
      
      var isHidden: js.UndefOr[Boolean] = js.native
      
      var onDragEnd: js.UndefOr[js.Function0[Unit]] = js.native
      
      var onDragStart: js.UndefOr[js.Function0[Unit]] = js.native
    }
    object Props {
      
      @scala.inline
      def apply(clientIds: js.Array[String]): Props = {
        val __obj = js.Dynamic.literal(clientIds = clientIds.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBlockElementId(value: String): Self = StObject.set(x, "blockElementId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBlockElementIdUndefined: Self = StObject.set(x, "blockElementId", js.undefined)
        
        @scala.inline
        def setClientIds(value: js.Array[String]): Self = StObject.set(x, "clientIds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClientIdsVarargs(value: String*): Self = StObject.set(x, "clientIds", js.Array(value :_*))
        
        @scala.inline
        def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
        
        @scala.inline
        def setIsDraggable(value: Boolean): Self = StObject.set(x, "isDraggable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsDraggableUndefined: Self = StObject.set(x, "isDraggable", js.undefined)
        
        @scala.inline
        def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsHiddenUndefined: Self = StObject.set(x, "isHidden", js.undefined)
        
        @scala.inline
        def setOnDragEnd(value: () => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
        
        @scala.inline
        def setOnDragStart(value: () => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      }
    }
  }
}
