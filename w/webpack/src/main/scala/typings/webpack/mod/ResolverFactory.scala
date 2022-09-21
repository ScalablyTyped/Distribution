package typings.webpack.mod

import typings.std.Map
import typings.webpack.anon.ReadonlyresolveOptionsHoo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolverFactory extends StObject {
  
  var cache: Map[String, ResolverCache] = js.native
  
  def get(`type`: String): ResolverWithOptions = js.native
  def get(`type`: String, resolveOptions: ResolveOptionsWithDependencyType): ResolverWithOptions = js.native
  
  var hooks: ReadonlyresolveOptionsHoo = js.native
}
