package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentFront extends StObject {
  
  /**
    * An identifying document, either a passport or local ID card.
    */
  var document: Front
}
object DocumentFront {
  
  @scala.inline
  def apply(document: Front): DocumentFront = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentFront]
  }
  
  @scala.inline
  implicit class DocumentFrontMutableBuilder[Self <: DocumentFront] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument(value: Front): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
  }
}
