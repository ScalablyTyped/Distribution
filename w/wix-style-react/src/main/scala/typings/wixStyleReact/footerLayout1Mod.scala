package typings.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixStyleReact.footerLayoutMod.FooterLayoutProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object footerLayout1Mod extends Shortcut {
  
  @JSImport("wix-style-react/dist/es/src/MessageBox/FunctionalLayout/FooterLayout1", JSImport.Default)
  @js.native
  val default: SFC[FooterLayoutProps] = js.native
  
  type _To = SFC[FooterLayoutProps]
  
  /* This means you don't have to write `default`, but can instead just say `footerLayout1Mod.foo` */
  override def _to: SFC[FooterLayoutProps] = default
}
