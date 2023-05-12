package typings.tesseractJs.mod

import typings.tesseractJs.anon.PartialInitOptions
import typings.tesseractJs.anon.PartialOutputFormats
import typings.tesseractJs.anon.PartialRecognizeOptions
import typings.tesseractJs.anon.PartialWorkerParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Worker extends StObject {
  
  def FS(method: String, args: js.Array[Any]): js.Promise[ConfigResult] = js.native
  def FS(method: String, args: js.Array[Any], jobId: String): js.Promise[ConfigResult] = js.native
  
  def detect(image: ImageLike): js.Promise[DetectResult] = js.native
  def detect(image: ImageLike, jobId: String): js.Promise[DetectResult] = js.native
  
  def getImage(`type`: imageType): String = js.native
  
  def getPDF(): js.Promise[GetPDFResult] = js.native
  def getPDF(title: String): js.Promise[GetPDFResult] = js.native
  def getPDF(title: String, textonly: Boolean): js.Promise[GetPDFResult] = js.native
  def getPDF(title: String, textonly: Boolean, jobId: String): js.Promise[GetPDFResult] = js.native
  def getPDF(title: String, textonly: Unit, jobId: String): js.Promise[GetPDFResult] = js.native
  def getPDF(title: Unit, textonly: Boolean): js.Promise[GetPDFResult] = js.native
  def getPDF(title: Unit, textonly: Boolean, jobId: String): js.Promise[GetPDFResult] = js.native
  def getPDF(title: Unit, textonly: Unit, jobId: String): js.Promise[GetPDFResult] = js.native
  
  def initialize(): js.Promise[ConfigResult] = js.native
  def initialize(langs: String): js.Promise[ConfigResult] = js.native
  def initialize(langs: String, oem: Unit, config: String): js.Promise[ConfigResult] = js.native
  def initialize(langs: String, oem: Unit, config: String, jobId: String): js.Promise[ConfigResult] = js.native
  def initialize(langs: String, oem: Unit, config: Unit, jobId: String): js.Promise[ConfigResult] = js.native
  def initialize(langs: String, oem: Unit, config: PartialInitOptions): js.Promise[ConfigResult] = js.native
  def initialize(langs: String, oem: Unit, config: PartialInitOptions, jobId: String): js.Promise[ConfigResult] = js.native
  def initialize(langs: String, oem: OEM): js.Promise[ConfigResult] = js.native
  def initialize(langs: String, oem: OEM, config: String): js.Promise[ConfigResult] = js.native
  def initialize(langs: String, oem: OEM, config: String, jobId: String): js.Promise[ConfigResult] = js.native
  def initialize(langs: String, oem: OEM, config: Unit, jobId: String): js.Promise[ConfigResult] = js.native
  def initialize(langs: String, oem: OEM, config: PartialInitOptions): js.Promise[ConfigResult] = js.native
  def initialize(langs: String, oem: OEM, config: PartialInitOptions, jobId: String): js.Promise[ConfigResult] = js.native
  def initialize(langs: js.Array[Lang]): js.Promise[ConfigResult] = js.native
  def initialize(langs: js.Array[Lang], oem: Unit, config: String): js.Promise[ConfigResult] = js.native
  def initialize(langs: js.Array[Lang], oem: Unit, config: String, jobId: String): js.Promise[ConfigResult] = js.native
  def initialize(langs: js.Array[Lang], oem: Unit, config: Unit, jobId: String): js.Promise[ConfigResult] = js.native
  def initialize(langs: js.Array[Lang], oem: Unit, config: PartialInitOptions): js.Promise[ConfigResult] = js.native
  def initialize(langs: js.Array[Lang], oem: Unit, config: PartialInitOptions, jobId: String): js.Promise[ConfigResult] = js.native
  def initialize(langs: js.Array[Lang], oem: OEM): js.Promise[ConfigResult] = js.native
  def initialize(langs: js.Array[Lang], oem: OEM, config: String): js.Promise[ConfigResult] = js.native
  def initialize(langs: js.Array[Lang], oem: OEM, config: String, jobId: String): js.Promise[ConfigResult] = js.native
  def initialize(langs: js.Array[Lang], oem: OEM, config: Unit, jobId: String): js.Promise[ConfigResult] = js.native
  def initialize(langs: js.Array[Lang], oem: OEM, config: PartialInitOptions): js.Promise[ConfigResult] = js.native
  def initialize(langs: js.Array[Lang], oem: OEM, config: PartialInitOptions, jobId: String): js.Promise[ConfigResult] = js.native
  def initialize(langs: Unit, oem: Unit, config: String): js.Promise[ConfigResult] = js.native
  def initialize(langs: Unit, oem: Unit, config: String, jobId: String): js.Promise[ConfigResult] = js.native
  def initialize(langs: Unit, oem: Unit, config: Unit, jobId: String): js.Promise[ConfigResult] = js.native
  def initialize(langs: Unit, oem: Unit, config: PartialInitOptions): js.Promise[ConfigResult] = js.native
  def initialize(langs: Unit, oem: Unit, config: PartialInitOptions, jobId: String): js.Promise[ConfigResult] = js.native
  def initialize(langs: Unit, oem: OEM): js.Promise[ConfigResult] = js.native
  def initialize(langs: Unit, oem: OEM, config: String): js.Promise[ConfigResult] = js.native
  def initialize(langs: Unit, oem: OEM, config: String, jobId: String): js.Promise[ConfigResult] = js.native
  def initialize(langs: Unit, oem: OEM, config: Unit, jobId: String): js.Promise[ConfigResult] = js.native
  def initialize(langs: Unit, oem: OEM, config: PartialInitOptions): js.Promise[ConfigResult] = js.native
  def initialize(langs: Unit, oem: OEM, config: PartialInitOptions, jobId: String): js.Promise[ConfigResult] = js.native
  
  def load(): js.Promise[ConfigResult] = js.native
  def load(jobId: String): js.Promise[ConfigResult] = js.native
  
  def loadLanguage(): js.Promise[ConfigResult] = js.native
  def loadLanguage(langs: String): js.Promise[ConfigResult] = js.native
  def loadLanguage(langs: String, jobId: String): js.Promise[ConfigResult] = js.native
  def loadLanguage(langs: js.Array[Lang]): js.Promise[ConfigResult] = js.native
  def loadLanguage(langs: js.Array[Lang], jobId: String): js.Promise[ConfigResult] = js.native
  def loadLanguage(langs: Unit, jobId: String): js.Promise[ConfigResult] = js.native
  
  def readText(path: String): js.Promise[ConfigResult] = js.native
  def readText(path: String, jobId: String): js.Promise[ConfigResult] = js.native
  
  def recognize(image: ImageLike): js.Promise[RecognizeResult] = js.native
  def recognize(image: ImageLike, options: Unit, output: Unit, jobId: String): js.Promise[RecognizeResult] = js.native
  def recognize(image: ImageLike, options: Unit, output: PartialOutputFormats): js.Promise[RecognizeResult] = js.native
  def recognize(image: ImageLike, options: Unit, output: PartialOutputFormats, jobId: String): js.Promise[RecognizeResult] = js.native
  def recognize(image: ImageLike, options: PartialRecognizeOptions): js.Promise[RecognizeResult] = js.native
  def recognize(image: ImageLike, options: PartialRecognizeOptions, output: Unit, jobId: String): js.Promise[RecognizeResult] = js.native
  def recognize(image: ImageLike, options: PartialRecognizeOptions, output: PartialOutputFormats): js.Promise[RecognizeResult] = js.native
  def recognize(image: ImageLike, options: PartialRecognizeOptions, output: PartialOutputFormats, jobId: String): js.Promise[RecognizeResult] = js.native
  
  def removeText(path: String): js.Promise[ConfigResult] = js.native
  def removeText(path: String, jobId: String): js.Promise[ConfigResult] = js.native
  
  def setParameters(params: PartialWorkerParams): js.Promise[ConfigResult] = js.native
  def setParameters(params: PartialWorkerParams, jobId: String): js.Promise[ConfigResult] = js.native
  
  def terminate(): js.Promise[ConfigResult] = js.native
  def terminate(jobId: String): js.Promise[ConfigResult] = js.native
  
  def writeText(path: String, text: String): js.Promise[ConfigResult] = js.native
  def writeText(path: String, text: String, jobId: String): js.Promise[ConfigResult] = js.native
}
