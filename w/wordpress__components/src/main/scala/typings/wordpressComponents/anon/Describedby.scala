package typings.wordpressComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Describedby extends StObject {
  
  /**
    * If this property is added, it will be added to the modal content
    * div as aria-describedby.
    */
  var describedby: js.UndefOr[String] = js.undefined
  
  /**
    * If this property is added, it will be added to the modal content
    * div as aria-labelledby. You are encouraged to use this when the
    * modal is visually labelled.
    * @defaultValue "modal-heading"
    */
  var labelledby: js.UndefOr[String] = js.undefined
}
object Describedby {
  
  inline def apply(): Describedby = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Describedby]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Describedby] (val x: Self) extends AnyVal {
    
    inline def setDescribedby(value: String): Self = StObject.set(x, "describedby", value.asInstanceOf[js.Any])
    
    inline def setDescribedbyUndefined: Self = StObject.set(x, "describedby", js.undefined)
    
    inline def setLabelledby(value: String): Self = StObject.set(x, "labelledby", value.asInstanceOf[js.Any])
    
    inline def setLabelledbyUndefined: Self = StObject.set(x, "labelledby", js.undefined)
  }
}
