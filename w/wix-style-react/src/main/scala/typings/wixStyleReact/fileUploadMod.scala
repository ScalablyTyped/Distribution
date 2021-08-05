package typings.wixStyleReact

import typings.react.mod.ClassicElement
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PureComponent
import typings.std.FileList
import typings.std.HTMLElement
import typings.wixStyleReact.wixStyleReactStrings.environment
import typings.wixStyleReact.wixStyleReactStrings.user
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileUploadMod {
  
  @JSImport("wix-style-react/dist/es/src/FileUpload", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[FileUploadProps, js.Object, js.Any]
  
  type FileUpload = PureComponent[FileUploadProps, js.Object, js.Any]
  
  trait FileUploadChildrenProps extends StObject {
    
    var openFileUploadDialog: MouseEventHandler[HTMLElement]
  }
  object FileUploadChildrenProps {
    
    inline def apply(openFileUploadDialog: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): FileUploadChildrenProps = {
      val __obj = js.Dynamic.literal(openFileUploadDialog = js.Any.fromFunction1(openFileUploadDialog))
      __obj.asInstanceOf[FileUploadChildrenProps]
    }
    
    extension [Self <: FileUploadChildrenProps](x: Self) {
      
      inline def setOpenFileUploadDialog(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "openFileUploadDialog", js.Any.fromFunction1(value))
    }
  }
  
  trait FileUploadProps extends StObject {
    
    var accept: js.UndefOr[String] = js.undefined
    
    var capture: js.UndefOr[user | environment] = js.undefined
    
    def children(params: FileUploadChildrenProps): ClassicElement[js.Any]
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    def onChange(fileList: FileList): Unit
  }
  object FileUploadProps {
    
    inline def apply(children: FileUploadChildrenProps => ClassicElement[js.Any], onChange: FileList => Unit): FileUploadProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[FileUploadProps]
    }
    
    extension [Self <: FileUploadProps](x: Self) {
      
      inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      inline def setCapture(value: user | environment): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      inline def setChildren(value: FileUploadChildrenProps => ClassicElement[js.Any]): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnChange(value: FileList => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    }
  }
}
