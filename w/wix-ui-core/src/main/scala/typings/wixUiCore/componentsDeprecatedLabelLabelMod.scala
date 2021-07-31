package typings.wixUiCore

import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsDeprecatedLabelLabelMod {
  
  @JSImport("wix-ui-core/src/components/deprecated/label/Label", "Label")
  @js.native
  val Label: FunctionComponent[LabelProps] = js.native
  
  trait LabelProps extends StObject {
    
    /** Children */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /** hook for testing purposes */
    var `data-hook`: js.UndefOr[String] = js.undefined
    
    /** Is the Label disabled */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** should the text be ellipsed or not */
    var ellipsis: js.UndefOr[Boolean] = js.undefined
    
    /** For property */
    var `for`: js.UndefOr[String] = js.undefined
    
    /** ID of element */
    var id: js.UndefOr[String] = js.undefined
  }
  object LabelProps {
    
    @scala.inline
    def apply(): LabelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelProps]
    }
    
    @scala.inline
    implicit class LabelPropsMutableBuilder[Self <: LabelProps] (val x: Self) extends AnyVal {
      
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
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setEllipsis(value: Boolean): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      @scala.inline
      def setFor(value: String): Self = StObject.set(x, "for", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForUndefined: Self = StObject.set(x, "for", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
}
