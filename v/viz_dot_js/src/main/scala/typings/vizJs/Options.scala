package typings.vizJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var engine: js.UndefOr[String] = js.undefined
  
  var files: js.UndefOr[js.Array[String]] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var images: js.UndefOr[js.Array[String]] = js.undefined
  
  var yInvert: js.UndefOr[Boolean] = js.undefined
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
    
    @scala.inline
    def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setImages(value: js.Array[String]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    @scala.inline
    def setImagesVarargs(value: String*): Self = StObject.set(x, "images", js.Array(value :_*))
    
    @scala.inline
    def setYInvert(value: Boolean): Self = StObject.set(x, "yInvert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYInvertUndefined: Self = StObject.set(x, "yInvert", js.undefined)
  }
}
