package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionFileModel")
@js.native
open class QuestionFileModel protected () extends Question {
  def this(name: String) = this()
  
  /*
    * An [accept](https://www.w3schools.com/tags/att_input_accept.asp) attribute value for the underlying `<input>` element.
    */
  def acceptedTypes: String = js.native
  def acceptedTypes_=(`val`: String): Unit = js.native
  
  /*
    * Specifies whether to show a preview of image files.
    */
  def allowImagesPreview: Boolean = js.native
  def allowImagesPreview_=(`val`: Boolean): Unit = js.native
  
  /*
    * Specifies whether users can upload multiple files.
    * 
    * Default value: `false`
    */
  def allowMultiple: Boolean = js.native
  def allowMultiple_=(`val`: Boolean): Unit = js.native
  
  def canPreviewImage(fileItem: Any): Boolean = js.native
  
  def chooseButtonCaption: String = js.native
  def chooseButtonCaption_=(`val`: String): Unit = js.native
  
  def chooseFileTitle: String = js.native
  def chooseFileTitle_=(`val`: String): Unit = js.native
  
  def clear(): Unit = js.native
  def clear(doneCallback: Any): Unit = js.native
  
  def clearButtonCaption: String = js.native
  def clearButtonCaption_=(`val`: String): Unit = js.native
  
  def confirmRemoveAllMessage: String = js.native
  def confirmRemoveAllMessage_=(`val`: String): Unit = js.native
  
  def confirmRemoveMessage: String = js.native
  def confirmRemoveMessage_=(`val`: String): Unit = js.native
  
  var containsMultiplyFiles: Boolean = js.native
  
  var currentState: String = js.native
  
  def defaultImage(data: Any): Boolean = js.native
  
  def doChange(event: Any): Unit = js.native
  
  def doClean(event: Any): Unit = js.native
  
  def doDownloadFile(event: Any, data: Any): Unit = js.native
  
  def doRemoveFile(data: Any): Unit = js.native
  
  def dragAreaPlaceholder: String = js.native
  def dragAreaPlaceholder_=(`val`: String): Unit = js.native
  
  var dragCounter: Double = js.native
  
  /* protected */ var fileIndexAction: Action = js.native
  
  def fileRootCss: String = js.native
  
  def getChooseFileCss(): String = js.native
  
  def getConfirmRemoveMessage(fileName: String): String = js.native
  
  def getFileDecoratorCss(): String = js.native
  
  def getReadOnlyFileCss(): String = js.native
  
  /*
    * The image height.
    */
  def imageHeight: String = js.native
  def imageHeight_=(`val`: String): Unit = js.native
  
  /*
    * The image width.
    */
  def imageWidth: String = js.native
  
  def imageWidthRendered: String = js.native
  
  def imageWidth_=(`val`: String): Unit = js.native
  
  var indexToShow: Double = js.native
  
  def inputTitle: String = js.native
  
  var isDragging: Boolean = js.native
  
  def isPreviewVisible(index: Double): Boolean = js.native
  
  var isUploading: Boolean = js.native
  
  /*
    * Loads multiple files into the question.
    */
  def loadFiles(files: Any): Unit = js.native
  
  /* protected */ def loadPreview(newValue: Any): Unit = js.native
  
  def loadingFileTitle: String = js.native
  def loadingFileTitle_=(`val`: String): Unit = js.native
  
  def locChooseButtonCaption: LocalizableString = js.native
  
  def locChooseFileTitle: LocalizableString = js.native
  
  def locClearButtonCaption: LocalizableString = js.native
  
  def locConfirmRemoveAllMessage: LocalizableString = js.native
  
  def locConfirmRemoveMessage: LocalizableString = js.native
  
  def locDragAreaPlaceholder: LocalizableString = js.native
  
  def locLoadingFileTitle: LocalizableString = js.native
  
  def locNoFileChosenCaption: LocalizableString = js.native
  
  def locRemoveFileCaption: LocalizableString = js.native
  
  /*
    * Maximum allowed file size, measured in bytes.
    * 
    * Default value: 0 (unlimited)
    */
  def maxSize: Double = js.native
  def maxSize_=(`val`: Double): Unit = js.native
  
  var mobileFileNavigator: Any = js.native
  
  def mobileFileNavigatorVisible: Boolean = js.native
  
  def multipleRendered: String = js.native
  
  /*
    * Specifies whether users should confirm file deletion.
    * 
    * Default value: `false`
    */
  def needConfirmRemoveFile: Boolean = js.native
  def needConfirmRemoveFile_=(`val`: Boolean): Unit = js.native
  
  /* protected */ var nextFileAction: Action = js.native
  
  def noFileChosenCaption: String = js.native
  def noFileChosenCaption_=(`val`: String): Unit = js.native
  
  def onDragEnter(event: Any): Unit = js.native
  
  def onDragLeave(event: Any): Unit = js.native
  
  def onDragOver(event: Any): Boolean = js.native
  
  def onDrop(event: Any): Unit = js.native
  
  /*
    * An event that is raised after the upload state has changed.
    * 
    * Parameters:
    * 
    * - `sender` - A question instance that raised the event.
    * - `options.state` - Current upload state: `"empty"`, `"loading"`, `"loaded"`, or `"error"`.
    */
  var onStateChanged: EventBase[QuestionFileModel] = js.native
  
  /* protected */ var prevFileAction: Action = js.native
  
  var previewValue: Any = js.native
  
  /*
    * Removes a file with a specified name.
    */
  def removeFile(name: String): Unit = js.native
  
  /* protected */ def removeFileByContent(content: Any): Unit = js.native
  
  def removeFileCaption: String = js.native
  def removeFileCaption_=(`val`: String): Unit = js.native
  
  var rootElement: Any = js.native
  
  /*
    * Disable this property only to implement a custom preview.
    * 
    * [View "Custom Preview" Demo](https://surveyjs.io/form-library/examples/file-custom-preview/ (linkStyle))
    */
  def showPreview: Boolean = js.native
  def showPreview_=(`val`: Boolean): Unit = js.native
  
  def showRemoveButton: Any = js.native
  
  def showRemoveButtonBottom: Any = js.native
  
  /* protected */ def stateChanged(state: String): Unit = js.native
  
  /*
    * Specifies whether to store file content as text in `SurveyModel`'s [`data`](https://surveyjs.io/form-library/documentation/surveymodel#data) property.
    * 
    * If you disable this property, implement `SurveyModel`'s [`onUploadFiles`](https://surveyjs.io/form-library/documentation/surveymodel#onUploadFiles) event handler to specify how to store file content.
    */
  def storeDataAsText: Boolean = js.native
  def storeDataAsText_=(`val`: Boolean): Unit = js.native
  
  /*
    * Enable this property if you want to wait until files are uploaded to complete the survey.
    * 
    * Default value: `false`
    */
  def waitForUpload: Boolean = js.native
  def waitForUpload_=(`val`: Boolean): Unit = js.native
}
