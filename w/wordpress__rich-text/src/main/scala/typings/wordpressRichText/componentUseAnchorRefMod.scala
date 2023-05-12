package typings.wordpressRichText

import typings.std.Element
import typings.std.Range
import typings.wordpressRichText.anon.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentUseAnchorRefMod {
  
  @JSImport("@wordpress/rich-text/component/use-anchor-ref", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useAnchorRef(param: Ref): Element | Range = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnchorRef")(param.asInstanceOf[js.Any]).asInstanceOf[Element | Range]
}
