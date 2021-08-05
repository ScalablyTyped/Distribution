package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DbName extends StObject {
  
  var dbName: js.UndefOr[String] = js.undefined
}
object DbName {
  
  inline def apply(): DbName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DbName]
  }
  
  extension [Self <: DbName](x: Self) {
    
    inline def setDbName(value: String): Self = StObject.set(x, "dbName", value.asInstanceOf[js.Any])
    
    inline def setDbNameUndefined: Self = StObject.set(x, "dbName", js.undefined)
  }
}
