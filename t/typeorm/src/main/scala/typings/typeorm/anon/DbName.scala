package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DbName extends StObject {
  
  var dbName: js.UndefOr[String] = js.undefined
}
object DbName {
  
  @scala.inline
  def apply(): DbName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DbName]
  }
  
  @scala.inline
  implicit class DbNameMutableBuilder[Self <: DbName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDbName(value: String): Self = StObject.set(x, "dbName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbNameUndefined: Self = StObject.set(x, "dbName", js.undefined)
  }
}
