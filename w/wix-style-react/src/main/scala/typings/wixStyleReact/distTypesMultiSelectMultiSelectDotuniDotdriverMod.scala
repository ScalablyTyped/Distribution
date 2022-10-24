package typings.wixStyleReact

import typings.wixStyleReact.anon.CustomSuffixExists
import typings.wixStyleReact.anon.IsEditable
import typings.wixStyleReact.anon.PickInputWithOptionsUniDr
import typings.wixStyleReact.distTypesDropdownLayoutDropdownLayoutDotuniDotdriverMod.DropdownLayoutUniDriver
import typings.wixStyleReact.distTypesInputInputDotuniDotdriverMod.InputUniDriver
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMultiSelectMultiSelectDotuniDotdriverMod {
  
  /* Inlined parent wix-style-react.wix-style-react/dist/types/common.OmitPolyfill<wix-style-react.wix-style-react/dist/types/InputWithOptions/InputWithOptions.uni.driver.InputWithOptionsUniDriver, 'driver'> */
  @js.native
  trait MultiSelectUniDriver extends StObject {
    
    var click: js.Function0[js.Promise[Unit]] = js.native
    
    var driver: IsEditable & CustomSuffixExists & PickInputWithOptionsUniDr & BaseUniDriver = js.native
    
    var dropdownLayoutDriver: DropdownLayoutUniDriver = js.native
    
    var element: js.Function0[js.Promise[Any]] = js.native
    
    def exists(): js.Promise[Unit] = js.native
    @JSName("exists")
    var exists_FMultiSelectUniDriver: js.Function0[js.Promise[Boolean]] = js.native
    
    var inputDriver: InputUniDriver = js.native
  }
}
