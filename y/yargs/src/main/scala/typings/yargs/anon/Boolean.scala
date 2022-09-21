package typings.yargs.anon

import typings.yargs.yargsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Boolean extends StObject {
  
  var boolean: `true`
}
object Boolean {
  
  inline def apply(): Boolean = {
    val __obj = js.Dynamic.literal(boolean = true)
    __obj.asInstanceOf[Boolean]
  }
  
  extension [Self <: Boolean](x: Self) {
    
    inline def setBoolean(value: `true`): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
  }
}
