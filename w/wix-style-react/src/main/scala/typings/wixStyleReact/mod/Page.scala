package typings.wixStyleReact.mod

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.FC
import typings.wixStyleReact.distTypesPageMod.ContentProps
import typings.wixStyleReact.distTypesPageMod.FixedContentProps
import typings.wixStyleReact.distTypesPageMod.FixedFooterProps
import typings.wixStyleReact.distTypesPageMod.StickyProps
import typings.wixStyleReact.distTypesPageMod.TailProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-style-react", "Page")
@js.native
open class Page ()
  extends typings.wixStyleReact.distTypesPageMod.default
/* static members */
object Page {
  
  @JSImport("wix-style-react", "Page")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-style-react", "Page.Content")
  @js.native
  def Content: FC[ContentProps] = js.native
  inline def Content_=(x: FC[ContentProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Page.FixedContent")
  @js.native
  def FixedContent: FC[FixedContentProps] = js.native
  inline def FixedContent_=(x: FC[FixedContentProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FixedContent")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Page.FixedFooter")
  @js.native
  def FixedFooter: FC[FixedFooterProps] = js.native
  inline def FixedFooter_=(x: FC[FixedFooterProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FixedFooter")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Page.Header")
  @js.native
  def Header: Instantiable0[typings.wixStyleReact.distTypesPageHeaderMod.default] = js.native
  inline def Header_=(x: Instantiable0[typings.wixStyleReact.distTypesPageHeaderMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Page.Sticky")
  @js.native
  def Sticky: FC[StickyProps] = js.native
  inline def Sticky_=(x: FC[StickyProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Sticky")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Page.Tail")
  @js.native
  def Tail: FC[TailProps] = js.native
  inline def Tail_=(x: FC[TailProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tail")(x.asInstanceOf[js.Any])
}
