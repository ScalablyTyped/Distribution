package typings.styledComponents

import typings.std.CSSStyleSheet
import typings.std.HTMLElement
import typings.std.HTMLStyleElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeDistDistSheetDomMod {
  
  @JSImport("styled-components/native/dist/dist/sheet/dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSheet(tag: HTMLStyleElement): CSSStyleSheet = ^.asInstanceOf[js.Dynamic].applyDynamic("getSheet")(tag.asInstanceOf[js.Any]).asInstanceOf[CSSStyleSheet]
  
  inline def makeStyleTag(): HTMLStyleElement = ^.asInstanceOf[js.Dynamic].applyDynamic("makeStyleTag")().asInstanceOf[HTMLStyleElement]
  inline def makeStyleTag(target: HTMLElement): HTMLStyleElement = ^.asInstanceOf[js.Dynamic].applyDynamic("makeStyleTag")(target.asInstanceOf[js.Any]).asInstanceOf[HTMLStyleElement]
}
