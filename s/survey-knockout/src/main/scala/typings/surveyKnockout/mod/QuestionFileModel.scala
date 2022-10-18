package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionFileModel")
@js.native
open class QuestionFileModel protected () extends Question {
  def this(name: String) = this()
  
  /*
    * Accepted file types. Passed to the 'accept' attribute of the file input tag. See https://www.w3schools.com/tags/att_input_accept.asp for more details.
    */
  def acceptedTypes: String = js.native
  def acceptedTypes_=(`val`: String): Unit = js.native
  
  /*
    * Set it to false if you want to disable images preview.
    */
  def allowImagesPreview: Boolean = js.native
  def allowImagesPreview_=(`val`: Boolean): Unit = js.native
  
  /*
    * Set it to true, to allow select multiple files.
    */
  def allowMultiple: Boolean = js.native
  def allowMultiple_=(`val`: Boolean): Unit = js.native
  
  def canPreviewImage(fileItem: Any): Boolean = js.native
  
  /*
    * The choose files button caption for modern theme.
    */
  def chooseButtonCaption: String = js.native
  def chooseButtonCaption_=(`val`: String): Unit = js.native
  
  /*
    * The choose file input title.
    */
  def chooseFileTitle: String = js.native
  def chooseFileTitle_=(`val`: String): Unit = js.native
  
  /*
    * The clean files button caption.
    */
  def cleanButtonCaption: String = js.native
  def cleanButtonCaption_=(`val`: String): Unit = js.native
  
  /*
    * Clear value programmatically.
    */
  def clear(): Unit = js.native
  def clear(doneCallback: Any): Unit = js.native
  
  /*
    * The remove all files confirmation message.
    */
  def confirmRemoveAllMessage: String = js.native
  def confirmRemoveAllMessage_=(`val`: String): Unit = js.native
  
  /*
    * The remove file confirmation message template.
    */
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
  
  var fileIndexAction: Action = js.native
  
  def fileRootCss: String = js.native
  
  def getChooseFileCss(): String = js.native
  
  /*
    * The remove file confirmation message.
    */
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
  
  /*
    * The input title value.
    */
  def inputTitle: String = js.native
  
  var isDragging: Boolean = js.native
  
  def isPreviewVisible(index: Double): Boolean = js.native
  
  var isUploading: Boolean = js.native
  
  /*
    * Load multiple files programmatically.
    */
  def loadFiles(files: Any): Unit = js.native
  
  /* protected */ def loadPreview(newValue: Any): Unit = js.native
  
  /*
    * The loading file input title.
    */
  def loadingFileTitle: String = js.native
  def loadingFileTitle_=(`val`: String): Unit = js.native
  
  def locChooseButtonCaption: LocalizableString = js.native
  
  def locChooseFileTitle: LocalizableString = js.native
  
  def locCleanButtonCaption: LocalizableString = js.native
  
  def locConfirmRemoveAllMessage: LocalizableString = js.native
  
  def locConfirmRemoveMessage: LocalizableString = js.native
  
  def locDragAreaPlaceholder: LocalizableString = js.native
  
  def locLoadingFileTitle: LocalizableString = js.native
  
  def locNoFileChosenCaption: LocalizableString = js.native
  
  def locRemoveFileCaption: LocalizableString = js.native
  
  /*
    * Use this property to setup the maximum allowed file size.
    */
  def maxSize: Double = js.native
  def maxSize_=(`val`: Double): Unit = js.native
  
  var mobileFileNavigator: Any = js.native
  
  def mobileFileNavigatorVisible: Boolean = js.native
  
  def multipleRendered: String = js.native
  
  /*
    * Use this property to setup confirmation to remove file.
    */
  def needConfirmRemoveFile: Boolean = js.native
  def needConfirmRemoveFile_=(`val`: Boolean): Unit = js.native
  
  var nextFileAction: Action = js.native
  
  /*
    * The no file chosen caption for modern theme.
    */
  def noFileChosenCaption: String = js.native
  def noFileChosenCaption_=(`val`: String): Unit = js.native
  
  def onDragLeave(event: Any): Unit = js.native
  
  def onDragOver(event: Any): Boolean = js.native
  
  def onDrop(event: Any): Unit = js.native
  
  /*
    * The event is fired after question state has been changed.
    * sender the question object that fires the event
    * options.state new question state value.
    */
  var onStateChanged: EventBase[QuestionFileModel] = js.native
  
  var prevFileAction: Action = js.native
  
  var previewValue: Any = js.native
  
  /*
    * Remove file item programmatically.
    */
  def removeFile(name: String): Unit = js.native
  
  /* protected */ def removeFileByContent(content: Any): Unit = js.native
  
  /*
    * The remove file button caption.
    */
  def removeFileCaption: String = js.native
  def removeFileCaption_=(`val`: String): Unit = js.native
  
  /*
    * Set it to true, to show the preview for the image files.
    */
  def showPreview: Boolean = js.native
  def showPreview_=(`val`: Boolean): Unit = js.native
  
  def showRemoveButton: Any = js.native
  
  def showRemoveButtonBottom: Any = js.native
  
  /* protected */ def stateChanged(state: String): Unit = js.native
  
  /*
    * Set it to false if you do not want to serialize file content as text in the survey.data.
    * In this case, you have to write the code onUploadFiles event to store the file content.
    */
  def storeDataAsText: Boolean = js.native
  def storeDataAsText_=(`val`: Boolean): Unit = js.native
  
  /*
    * Set it to true if you want to wait until files will be uploaded to your server.
    */
  def waitForUpload: Boolean = js.native
  def waitForUpload_=(`val`: Boolean): Unit = js.native
}
