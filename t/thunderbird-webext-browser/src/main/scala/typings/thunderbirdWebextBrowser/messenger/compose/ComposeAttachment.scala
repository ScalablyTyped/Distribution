package typings.thunderbirdWebextBrowser.messenger.compose

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComposeAttachment extends StObject {
  
  /** A unique identifier for this attachment. */
  var id: Double
  
  /** The name of this attachment, as displayed to the user. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The size in bytes of this attachment. Read-only. */
  var size: js.UndefOr[Double] = js.undefined
}
object ComposeAttachment {
  
  inline def apply(id: Double): ComposeAttachment = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposeAttachment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComposeAttachment] (val x: Self) extends AnyVal {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
