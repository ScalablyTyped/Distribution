package typings.typedoc

import typings.handlebars.mod.SafeString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wbrMod {
  
  @JSImport("typedoc/dist/lib/output/helpers/wbr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def wbr(options: js.Any): SafeString = ^.asInstanceOf[js.Dynamic].applyDynamic("wbr")(options.asInstanceOf[js.Any]).asInstanceOf[SafeString]
}
