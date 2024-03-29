package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Revision extends StObject {
  
  var end: Double
  
  var revision: Double
  
  var start: Double
}
object Revision {
  
  inline def apply(end: Double, revision: Double, start: Double): Revision = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Revision]
  }
  
  extension [Self <: Revision](x: Self) {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
