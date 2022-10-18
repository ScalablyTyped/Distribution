package typings.webpack.mod

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConstDependency
  extends StObject
     with Dependency {
  
  var expression: String = js.native
  
  var range: Double | (js.Tuple2[Double, Double]) = js.native
  
  var runtimeRequirements: Null | Set[String] = js.native
}
object ConstDependency {
  
  /* was `typeof ConstDependencyTemplate` */
  type Template = ConstDependencyTemplate
}
