package typings.wixStyleReact

import typings.propTypes.mod.Requireable
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.TitleBarDisplay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTableComponentsTableContentMod {
  
  object TableContent {
    
    inline def apply(param0: TitleBarDisplay): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/Table/components/TableContent", "TableContent")
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/Table/components/TableContent", "TableContent.defaultProps.titleBarDisplay_1")
      @js.native
      val titleBarDisplay1: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/Table/components/TableContent", "TableContent.defaultProps.titleBarVisible_1")
      @js.native
      val titleBarVisible1: Boolean = js.native
    }
    
    @JSImport("wix-style-react/dist/types/Table/components/TableContent", "TableContent.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Table/components/TableContent", "TableContent.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/components/TableContent", "TableContent.propTypes.titleBarDisplay")
      @js.native
      val titleBarDisplay: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/components/TableContent", "TableContent.propTypes.titleBarVisible")
      @js.native
      val titleBarVisible: Requireable[Boolean] = js.native
    }
  }
}
