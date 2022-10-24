package typings.styledJsx

import typings.react.mod.global.JSX.Element
import typings.styledJsx.anon.Children
import typings.styledJsx.anon.Nonce
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("styled-jsx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def StyleRegistry(param0: Children): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StyleRegistry")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def createStyleRegistry(): StyledJsxStyleRegistry = ^.asInstanceOf[js.Dynamic].applyDynamic("createStyleRegistry")().asInstanceOf[StyledJsxStyleRegistry]
  
  inline def useStyleRegistry(): StyledJsxStyleRegistry = ^.asInstanceOf[js.Dynamic].applyDynamic("useStyleRegistry")().asInstanceOf[StyledJsxStyleRegistry]
  
  @js.native
  trait StyledJsxStyleRegistry extends StObject {
    
    def add(props: Any): Unit = js.native
    
    def flush(): Unit = js.native
    
    def remove(props: Any): Unit = js.native
    
    def styles(): js.Array[Element] = js.native
    def styles(options: Nonce): js.Array[Element] = js.native
  }
}
