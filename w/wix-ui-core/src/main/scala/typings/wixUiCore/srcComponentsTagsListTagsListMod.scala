package typings.wixUiCore

import typings.react.mod.FormEvent
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsTagsListTagsListMod {
  
  @JSImport("wix-ui-core/src/components/tags-list/TagsList", "TagsList")
  @js.native
  val TagsList: FunctionComponent[TagsListProps] = js.native
  
  trait TagsListProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /** hook for testing purposes */
    var `data-hook`: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* e */ FormEvent[HTMLDivElement], Unit]] = js.undefined
  }
  object TagsListProps {
    
    @scala.inline
    def apply(): TagsListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagsListProps]
    }
    
    @scala.inline
    implicit class TagsListPropsMutableBuilder[Self <: TagsListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* e */ FormEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    }
  }
}
