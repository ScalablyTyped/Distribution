package typings.wixStyleReact

import typings.propTypes.mod.Requireable
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCopyClipboardCopyClipboardMod {
  
  object default {
    
    inline def apply(props: Any): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/CopyClipboard/CopyClipboard", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/CopyClipboard/CopyClipboard", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      inline def children1(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("children_1")().asInstanceOf[Unit]
      
      @JSImport("wix-style-react/dist/types/CopyClipboard/CopyClipboard", "default.defaultProps.value_1")
      @js.native
      val value1: String = js.native
    }
    
    @JSImport("wix-style-react/dist/types/CopyClipboard/CopyClipboard", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/CopyClipboard/CopyClipboard", "default.propTypes.children")
      @js.native
      val children: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/CopyClipboard/CopyClipboard", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/CopyClipboard/CopyClipboard", "default.propTypes.onCopy")
      @js.native
      val onCopy: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/CopyClipboard/CopyClipboard", "default.propTypes.resetTimeout")
      @js.native
      val resetTimeout: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/CopyClipboard/CopyClipboard", "default.propTypes.value")
      @js.native
      val value: Requireable[String] = js.native
    }
  }
}
