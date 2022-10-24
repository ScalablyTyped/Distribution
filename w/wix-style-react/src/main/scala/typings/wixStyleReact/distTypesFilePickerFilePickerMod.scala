package typings.wixStyleReact

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import typings.wixStyleReact.anon.SelectedFileName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFilePickerFilePickerMod {
  
  /**
    * # `<FilePicker/>`
    *
    * Component that opens system browser dialog for choosing files to upload
    */
  @JSImport("wix-style-react/dist/types/FilePicker/FilePicker", JSImport.Default)
  @js.native
  open class default protected () extends FilePicker {
    def this(props: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/FilePicker/FilePicker", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/FilePicker/FilePicker", "default.defaultProps.errorMessage")
      @js.native
      val errorMessage: String = js.native
      
      @JSImport("wix-style-react/dist/types/FilePicker/FilePicker", "default.defaultProps.mainLabel")
      @js.native
      val mainLabel: String = js.native
      
      @JSImport("wix-style-react/dist/types/FilePicker/FilePicker", "default.defaultProps.maxSize")
      @js.native
      val maxSize: Double = js.native
      
      inline def onChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onChange")().asInstanceOf[Unit]
      
      @JSImport("wix-style-react/dist/types/FilePicker/FilePicker", "default.defaultProps.subLabel")
      @js.native
      val subLabel: String = js.native
      
      @JSImport("wix-style-react/dist/types/FilePicker/FilePicker", "default.defaultProps.supportedFormats")
      @js.native
      val supportedFormats: String = js.native
    }
    
    @JSImport("wix-style-react/dist/types/FilePicker/FilePicker", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/FilePicker/FilePicker", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/FilePicker/FilePicker", "default.propTypes.error")
      @js.native
      val error: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/FilePicker/FilePicker", "default.propTypes.errorMessage_1")
      @js.native
      val errorMessage1: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/FilePicker/FilePicker", "default.propTypes.header")
      @js.native
      val header: Requireable[String | Double | Boolean | ReactElementLike | ReactNodeArray] = js.native
      
      @JSImport("wix-style-react/dist/types/FilePicker/FilePicker", "default.propTypes.id")
      @js.native
      val id: Requireable[String | Double] = js.native
      
      @JSImport("wix-style-react/dist/types/FilePicker/FilePicker", "default.propTypes.mainLabel_1")
      @js.native
      val mainLabel1: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/FilePicker/FilePicker", "default.propTypes.maxSize_1")
      @js.native
      val maxSize1: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/FilePicker/FilePicker", "default.propTypes.name")
      @js.native
      val name: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/FilePicker/FilePicker", "default.propTypes.onChange_1")
      @js.native
      val onChange1: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/FilePicker/FilePicker", "default.propTypes.subLabel_1")
      @js.native
      val subLabel1: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/FilePicker/FilePicker", "default.propTypes.supportedFormats_1")
      @js.native
      val supportedFormats1: Requireable[String] = js.native
    }
  }
  
  /**
    * # `<FilePicker/>`
    *
    * Component that opens system browser dialog for choosing files to upload
    */
  @js.native
  trait FilePicker extends PureComponent[Any, Any, Any] {
    
    var id: Any = js.native
    
    /** A callback which is invoked every time a file is chosen */
    def onChooseFile(file: Any): Unit = js.native
    
    @JSName("state")
    var state_FilePicker: SelectedFileName = js.native
  }
}
