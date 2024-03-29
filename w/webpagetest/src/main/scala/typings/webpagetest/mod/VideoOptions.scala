package typings.webpagetest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoOptions extends StObject {
  
  /** frame comparison end point: [visual]=visually complete | all=last change | doc=document complete | full=fully loaded */
  var comparisonEndPoint: js.UndefOr[String] = js.undefined
}
object VideoOptions {
  
  inline def apply(): VideoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoOptions] (val x: Self) extends AnyVal {
    
    inline def setComparisonEndPoint(value: String): Self = StObject.set(x, "comparisonEndPoint", value.asInstanceOf[js.Any])
    
    inline def setComparisonEndPointUndefined: Self = StObject.set(x, "comparisonEndPoint", js.undefined)
  }
}
