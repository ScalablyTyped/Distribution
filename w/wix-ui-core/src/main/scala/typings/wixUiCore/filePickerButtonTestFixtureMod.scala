package typings.wixUiCore

import typings.react.mod.Component
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filePickerButtonTestFixtureMod {
  
  @js.native
  sealed trait DataHook extends StObject
  @JSImport("wix-ui-core/dist/src/components/file-picker-button/test/FilePickerButtonTestFixture", "DataHook")
  @js.native
  object DataHook extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[DataHook & String] = js.native
    
    @js.native
    sealed trait FileNames
      extends StObject
         with DataHook
    /* "file-names" */ val FileNames: typings.wixUiCore.filePickerButtonTestFixtureMod.DataHook.FileNames & String = js.native
    
    @js.native
    sealed trait FilePickerButton
      extends StObject
         with DataHook
    /* "file-picker-button" */ val FilePickerButton: typings.wixUiCore.filePickerButtonTestFixtureMod.DataHook.FilePickerButton & String = js.native
    
    @js.native
    sealed trait OnChangeCount
      extends StObject
         with DataHook
    /* "on-change-count" */ val OnChangeCount: typings.wixUiCore.filePickerButtonTestFixtureMod.DataHook.OnChangeCount & String = js.native
    
    @js.native
    sealed trait ResetButton
      extends StObject
         with DataHook
    /* "reset-button" */ val ResetButton: typings.wixUiCore.filePickerButtonTestFixtureMod.DataHook.ResetButton & String = js.native
  }
  
  @JSImport("wix-ui-core/dist/src/components/file-picker-button/test/FilePickerButtonTestFixture", "FilePickerButtonTestFixture")
  @js.native
  class FilePickerButtonTestFixture protected ()
    extends Component[js.Object, FilePickerButtonTestFixtureState, js.Any] {
    def this(props: js.Any) = this()
    
    val filePickerButtonRef: js.Any = js.native
    
    val handleFilePickerButtonOnChange: js.Any = js.native
    
    val handleResetButtonClick: js.Any = js.native
  }
  
  trait FilePickerButtonTestFixtureState extends StObject {
    
    var onChangeCount: Double
    
    var selectedFiles: js.Array[File]
  }
  object FilePickerButtonTestFixtureState {
    
    @scala.inline
    def apply(onChangeCount: Double, selectedFiles: js.Array[File]): FilePickerButtonTestFixtureState = {
      val __obj = js.Dynamic.literal(onChangeCount = onChangeCount.asInstanceOf[js.Any], selectedFiles = selectedFiles.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilePickerButtonTestFixtureState]
    }
    
    @scala.inline
    implicit class FilePickerButtonTestFixtureStateMutableBuilder[Self <: FilePickerButtonTestFixtureState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnChangeCount(value: Double): Self = StObject.set(x, "onChangeCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedFiles(value: js.Array[File]): Self = StObject.set(x, "selectedFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedFilesVarargs(value: File*): Self = StObject.set(x, "selectedFiles", js.Array(value :_*))
    }
  }
}
