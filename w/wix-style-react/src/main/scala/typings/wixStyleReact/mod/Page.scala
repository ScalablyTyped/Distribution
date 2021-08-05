package typings.wixStyleReact.mod

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.SFC
import typings.wixStyleReact.pageMod.ContentProps
import typings.wixStyleReact.pageMod.FixedContentProps
import typings.wixStyleReact.pageMod.StickyProps
import typings.wixStyleReact.pageMod.TailProps
import typings.wixStyleReact.pageMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-style-react", "Page")
@js.native
class Page () extends default
/* static members */
object Page {
  
  @JSImport("wix-style-react", "Page")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-style-react", "Page.Content")
  @js.native
  def Content: SFC[ContentProps] = js.native
  inline def Content_=(x: SFC[ContentProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Page.FixedContent")
  @js.native
  def FixedContent: SFC[FixedContentProps] = js.native
  inline def FixedContent_=(x: SFC[FixedContentProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FixedContent")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Page.Header")
  @js.native
  def Header: Instantiable0[typings.wixStyleReact.pageHeaderMod.default] = js.native
  inline def Header_=(x: Instantiable0[typings.wixStyleReact.pageHeaderMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Page.Sticky")
  @js.native
  def Sticky: SFC[StickyProps] = js.native
  inline def Sticky_=(x: SFC[StickyProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Sticky")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Page.Tail")
  @js.native
  def Tail: SFC[TailProps] = js.native
  inline def Tail_=(x: SFC[TailProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tail")(x.asInstanceOf[js.Any])
}
