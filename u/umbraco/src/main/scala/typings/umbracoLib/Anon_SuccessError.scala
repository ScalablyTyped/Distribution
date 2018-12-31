package typings
package umbracoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SuccessError[T] extends js.Object {
  var error: angularLib.angularMod.angularNs.IHttpPromiseCallback[umbracoLib.umbracoMod.resourcesNs.IResourcePromise]
  var success: angularLib.angularMod.angularNs.IHttpPromiseCallback[T]
}

