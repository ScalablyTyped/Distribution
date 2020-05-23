package typings.surveyKnockout.mod

import typings.std.File
import typings.surveyKnockout.anon.Calculations
import typings.surveyKnockout.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionFileModel")
@js.native
class QuestionFileModel protected () extends Question {
  def this(name: String) = this()
  /**
    * Accepted file types. Passed to the 'accept' attribute of the file input tag. See https://www.w3schools.com/tags/att_input_accept.asp for more details.
    */
  var acceptedTypes: String = js.native
  /**
    * Set it to false if you want to disable images preview.
    */
  var allowImagesPreview: Boolean = js.native
  /**
    * Set it to true, to allow select multiple files.
    */
  var allowMultiple: Boolean = js.native
  /**
    * The choose files button caption for modern theme.
    */
  val chooseButtonCaption: String = js.native
  /**
    * The clean files button caption.
    */
  val cleanButtonCaption: String = js.native
  /**
    * The remove all files confirmation message.
    */
  val confirmRemoveAllMessage: String = js.native
  var currentState: String = js.native
  /**
    * The image height.
    */
  var imageHeight: String = js.native
  /**
    * The image width.
    */
  var imageWidth: String = js.native
  /**
    * The input title value.
    */
  val inputTitle: String = js.native
  /**
    * Use this property to setup the maximum allowed file size.
    */
  var maxSize: Double = js.native
  /**
    * Use this property to setup confirmation to remove file.
    */
  var needConfirmRemoveFile: Boolean = js.native
  /**
    * The no file chosen caption for modern theme.
    */
  val noFileChosenCaption: String = js.native
  /**
    * The event is fired after question state has been changed.
    * <br/> sender the question object that fires the event
    * <br/> options.state new question state value.
    */
  var onStateChanged: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  var previewValue: js.Array[_] = js.native
  /**
    * The remove file button caption.
    */
  val removeFileCaption: String = js.native
  /**
    * Set it to true, to show the preview for the image files.
    */
  var showPreview: Boolean = js.native
  /**
    * Set it to false if you do not want to serialize file content as text in the survey.data.
    * In this case, you have to write the code onUploadFiles event to store the file content.
    * @see SurveyModel.onUploadFiles
    */
  var storeDataAsText: Boolean = js.native
  /**
    * Set it to true if you want to wait until files will be uploaded to your server.
    */
  var waitForUpload: Boolean = js.native
  def canPreviewImage(fileItem: js.Any): Boolean = js.native
  /**
    * Clear value programmatically.
    */
  def clear(): Unit = js.native
  def clear(doneCallback: js.Function0[Unit]): Unit = js.native
  /**
    * The remove file confirmation message.
    */
  def getConfirmRemoveMessage(fileName: String): String = js.native
  def getPlainData(options: Calculations): js.Any = js.native
  /**
    * Load multiple files programmatically.
    * @param files
    */
  def loadFiles(files: js.Array[File]): Unit = js.native
  /**
    * Remove file item programmatically.
    */
  def removeFile(content: Name): Unit = js.native
  /* protected */ def stateChanged(state: String): Unit = js.native
}

