package typings.wordpressData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesControlsMod {
  
  object builtinControls {
    
    @JSImport("@wordpress/data/build-types/controls", "builtinControls")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/data/build-types/controls", "builtinControls.@@data/DISPATCH")
    @js.native
    def dataDISPATCH: js.Function = js.native
    
    inline def dataDISPATCH_=(x: js.Function): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("@@data/DISPATCH")(x.asInstanceOf[js.Any])
    
    @JSImport("@wordpress/data/build-types/controls", "builtinControls.@@data/RESOLVE_SELECT")
    @js.native
    def dataRESOLVESELECT: js.Function = js.native
    
    inline def dataRESOLVESELECT_=(x: js.Function): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("@@data/RESOLVE_SELECT")(x.asInstanceOf[js.Any])
    
    @JSImport("@wordpress/data/build-types/controls", "builtinControls.@@data/SELECT")
    @js.native
    def dataSELECT: js.Function = js.native
    
    inline def dataSELECT_=(x: js.Function): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("@@data/SELECT")(x.asInstanceOf[js.Any])
  }
  
  type StoreDescriptor = typings.wordpressData.buildTypesTypesMod.StoreDescriptor[Any]
}
