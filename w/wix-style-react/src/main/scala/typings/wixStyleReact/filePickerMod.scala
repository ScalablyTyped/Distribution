package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filePickerMod {
  
  @JSImport("wix-style-react/dist/es/src/FilePicker", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[FilePickerProps, js.Object, js.Any]
  
  type FilePicker = PureComponent[FilePickerProps, js.Object, js.Any]
  
  trait FilePickerProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var errorMessage: js.UndefOr[String] = js.undefined
    
    var header: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String | Double] = js.undefined
    
    var mainLabel: js.UndefOr[String] = js.undefined
    
    var maxSize: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* file */ File, Unit]] = js.undefined
    
    var subLabel: js.UndefOr[String] = js.undefined
    
    var supportedFormats: js.UndefOr[String] = js.undefined
  }
  object FilePickerProps {
    
    @scala.inline
    def apply(): FilePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilePickerProps]
    }
    
    @scala.inline
    implicit class FilePickerPropsMutableBuilder[Self <: FilePickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMainLabel(value: String): Self = StObject.set(x, "mainLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainLabelUndefined: Self = StObject.set(x, "mainLabel", js.undefined)
      
      @scala.inline
      def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* file */ File => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setSubLabel(value: String): Self = StObject.set(x, "subLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubLabelUndefined: Self = StObject.set(x, "subLabel", js.undefined)
      
      @scala.inline
      def setSupportedFormats(value: String): Self = StObject.set(x, "supportedFormats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedFormatsUndefined: Self = StObject.set(x, "supportedFormats", js.undefined)
    }
  }
}
