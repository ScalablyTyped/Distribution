package typings.wixStyleReact

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.PureComponent
import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFileUploadFileUploadMod {
  
  /** A wrapper component to support native file upload */
  @JSImport("wix-style-react/dist/types/FileUpload/FileUpload", JSImport.Default)
  @js.native
  open class default protected () extends FileUpload {
    def this(props: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/FileUpload/FileUpload", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/FileUpload/FileUpload", "default.defaultProps.accept_1")
      @js.native
      val accept1: String = js.native
      
      @JSImport("wix-style-react/dist/types/FileUpload/FileUpload", "default.defaultProps.capture_1")
      @js.native
      val capture1: String = js.native
      
      @JSImport("wix-style-react/dist/types/FileUpload/FileUpload", "default.defaultProps.multiple_1")
      @js.native
      val multiple1: Boolean = js.native
      
      inline def onChange1(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onChange_1")().asInstanceOf[Unit]
    }
    
    @JSImport("wix-style-react/dist/types/FileUpload/FileUpload", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/FileUpload/FileUpload", "default.propTypes.accept")
      @js.native
      val accept: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/FileUpload/FileUpload", "default.propTypes.capture")
      @js.native
      val capture: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/FileUpload/FileUpload", "default.propTypes.children")
      @js.native
      val children: Validator[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/FileUpload/FileUpload", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/FileUpload/FileUpload", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/FileUpload/FileUpload", "default.propTypes.multiple")
      @js.native
      val multiple: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/FileUpload/FileUpload", "default.propTypes.name")
      @js.native
      val name: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/FileUpload/FileUpload", "default.propTypes.onChange")
      @js.native
      val onChange: Validator[js.Function1[/* repeated */ Any, Any]] = js.native
    }
  }
  
  /** A wrapper component to support native file upload */
  @js.native
  trait FileUpload extends PureComponent[Any, Any, Any] {
    
    var inputRef: RefObject[Any] = js.native
  }
}
