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
  
  @scala.inline
  def apply(alias: String, name: String): IShowDialogAction = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShowDialogAction]
  }
  
  @scala.inline
  implicit class IShowDialogActionMutableBuilder[Self <: IShowDialogAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
