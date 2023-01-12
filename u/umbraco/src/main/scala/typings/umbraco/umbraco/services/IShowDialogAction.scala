package typings.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Show dialog action
  */
trait IShowDialogAction extends StObject {
  
  var alias: String
  
  var name: String
}
object IShowDialogAction {
  
  inline def apply(alias: String, name: String): IShowDialogAction = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShowDialogAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IShowDialogAction] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
