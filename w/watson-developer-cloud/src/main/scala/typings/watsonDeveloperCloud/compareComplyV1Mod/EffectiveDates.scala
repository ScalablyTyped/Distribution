package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An effective date. */
@js.native
trait EffectiveDates extends StObject {
  
  /** The confidence level in the identification of the effective date. */
  var confidence_level: js.UndefOr[String] = js.native
  
  /** The numeric location of the identified element in the document, represented with two integers labeled `begin` and `end`. */
  var location: js.UndefOr[Location] = js.native
  
  /** The effective date, listed as a string. */
  var text: js.UndefOr[String] = js.native
}
object EffectiveDates {
  
  @scala.inline
  def apply(): EffectiveDates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EffectiveDates]
  }
  
  @scala.inline
  implicit class EffectiveDatesMutableBuilder[Self <: EffectiveDates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfidence_level(value: String): Self = StObject.set(x, "confidence_level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidence_levelUndefined: Self = StObject.set(x, "confidence_level", js.undefined)
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
