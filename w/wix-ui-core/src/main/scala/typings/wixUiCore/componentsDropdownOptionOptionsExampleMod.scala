package typings.wixUiCore

import typings.wixUiCore.anon.PartialDividerArgs
import typings.wixUiCore.componentsDropdownOptionOptionFactoryMod.Option
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsDropdownOptionOptionsExampleMod {
  
  @JSImport("wix-ui-core/src/components/dropdown-option/OptionsExample", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateOptions(): js.Array[Option] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateOptions")().asInstanceOf[js.Array[Option]]
  inline def generateOptions(dividerFactory: js.Function1[/* hasClassNameValue */ js.UndefOr[PartialDividerArgs], Option]): js.Array[Option] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateOptions")(dividerFactory.asInstanceOf[js.Any]).asInstanceOf[js.Array[Option]]
}
