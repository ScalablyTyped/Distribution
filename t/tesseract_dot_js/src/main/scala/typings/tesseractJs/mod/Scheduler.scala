package typings.tesseractJs.mod

import typings.std.Parameters
import typings.tesseractJs.anon.PartialOutputFormats
import typings.tesseractJs.anon.PartialRecognizeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scheduler extends StObject {
  
  @JSName("addJob")
  def addJob_detect(
    action: typings.tesseractJs.tesseractJsStrings.detect,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Worker['detect']> is not an array type */ args: Parameters[
      js.Function2[/* image */ ImageLike, /* jobId */ js.UndefOr[String], js.Promise[DetectResult]]
    ]
  ): js.Promise[DetectResult] = js.native
  @JSName("addJob")
  def addJob_recognize(
    action: typings.tesseractJs.tesseractJsStrings.recognize,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Worker['recognize']> is not an array type */ args: Parameters[
      js.Function4[
        /* image */ ImageLike, 
        /* options */ js.UndefOr[PartialRecognizeOptions], 
        /* output */ js.UndefOr[PartialOutputFormats], 
        /* jobId */ js.UndefOr[String], 
        js.Promise[RecognizeResult]
      ]
    ]
  ): js.Promise[RecognizeResult] = js.native
  
  def addWorker(worker: Worker): String = js.native
  
  def getNumWorkers(): Double = js.native
  
  def getQueueLen(): Double = js.native
  
  def terminate(): js.Promise[Any] = js.native
}
