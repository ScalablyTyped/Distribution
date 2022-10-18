package typings.webpack.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleDependency
  extends StObject
     with Dependency {
  
  var assertions: js.UndefOr[Record[String, Any]] = js.native
  
  var range: Any = js.native
  
  var request: String = js.native
  
  var userRequest: String = js.native
}
object ModuleDependency {
  
  /* was `typeof DependencyTemplate` */
  type Template = DependencyTemplate
}
