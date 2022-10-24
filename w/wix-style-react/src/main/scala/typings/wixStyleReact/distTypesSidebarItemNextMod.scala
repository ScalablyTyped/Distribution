package typings.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.FC
import typings.std.HTMLAnchorElement
import typings.std.HTMLButtonElement
import typings.wixStyleReact.anon.As
import typings.wixStyleReact.anon.DictadditionalProps
import typings.wixStyleReact.anon.DictadditionalPropsAs
import typings.wixStyleReact.anon.ItemKey
import typings.wixStyleReact.anon.OnClick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSidebarItemNextMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/types/SidebarItemNext", JSImport.Default)
  @js.native
  val default: FC[SidebarItemNextProps] = js.native
  
  type SidebarItemNextAsAnchorProps[T] = AnchorHTMLAttributes[HTMLAnchorElement] & T & As
  
  type SidebarItemNextAsButtonProps[T] = ButtonHTMLAttributes[HTMLButtonElement] & T & OnClick
  
  type SidebarItemNextAsComponentProps[T] = T & DictadditionalProps
  
  type SidebarItemNextGenericProps[T] = T & DictadditionalPropsAs
  
  type SidebarItemNextProps = SidebarItemNextWithAsProp[ItemKey]
  
  type SidebarItemNextWithAsProp[T] = SidebarItemNextAsButtonProps[T] | SidebarItemNextAsAnchorProps[T] | SidebarItemNextGenericProps[T] | SidebarItemNextAsComponentProps[T]
  
  type _To = FC[SidebarItemNextProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesSidebarItemNextMod.foo` */
  override def _to: FC[SidebarItemNextProps] = default
}
