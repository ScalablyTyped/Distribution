package typings.wordpressComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Describedby extends StObject {
  
  /**
    * If this property is added, it will be added to the modal content
    * div as aria-describedby.
    */
  var describedby: js.UndefOr[String] = js.native
  
  /**
    * If this property is added, it will be added to the modal content
    * div as aria-labelledby. You are encouraged to use this when the
    * modal is visually labelled.
    * @defaultValue "modal-heading"
    */
  var labelledby: js.UndefOr[String] = js.native
}
object Describedby {
  
  @scala.inline
  def apply(): Describedby = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Describedby]
  }
  
  @scala.inline
  implicit class DescribedbyMutableBuilder[Self <: Describedby] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescribedby(value: String): Self = StObject.set(x, "describedby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescribedbyUndefined: Self = StObject.set(x, "describedby", js.undefined)
    
    @scala.inline
    def setLabelledby(value: String): Self = StObject.set(x, "labelledby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelledbyUndefined: Self = StObject.set(x, "labelledby", js.undefined)
  }
}
