package typings.stylefire

import typings.stylefire.typesMod.Config
import typings.stylefire.typesMod.Props
import typings.stylefire.typesMod.Styler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylerMod {
  
  @JSImport("stylefire/lib/styler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(hasOnReadOnRenderUncachedValuesUseCache: Config): js.Function1[/* hasProps */ js.UndefOr[Props], Styler] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasOnReadOnRenderUncachedValuesUseCache.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* hasProps */ js.UndefOr[Props], Styler]]
}
