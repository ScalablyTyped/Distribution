package typings.tesseractJs.mod

import typings.node.bufferMod.global.Buffer
import typings.std.Blob
import typings.std.CanvasRenderingContext2D
import typings.std.File
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.ImageData
import typings.tesseractJs.anon.PartialWorkerOptions
import typings.tesseractJs.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def createScheduler(): Scheduler = ^.asInstanceOf[js.Dynamic].applyDynamic("createScheduler")().asInstanceOf[Scheduler]

inline def createWorker(): js.Promise[Worker] = ^.asInstanceOf[js.Dynamic].applyDynamic("createWorker")().asInstanceOf[js.Promise[Worker]]
inline def createWorker(options: PartialWorkerOptions): js.Promise[Worker] = ^.asInstanceOf[js.Dynamic].applyDynamic("createWorker")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Worker]]

inline def detect(image: ImageLike): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("detect")(image.asInstanceOf[js.Any]).asInstanceOf[Any]
inline def detect(image: ImageLike, options: PartialWorkerOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("detect")(image.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def recognize(image: ImageLike): js.Promise[RecognizeResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("recognize")(image.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RecognizeResult]]
inline def recognize(image: ImageLike, langs: String): js.Promise[RecognizeResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("recognize")(image.asInstanceOf[js.Any], langs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RecognizeResult]]
inline def recognize(image: ImageLike, langs: String, options: PartialWorkerOptions): js.Promise[RecognizeResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("recognize")(image.asInstanceOf[js.Any], langs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RecognizeResult]]
inline def recognize(image: ImageLike, langs: Unit, options: PartialWorkerOptions): js.Promise[RecognizeResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("recognize")(image.asInstanceOf[js.Any], langs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RecognizeResult]]

inline def setLogging(logging: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogging")(logging.asInstanceOf[js.Any]).asInstanceOf[Unit]

type ImageLike = String | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | CanvasRenderingContext2D | File | Blob | ImageData | Buffer
