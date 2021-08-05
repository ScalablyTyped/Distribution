package typings.wixUiCore

import typings.unidriverCore.mod.UniDriver
import typings.wixUiCore.anon.PartialFile
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filePickerButtonDotUniDriverMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/file-picker-button/test/FilePickerButton.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def filePickerButtonUniDriverFactory(base: UniDriver[js.Any]): FilePickerButtonUniDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("filePickerButtonUniDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[FilePickerButtonUniDriver]
  
  trait FilePickerButtonUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getAccept(): js.Promise[String]
    
    def getContent(): js.Promise[js.Array[js.Any]]
    
    def getText(): js.Promise[String]
    
    def isDisabled(): js.Promise[Boolean]
    
    def isRequired(): js.Promise[Boolean]
    
    def selectFile(file: PartialFile): js.Promise[Unit]
  }
  object FilePickerButtonUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getAccept: () => js.Promise[String],
      getContent: () => js.Promise[js.Array[js.Any]],
      getText: () => js.Promise[String],
      isDisabled: () => js.Promise[Boolean],
      isRequired: () => js.Promise[Boolean],
      selectFile: PartialFile => js.Promise[Unit]
    ): FilePickerButtonUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getAccept = js.Any.fromFunction0(getAccept), getContent = js.Any.fromFunction0(getContent), getText = js.Any.fromFunction0(getText), isDisabled = js.Any.fromFunction0(isDisabled), isRequired = js.Any.fromFunction0(isRequired), selectFile = js.Any.fromFunction1(selectFile))
      __obj.asInstanceOf[FilePickerButtonUniDriver]
    }
    
    extension [Self <: FilePickerButtonUniDriver](x: Self) {
      
      inline def setGetAccept(value: () => js.Promise[String]): Self = StObject.set(x, "getAccept", js.Any.fromFunction0(value))
      
      inline def setGetContent(value: () => js.Promise[js.Array[js.Any]]): Self = StObject.set(x, "getContent", js.Any.fromFunction0(value))
      
      inline def setGetText(value: () => js.Promise[String]): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
      
      inline def setIsDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
      
      inline def setIsRequired(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isRequired", js.Any.fromFunction0(value))
      
      inline def setSelectFile(value: PartialFile => js.Promise[Unit]): Self = StObject.set(x, "selectFile", js.Any.fromFunction1(value))
    }
  }
}
