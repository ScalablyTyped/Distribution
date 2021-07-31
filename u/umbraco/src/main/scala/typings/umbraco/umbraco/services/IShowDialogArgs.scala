package typings.umbraco.umbraco.services

import typings.angular.mod.IScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Show dialog args
  */
trait IShowDialogArgs extends StObject {
  
  var action: IShowDialogAction
  
  var scope: IScope
}
object IShowDialogArgs {
  
  @scala.inline
  def apply(action: IShowDialogAction, scope: IScope): IShowDialogArgs = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShowDialogArgs]
  }
  
  @scala.inline
  implicit class IShowDialogArgsMutableBuilder[Self <: IShowDialogArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: IShowDialogAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: IScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
