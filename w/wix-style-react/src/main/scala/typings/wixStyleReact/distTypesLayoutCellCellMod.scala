package typings.wixStyleReact

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.Rows
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLayoutCellCellMod {
  
  object default {
    
    inline def apply(param0: Rows): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/Layout/Cell/Cell", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/Layout/Cell/Cell", "default.defaultProps.rows_1")
      @js.native
      val rows1: Double = js.native
      
      @JSImport("wix-style-react/dist/types/Layout/Cell/Cell", "default.defaultProps.span_1")
      @js.native
      val span1: Double = js.native
    }
    
    @JSImport("wix-style-react/dist/types/Layout/Cell/Cell", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Layout/Cell/Cell", "default.propTypes.children")
      @js.native
      val children: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/Layout/Cell/Cell", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Layout/Cell/Cell", "default.propTypes.rows")
      @js.native
      val rows: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/Layout/Cell/Cell", "default.propTypes.span")
      @js.native
      val span: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/Layout/Cell/Cell", "default.propTypes.vertical")
      @js.native
      val vertical: Requireable[Boolean] = js.native
    }
  }
}
