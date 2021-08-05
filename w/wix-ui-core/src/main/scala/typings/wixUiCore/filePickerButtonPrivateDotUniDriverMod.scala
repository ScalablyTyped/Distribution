package typings.wixUiCore

import typings.std.HTMLInputElement
import typings.unidriverCore.mod.UniDriver
import typings.wixUiCore.anon.PartialFile
import typings.wixUiCore.filePickerButtonUniDotDriverMod.FilePickerButtonUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filePickerButtonPrivateDotUniDriverMod {
  
  @JSImport("wix-ui-core/src/components/file-picker-button/test/FilePickerButton.private.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def filePickerButtonPrivateUniDriverFactory(base: UniDriver[js.Any]): FilePickerButtonPrivateUniDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("filePickerButtonPrivateUniDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[FilePickerButtonPrivateUniDriver]
  
  trait FilePickerButtonPrivateUniDriver
    extends StObject
       with FilePickerButtonUniDriver {
    
    def focusChooseFileButton(): js.Promise[Unit]
    
    def getChooseFileButtonAttribute(attr: String): js.Promise[String]
    
    def getFileInputAttribute(attr: String): js.Promise[String]
    
    def getNativeInput(): js.Promise[HTMLInputElement]
  }
  object FilePickerButtonPrivateUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      focusChooseFileButton: () => js.Promise[Unit],
      getAccept: () => js.Promise[String],
      getChooseFileButtonAttribute: String => js.Promise[String],
      getContent: () => js.Promise[js.Array[js.Any]],
      getFileInputAttribute: String => js.Promise[String],
      getNativeInput: () => js.Promise[HTMLInputElement],
      getText: () => js.Promise[String],
      isDisabled: () => js.Promise[Boolean],
      isRequired: () => js.Promise[Boolean],
      selectFile: PartialFile => js.Promise[Unit]
    ): FilePickerButtonPrivateUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), focusChooseFileButton = js.Any.fromFunction0(focusChooseFileButton), getAccept = js.Any.fromFunction0(getAccept), getChooseFileButtonAttribute = js.Any.fromFunction1(getChooseFileButtonAttribute), getContent = js.Any.fromFunction0(getContent), getFileInputAttribute = js.Any.fromFunction1(getFileInputAttribute), getNativeInput = js.Any.fromFunction0(getNativeInput), getText = js.Any.fromFunction0(getText), isDisabled = js.Any.fromFunction0(isDisabled), isRequired = js.Any.fromFunction0(isRequired), selectFile = js.Any.fromFunction1(selectFile))
      __obj.asInstanceOf[FilePickerButtonPrivateUniDriver]
    }
    
    extension [Self <: FilePickerButtonPrivateUniDriver](x: Self) {
      
      inline def setFocusChooseFileButton(value: () => js.Promise[Unit]): Self = StObject.set(x, "focusChooseFileButton", js.Any.fromFunction0(value))
      
      inline def setGetChooseFileButtonAttribute(value: String => js.Promise[String]): Self = StObject.set(x, "getChooseFileButtonAttribute", js.Any.fromFunction1(value))
      
      inline def setGetFileInputAttribute(value: String => js.Promise[String]): Self = StObject.set(x, "getFileInputAttribute", js.Any.fromFunction1(value))
      
      inline def setGetNativeInput(value: () => js.Promise[HTMLInputElement]): Self = StObject.set(x, "getNativeInput", js.Any.fromFunction0(value))
    }
  }
}
