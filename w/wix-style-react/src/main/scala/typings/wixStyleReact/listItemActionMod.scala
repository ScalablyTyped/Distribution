package typings.wixStyleReact

import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.PureComponent
import typings.std.HTMLAnchorElement
import typings.std.HTMLButtonElement
import typings.std.Partial
import typings.wixStyleReact.anon.As
import typings.wixStyleReact.anon.AutoFocus
import typings.wixStyleReact.anon.DictadditionalProps
import typings.wixStyleReact.anon.DictadditionalPropsAs
import typings.wixStyleReact.anon.Ellipsis
import typings.wixStyleReact.anon.OnClick
import typings.wixStyleReact.anon.OverrideOptionStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemActionMod {
  
  @JSImport("wix-style-react/dist/es/src/ListItemAction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-style-react/dist/es/src/ListItemAction", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[ListItemActionProps, js.Object, js.Any]
  
  inline def listItemActionBuilder[T /* <: Partial[ListItemActionProps] */](data: Ellipsis): OverrideOptionStyle[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("listItemActionBuilder")(data.asInstanceOf[js.Any]).asInstanceOf[OverrideOptionStyle[T]]
  
  type ListItemAction = PureComponent[ListItemActionProps, js.Object, js.Any]
  
  type ListItemActionAsAnchorProps[T] = AnchorHTMLAttributes[HTMLAnchorElement] & T & OnClick
  
  type ListItemActionAsButtonProps[T] = ButtonHTMLAttributes[HTMLButtonElement] & T & As
  
  type ListItemActionAsComponentProps[T] = T & DictadditionalPropsAs
  
  type ListItemActionGenericProps[T] = T & DictadditionalProps
  
  type ListItemActionProps = ListItemActionWithAsProp[AutoFocus]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.small
    - typings.wixStyleReact.wixStyleReactStrings.medium
  */
  trait ListItemActionSize extends StObject
  object ListItemActionSize {
    
    inline def medium: typings.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.medium]
    
    inline def small: typings.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.small]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.standard
    - typings.wixStyleReact.wixStyleReactStrings.dark
    - typings.wixStyleReact.wixStyleReactStrings.destructive
  */
  trait ListItemActionSkin extends StObject
  object ListItemActionSkin {
    
    inline def dark: typings.wixStyleReact.wixStyleReactStrings.dark = "dark".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.dark]
    
    inline def destructive: typings.wixStyleReact.wixStyleReactStrings.destructive = "destructive".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.destructive]
    
    inline def standard: typings.wixStyleReact.wixStyleReactStrings.standard = "standard".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.standard]
  }
  
  type ListItemActionWithAsProp[T] = ListItemActionAsButtonProps[T] | ListItemActionAsAnchorProps[T] | ListItemActionGenericProps[T] | ListItemActionAsComponentProps[T]
}
