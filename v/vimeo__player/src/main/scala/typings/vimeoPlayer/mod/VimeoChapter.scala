package typings.vimeoPlayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VimeoChapter extends StObject {
  
  /**
    * The `index` property of each chapter is the place it holds in the order of all the chapters. It starts at 1.
    */
  var index: Double
  
  var startTime: Double
  
  var title: String
}
object VimeoChapter {
  
  inline def apply(index: Double, startTime: Double, title: String): VimeoChapter = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[VimeoChapter]
  }
  
  extension [Self <: VimeoChapter](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
