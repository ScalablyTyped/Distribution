package typings.wixUiCore

import typings.unidriverCore.mod.UniDriver
import typings.wixUiCore.anon.GetStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactBaseMod {
  
  @JSImport("wix-ui-core/dist/standalone/test/utils/unidriver/ReactBase", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ReactBase(base: UniDriver[js.Any]): GetStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("ReactBase")(base.asInstanceOf[js.Any]).asInstanceOf[GetStyle]
}
