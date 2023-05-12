package typings.wordpressRichText

import typings.std.Element
import typings.std.Range
import typings.wordpressRichText.anon.EditableContentElement
import typings.wordpressRichText.anon.Ref
import typings.wordpressRichText.componentUseAnchorMod.VirtualAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@wordpress/rich-text/component", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useAnchor(param: EditableContentElement): js.UndefOr[Element | VirtualAnchorElement | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnchor")(param.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Element | VirtualAnchorElement | Null]]
  
  inline def useAnchorRef(param: Ref): Element | Range = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnchorRef")(param.asInstanceOf[js.Any]).asInstanceOf[Element | Range]
}
