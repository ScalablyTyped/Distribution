package typings.wixStyleReact

import typings.wixStyleReact.anon.BeforeInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTestUtilsUtilsUnidriverReactBaseMod {
  
  object ReactBase {
    
    inline def apply(
      base: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UniDriver */ Any
    ): BeforeInput = ^.asInstanceOf[js.Dynamic].apply(base.asInstanceOf[js.Any]).asInstanceOf[BeforeInput]
    
    @JSImport("wix-style-react/dist/types/test-utils/utils/unidriver/ReactBase", "ReactBase")
    @js.native
    val ^ : js.Any = js.native
    
    inline def clickBody(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("clickBody")().asInstanceOf[Boolean]
    
    inline def clickDocument(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("clickDocument")().asInstanceOf[Boolean]
  }
}
