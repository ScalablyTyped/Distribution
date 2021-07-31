package typings.wixUiCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filePickerButtonDothelpersMod {
  
  @js.native
  sealed trait DataHook extends StObject
  @JSImport("wix-ui-core/dist/standalone/src/components/file-picker-button/test/FilePickerButton.helpers", "DataHook")
  @js.native
  object DataHook extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[DataHook & String] = js.native
    
    @js.native
    sealed trait ChooseFileButton
      extends StObject
         with DataHook
    /* "file-picker-button-choose-file-button" */ val ChooseFileButton: typings.wixUiCore.filePickerButtonDothelpersMod.DataHook.ChooseFileButton & String = js.native
    
    @js.native
    sealed trait FileInput
      extends StObject
         with DataHook
    /* "file-picker-button-file-input" */ val FileInput: typings.wixUiCore.filePickerButtonDothelpersMod.DataHook.FileInput & String = js.native
  }
}
