package typings.wixStyleReact

import typings.std.File
import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropzoneUniDriverMod {
  
  trait DropzoneUniDriver
    extends StObject
       with BaseUniDriver {
    
    def dropFiles(files: js.Array[File]): js.Promise[Unit]
    
    def getContentElement(): UniDriver[js.Any]
    
    def getOverlayElement(): UniDriver[js.Any]
  }
  object DropzoneUniDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      dropFiles: js.Array[File] => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getContentElement: () => UniDriver[js.Any],
      getOverlayElement: () => UniDriver[js.Any]
    ): DropzoneUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), dropFiles = js.Any.fromFunction1(dropFiles), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getContentElement = js.Any.fromFunction0(getContentElement), getOverlayElement = js.Any.fromFunction0(getOverlayElement))
      __obj.asInstanceOf[DropzoneUniDriver]
    }
    
    @scala.inline
    implicit class DropzoneUniDriverMutableBuilder[Self <: DropzoneUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDropFiles(value: js.Array[File] => js.Promise[Unit]): Self = StObject.set(x, "dropFiles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetContentElement(value: () => UniDriver[js.Any]): Self = StObject.set(x, "getContentElement", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetOverlayElement(value: () => UniDriver[js.Any]): Self = StObject.set(x, "getOverlayElement", js.Any.fromFunction0(value))
    }
  }
}
