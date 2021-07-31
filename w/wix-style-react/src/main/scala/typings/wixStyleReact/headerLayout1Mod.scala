package typings.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixStyleReact.headerLayoutMod.HeaderLayoutProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerLayout1Mod extends Shortcut {
  
  @JSImport("wix-style-react/dist/es/src/MessageBox/FunctionalLayout/HeaderLayout1", JSImport.Default)
  @js.native
  val default: SFC[HeaderLayoutProps] = js.native
  
  type _To = SFC[HeaderLayoutProps]
  
  /* This means you don't have to write `default`, but can instead just say `headerLayout1Mod.foo` */
  override def _to: SFC[HeaderLayoutProps] = default
}
