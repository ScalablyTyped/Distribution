package typings
package watsonDashDeveloperDashCloudLib.watsonDashDeveloperDashCloudMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("watson-developer-cloud", "VisualRecognitionV3")
@js.native
class VisualRecognitionV3 protected () extends js.Object {
  def this(options: js.Any) = this()
  def addImage(params: js.Any, callback: js.Any): js.Any = js.native
  def classify(params: js.Any, callback: js.Any): js.Any = js.native
  def createClassifier(params: js.Any, callback: js.Any): js.Any = js.native
  def createCollection(params: js.Any, callback: js.Any): js.Any = js.native
  def deleteClassifier(params: js.Any, callback: js.Any): js.Any = js.native
  def deleteCollection(params: js.Any, callback: js.Any): js.Any = js.native
  def deleteImage(params: js.Any, callback: js.Any): js.Any = js.native
  def deleteImageMetadata(params: js.Any, callback: js.Any): js.Any = js.native
  def detectFaces(params: js.Any, callback: js.Any): js.Any = js.native
  def findSimilar(params: js.Any, callback: js.Any): js.Any = js.native
  def getClassifier(params: js.Any, callback: js.Any): js.Any = js.native
  def getCollection(params: js.Any, callback: js.Any): js.Any = js.native
  def getCredentialsFromBluemix(): js.Any = js.native
  def getCredentialsFromEnvironment(name: js.Any): js.Any = js.native
  def getImage(params: js.Any, callback: js.Any): js.Any = js.native
  def getImageMetadata(params: js.Any, callback: js.Any): js.Any = js.native
  def initCredentials(options: js.Any): js.Any = js.native
  def listClassifiers(params: js.Any, callback: js.Any): js.Any = js.native
  def listCollections(params: js.Any, callback: js.Any): js.Any = js.native
  def listImages(params: js.Any, callback: js.Any): js.Any = js.native
  def recognizeText(params: js.Any, callback: js.Any): js.Any = js.native
  def request(parameters: js.Any, cb: js.Any): js.Any = js.native
  def retrainClassifier(params: js.Any, callback: js.Any): js.Any = js.native
  def setImageMetadata(params: js.Any, callback: js.Any): js.Any = js.native
}

@JSImport("watson-developer-cloud", "VisualRecognitionV3")
@js.native
object VisualRecognitionV3 extends js.Object {
  var URL: java.lang.String = js.native
  var VERSION_DATE_2016_05_20: java.lang.String = js.native
}

