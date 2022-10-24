package typings.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.FC
import typings.std.HTMLAnchorElement
import typings.std.HTMLButtonElement
import typings.wixStyleReact.anon.As
import typings.wixStyleReact.anon.DataHookDisabled
import typings.wixStyleReact.anon.DictadditionalProps
import typings.wixStyleReact.anon.DictadditionalPropsAs
import typings.wixStyleReact.anon.OnClick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSidebarSubMenuNextMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/types/SidebarSubMenuNext", JSImport.Default)
  @js.native
  val default: FC[SidebarSubMenuNextProps] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.click
    - typings.wixStyleReact.wixStyleReactStrings.select
  */
  trait ExpandCollapseTrigger extends StObject
  object ExpandCollapseTrigger {
    
    inline def click: typings.wixStyleReact.wixStyleReactStrings.click = "click".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.click]
    
    inline def select: typings.wixStyleReact.wixStyleReactStrings.select = "select".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.select]
  }
  
  type SidebarSubMenuAsAnchorProps[T] = AnchorHTMLAttributes[HTMLAnchorElement] & T & As
  
  type SidebarSubMenuAsButtonProps[T] = ButtonHTMLAttributes[HTMLButtonElement] & T & OnClick
  
  type SidebarSubMenuAsComponentProps[T] = T & DictadditionalProps
  
  type SidebarSubMenuGenericProps[T] = T & DictadditionalPropsAs
  
  type SidebarSubMenuNextProps = SidebarSubMenuWithAsProp[DataHookDisabled]
  
  type SidebarSubMenuWithAsProp[T] = SidebarSubMenuAsButtonProps[T] | SidebarSubMenuAsAnchorProps[T] | SidebarSubMenuGenericProps[T] | SidebarSubMenuAsComponentProps[T]
  
  type _To = FC[SidebarSubMenuNextProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesSidebarSubMenuNextMod.foo` */
  override def _to: FC[SidebarSubMenuNextProps] = default
}
