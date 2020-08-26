package typings.wouter.staticLocationMod

import typings.wouter.anon.ReadonlyArrayPath
import typings.wouter.useLocationMod.LocationHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticLocationHook extends LocationHook {
  var history: ReadonlyArrayPath = js.native
}

