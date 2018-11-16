package typings
package vueLib.typesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ComputedOptions[T] extends js.Object {
  var cache: js.UndefOr[scala.Boolean] = js.undefined
  var get: js.UndefOr[js.Function0[T]] = js.undefined
  var set: js.UndefOr[js.Function1[/* value */ T, scala.Unit]] = js.undefined
}

