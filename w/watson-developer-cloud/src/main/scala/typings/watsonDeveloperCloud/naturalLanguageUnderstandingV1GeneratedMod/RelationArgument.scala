package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** RelationArgument. */
trait RelationArgument extends StObject {
  
  /** An array of extracted entities. */
  var entities: js.UndefOr[js.Array[RelationEntity]] = js.undefined
  
  /** Character offsets indicating the beginning and end of the mention in the analyzed text. */
  var location: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** Text that corresponds to the argument. */
  var text: js.UndefOr[String] = js.undefined
}
object RelationArgument {
  
  inline def apply(): RelationArgument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationArgument]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelationArgument] (val x: Self) extends AnyVal {
    
    inline def setEntities(value: js.Array[RelationEntity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    inline def setEntitiesVarargs(value: RelationEntity*): Self = StObject.set(x, "entities", js.Array(value*))
    
    inline def setLocation(value: js.Array[Double]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLocationVarargs(value: Double*): Self = StObject.set(x, "location", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
