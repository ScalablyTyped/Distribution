package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.wordpressComponents.slotMod.Slot.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slotMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/slot-fill/slot", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object Slot {
    
    trait Props extends StObject {
      
      /**
        * Changes event bubbling behavior.
        *
        * If `false`, events will bubble to their parents on the DOM
        * hierarchy (native event bubbling).
        *
        * If `true`, events will bubble to their virtual parent in the React
        * elements hierarchy.
        *
        * @defaultValue false
        */
      var bubblesVirtually: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Optional render function which takes a reference to the slot's
        * `Fill`s as a param. It allows to perform additional processing and
        * wrap `fills` conditionally.
        */
      var children: js.UndefOr[js.Function1[/* fills */ js.Array[js.Array[Element]], Element | Null]] = js.undefined
      
      /**
        * Props to pass into the first child of the <Fill /> component.
        */
      var fillProps: js.UndefOr[StringDictionary[Any]] = js.undefined
      
      /**
        * Both `Slot` and `Fill` accept a `name` string prop, where a `Slot`
        * with a given `name` will render the `children` of any associated
        * `Fill`s.
        */
      var name: js.UndefOr[String] = js.undefined
    }
    object Props {
      
      inline def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setBubblesVirtually(value: Boolean): Self = StObject.set(x, "bubblesVirtually", value.asInstanceOf[js.Any])
        
        inline def setBubblesVirtuallyUndefined: Self = StObject.set(x, "bubblesVirtually", js.undefined)
        
        inline def setChildren(value: /* fills */ js.Array[js.Array[Element]] => Element | Null): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
        
        inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        inline def setFillProps(value: StringDictionary[Any]): Self = StObject.set(x, "fillProps", value.asInstanceOf[js.Any])
        
        inline def setFillPropsUndefined: Self = StObject.set(x, "fillProps", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
  }
}
