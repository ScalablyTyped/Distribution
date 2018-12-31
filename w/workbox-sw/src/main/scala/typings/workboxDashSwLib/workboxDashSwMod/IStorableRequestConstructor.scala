package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Accepts a URL and RequestInit dictionary that can be used to create a
  * new Request object. A timestamp is also generated so consumers can
  * reference when the object was created.
  */
@js.native
trait IStorableRequestConstructor
  extends org.scalablytyped.runtime.Instantiable1[/* options */ IStorableRequestOptions, StorableRequest] {
  def fromRequest(request: stdLib.Request): StorableRequest = js.native
}

