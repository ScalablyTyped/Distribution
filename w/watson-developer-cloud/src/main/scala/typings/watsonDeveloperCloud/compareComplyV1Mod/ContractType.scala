package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The contract type identified in the input document. */
@js.native
trait ContractType extends StObject {
  
  /** The confidence level in the identification of the termination date. */
  var confidence_level: js.UndefOr[String] = js.native
  
  /** The numeric location of the identified element in the document, represented with two integers labeled `begin` and `end`. */
  var location: js.UndefOr[Location] = js.native
  
  /** The contract type. */
  var text: js.UndefOr[String] = js.native
}
object ContractType {
  
  @scala.inline
  def apply(): ContractType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContractType]
  }
  
  @scala.inline
  implicit class ContractTypeMutableBuilder[Self <: ContractType] (val x: Self) extends AnyVal {
    
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
