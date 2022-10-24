package typings.wixStyleReact

import typings.propTypes.mod.Requireable
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.Angle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLoaderArcMod {
  
  object default {
    
    inline def apply(param0: Angle): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/Loader/Arc", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/Loader/Arc", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Loader/Arc", "default.propTypes.angle")
      @js.native
      val angle: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/Loader/Arc", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Loader/Arc", "default.propTypes.strokeWidth")
      @js.native
      val strokeWidth: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/Loader/Arc", "default.propTypes.viewBoxSize")
      @js.native
      val viewBoxSize: Requireable[Double] = js.native
    }
  }
}
