package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionFileModel")
@js.native
class QuestionFileModel protected () extends Question {
  def this(name: java.lang.String) = this()
  /**
    * Accepted file types. Passed to the 'accept' attribute of the file input tag. See https://www.w3schools.com/tags/att_input_accept.asp for more details.
    */
  var acceptedTypes: java.lang.String = js.native
  /**
    * Set it to false if you want to disable images preview.
    */
  var allowImagesPreview: scala.Boolean = js.native
  /**
    * Set it to true, to allow select multiple files.
    */
  var allowMultiple: scala.Boolean = js.native
  /**
    * The clean files value button caption.
    */
  val cleanButtonCaption: java.lang.String = js.native
  var currentState: java.lang.String = js.native
  /**
    * The image height.
    */
  var imageHeight: java.lang.String = js.native
  /**
    * The image width.
    */
  var imageWidth: java.lang.String = js.native
  /**
    * The input title value.
    */
  val inputTitle: java.lang.String = js.native
  /**
    * Use this property to setup the maximum allowed file size.
    */
  var maxSize: scala.Double = js.native
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
  val removeFileCaption: java.lang.String = js.native
  /**
    * Set it to true, to show the preview for the image files.
    */
  var showPreview: scala.Boolean = js.native
  /**
    * Set it to false if you do not want to serialize file content as text in the survey.data.
    * In this case, you have to write the code onUploadFiles event to store the file content.
    * @see SurveyModel.onUploadFiles
    */
  var storeDataAsText: scala.Boolean = js.native
  /**
    * Set it to true if you want to wait until files will be uploaded to your server.
    */
  var waitForUpload: scala.Boolean = js.native
  def canPreviewImage(fileItem: js.Any): scala.Boolean = js.native
  /**
    * Clear value programmatically.
    */
  def clear(): scala.Unit = js.native
  def clear(doneCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Load multiple files programmatically.
    * @param files
    */
  def loadFiles(files: js.Array[stdLib.File]): scala.Unit = js.native
  /**
    * Remove file item programmatically.
    */
  def removeFile(content: surveyDashKnockoutLib.Anon_Name): scala.Unit = js.native
  /* protected */ def stateChanged(state: java.lang.String): scala.Unit = js.native
}

