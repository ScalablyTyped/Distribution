package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attachment extends StObject {
  
  var attachment: scala.Double
  
  var changeEntry: scala.Double
}
object Attachment {
  
  inline def apply(attachment: scala.Double, changeEntry: scala.Double): Attachment = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any], changeEntry = changeEntry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachment]
  }
  
  extension [Self <: Attachment](x: Self) {
    
    inline def setAttachment(value: scala.Double): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
    
    inline def setChangeEntry(value: scala.Double): Self = StObject.set(x, "changeEntry", value.asInstanceOf[js.Any])
  }
}
