package typings
package toDashSemverLib.toDashSemverMod.toSemverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Clean versions. For example `v1.3.0` → `1.3.0`.
    * @default true
    */
  var clean: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Include prereleases, like `1.2.3-alpha.3`.
    * @default true
    */
  var includePrereleases: js.UndefOr[scala.Boolean] = js.undefined
}

