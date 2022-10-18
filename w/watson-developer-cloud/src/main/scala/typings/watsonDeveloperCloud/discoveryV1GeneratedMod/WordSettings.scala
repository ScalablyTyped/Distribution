package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A list of Word conversion settings. */
trait WordSettings extends StObject {
  
  var heading: js.UndefOr[WordHeadingDetection] = js.undefined
}
object WordSettings {
  
  inline def apply(): WordSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WordSettings]
  }
  
  extension [Self <: WordSettings](x: Self) {
    
    inline def setHeading(value: WordHeadingDetection): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
  }
}
