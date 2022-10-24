package typings.wixStyleReact

import typings.react.mod.ImgHTMLAttributes
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.std.HTMLImageElement
import typings.wixStyleReact.wixStyleReactStrings.A1
import typings.wixStyleReact.wixStyleReactStrings.A2
import typings.wixStyleReact.wixStyleReactStrings.A3
import typings.wixStyleReact.wixStyleReactStrings.A4
import typings.wixStyleReact.wixStyleReactStrings.A5
import typings.wixStyleReact.wixStyleReactStrings.A6
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAvatarGroupMod {
  
  @JSImport("wix-style-react/dist/types/AvatarGroup", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[AvatarGroupProps, js.Object, Any]
  
  type AvatarGroup = PureComponent[AvatarGroupProps, js.Object, Any]
  
  trait AvatarGroupProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var items: js.Array[AvatarItemProps]
    
    var maxItems: js.UndefOr[Double] = js.undefined
    
    var showDivider: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[AvatarGroupSize] = js.undefined
    
    var `type`: js.UndefOr[GroupType] = js.undefined
  }
  object AvatarGroupProps {
    
    inline def apply(items: js.Array[AvatarItemProps]): AvatarGroupProps = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvatarGroupProps]
    }
    
    extension [Self <: AvatarGroupProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setItems(value: js.Array[AvatarItemProps]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: AvatarItemProps*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setMaxItems(value: Double): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
      
      inline def setMaxItemsUndefined: Self = StObject.set(x, "maxItems", js.undefined)
      
      inline def setShowDivider(value: Boolean): Self = StObject.set(x, "showDivider", value.asInstanceOf[js.Any])
      
      inline def setShowDividerUndefined: Self = StObject.set(x, "showDivider", js.undefined)
      
      inline def setSize(value: AvatarGroupSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setType(value: GroupType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.medium
    - typings.wixStyleReact.wixStyleReactStrings.small
  */
  trait AvatarGroupSize extends StObject
  object AvatarGroupSize {
    
    inline def medium: typings.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.medium]
    
    inline def small: typings.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.small]
  }
  
  trait AvatarItemProps extends StObject {
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[A1 | A2 | A3 | A4 | A5 | A6] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var imgProps: js.UndefOr[ImgHTMLAttributes[HTMLImageElement]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var placeholder: js.UndefOr[ReactNode] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object AvatarItemProps {
    
    inline def apply(): AvatarItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvatarItemProps]
    }
    
    extension [Self <: AvatarItemProps](x: Self) {
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setColor(value: A1 | A2 | A3 | A4 | A5 | A6): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setImgProps(value: ImgHTMLAttributes[HTMLImageElement]): Self = StObject.set(x, "imgProps", value.asInstanceOf[js.Any])
      
      inline def setImgPropsUndefined: Self = StObject.set(x, "imgProps", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setPlaceholder(value: ReactNode): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.stretched
    - typings.wixStyleReact.wixStyleReactStrings.condensed
  */
  trait GroupType extends StObject
  object GroupType {
    
    inline def condensed: typings.wixStyleReact.wixStyleReactStrings.condensed = "condensed".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.condensed]
    
    inline def stretched: typings.wixStyleReact.wixStyleReactStrings.stretched = "stretched".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.stretched]
  }
}
