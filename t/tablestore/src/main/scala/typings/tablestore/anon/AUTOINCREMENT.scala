package typings.tablestore.anon

import typings.tablestore.tablestoreInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AUTOINCREMENT extends StObject {
  
  var AUTO_INCREMENT: `1`
}
object AUTOINCREMENT {
  
  inline def apply(): AUTOINCREMENT = {
    val __obj = js.Dynamic.literal(AUTO_INCREMENT = 1)
    __obj.asInstanceOf[AUTOINCREMENT]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AUTOINCREMENT] (val x: Self) extends AnyVal {
    
    inline def setAUTO_INCREMENT(value: `1`): Self = StObject.set(x, "AUTO_INCREMENT", value.asInstanceOf[js.Any])
  }
}
