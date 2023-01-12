package typings.tesseractJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerOptions extends StObject {
  
  var cacheMethod: String
  
  var cachePath: String
  
  var corePath: String
  
  var dataPath: String
  
  def errorHandler(arg: Any): Unit
  
  var gzip: Boolean
  
  var langPath: String
  
  def logger(arg: Any): Unit
  
  var workerBlobURL: Boolean
  
  var workerPath: String
}
object WorkerOptions {
  
  inline def apply(
    cacheMethod: String,
    cachePath: String,
    corePath: String,
    dataPath: String,
    errorHandler: Any => Unit,
    gzip: Boolean,
    langPath: String,
    logger: Any => Unit,
    workerBlobURL: Boolean,
    workerPath: String
  ): WorkerOptions = {
    val __obj = js.Dynamic.literal(cacheMethod = cacheMethod.asInstanceOf[js.Any], cachePath = cachePath.asInstanceOf[js.Any], corePath = corePath.asInstanceOf[js.Any], dataPath = dataPath.asInstanceOf[js.Any], errorHandler = js.Any.fromFunction1(errorHandler), gzip = gzip.asInstanceOf[js.Any], langPath = langPath.asInstanceOf[js.Any], logger = js.Any.fromFunction1(logger), workerBlobURL = workerBlobURL.asInstanceOf[js.Any], workerPath = workerPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkerOptions] (val x: Self) extends AnyVal {
    
    inline def setCacheMethod(value: String): Self = StObject.set(x, "cacheMethod", value.asInstanceOf[js.Any])
    
    inline def setCachePath(value: String): Self = StObject.set(x, "cachePath", value.asInstanceOf[js.Any])
    
    inline def setCorePath(value: String): Self = StObject.set(x, "corePath", value.asInstanceOf[js.Any])
    
    inline def setDataPath(value: String): Self = StObject.set(x, "dataPath", value.asInstanceOf[js.Any])
    
    inline def setErrorHandler(value: Any => Unit): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1(value))
    
    inline def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
    
    inline def setLangPath(value: String): Self = StObject.set(x, "langPath", value.asInstanceOf[js.Any])
    
    inline def setLogger(value: Any => Unit): Self = StObject.set(x, "logger", js.Any.fromFunction1(value))
    
    inline def setWorkerBlobURL(value: Boolean): Self = StObject.set(x, "workerBlobURL", value.asInstanceOf[js.Any])
    
    inline def setWorkerPath(value: String): Self = StObject.set(x, "workerPath", value.asInstanceOf[js.Any])
  }
}
