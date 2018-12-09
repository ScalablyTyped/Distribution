package typings
package vueDashResourceLib.vuejsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vue extends js.Object {
  @JSName("$http")
  var $http_Original: vueDashResourceLib.Anon_Options = js.native
  @JSName("$resource")
  var $resource_Original: $resource = js.native
  @JSName("$http")
  def $http(options: HttpOptions): js.Thenable[HttpResponse] = js.native
  @JSName("$resource")
  def $resource(url: java.lang.String): ResourceMethods = js.native
  @JSName("$resource")
  def $resource(url: java.lang.String, params: js.Object): ResourceMethods = js.native
  @JSName("$resource")
  def $resource(url: java.lang.String, params: js.Object, actions: js.Any): ResourceMethods = js.native
  @JSName("$resource")
  def $resource(url: java.lang.String, params: js.Object, actions: js.Any, options: HttpOptions): ResourceMethods = js.native
}

