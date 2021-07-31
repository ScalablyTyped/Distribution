package typings.webgme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableCustomConstraints extends StObject {
  
  // GmeClasses.Core;
  /**
    * If true will enable validation (which takes place on the server) 
    * of custom constraints defined in the meta nodes.
    *   config.core.enableCustomConstraints = false;
    */
  var enableCustomConstraints: Boolean
}
object EnableCustomConstraints {
  
  @scala.inline
  def apply(enableCustomConstraints: Boolean): EnableCustomConstraints = {
    val __obj = js.Dynamic.literal(enableCustomConstraints = enableCustomConstraints.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableCustomConstraints]
  }
  
  @scala.inline
  implicit class EnableCustomConstraintsMutableBuilder[Self <: EnableCustomConstraints] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableCustomConstraints(value: Boolean): Self = StObject.set(x, "enableCustomConstraints", value.asInstanceOf[js.Any])
  }
}
