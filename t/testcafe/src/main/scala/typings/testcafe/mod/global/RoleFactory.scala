package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoleFactory extends StObject {
  
  def apply(url: String, fn: js.Function1[/* t */ TestController, js.Promise[Any]]): Role = js.native
  def apply(url: String, fn: js.Function1[/* t */ TestController, js.Promise[Any]], options: RoleOptions): Role = js.native
  
  /**
    * Creates an anonymous user role.
    */
  def anonymous(): Role = js.native
}
