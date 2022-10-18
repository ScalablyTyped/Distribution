package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** XPathPatterns. */
trait XPathPatterns extends StObject {
  
  /** An array to XPaths. */
  var xpaths: js.UndefOr[js.Array[String]] = js.undefined
}
object XPathPatterns {
  
  inline def apply(): XPathPatterns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XPathPatterns]
  }
  
  extension [Self <: XPathPatterns](x: Self) {
    
    inline def setXpaths(value: js.Array[String]): Self = StObject.set(x, "xpaths", value.asInstanceOf[js.Any])
    
    inline def setXpathsUndefined: Self = StObject.set(x, "xpaths", js.undefined)
    
    inline def setXpathsVarargs(value: String*): Self = StObject.set(x, "xpaths", js.Array(value*))
  }
}
