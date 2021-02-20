package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** XPathPatterns. */
@js.native
trait XPathPatterns extends StObject {
  
  /** An array to XPaths. */
  var xpaths: js.UndefOr[js.Array[String]] = js.native
}
object XPathPatterns {
  
  @scala.inline
  def apply(): XPathPatterns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XPathPatterns]
  }
  
  @scala.inline
  implicit class XPathPatternsMutableBuilder[Self <: XPathPatterns] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setXpaths(value: js.Array[String]): Self = StObject.set(x, "xpaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXpathsUndefined: Self = StObject.set(x, "xpaths", js.undefined)
    
    @scala.inline
    def setXpathsVarargs(value: String*): Self = StObject.set(x, "xpaths", js.Array(value :_*))
  }
}
