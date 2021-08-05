package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** RSS or ATOM feed found on the webpage. */
trait Feed extends StObject {
  
  /** URL of the RSS or ATOM feed. */
  var link: js.UndefOr[String] = js.undefined
}
object Feed {
  
  inline def apply(): Feed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Feed]
  }
  
  extension [Self <: Feed](x: Self) {
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
  }
}
