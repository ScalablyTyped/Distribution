package typings
package vueLib.typesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PropOptions[T] extends js.Object {
  var default: js.UndefOr[T | scala.Null | js.Function0[js.Object]] = js.undefined
  var required: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[Prop[T] | js.Array[Prop[T]]] = js.undefined
  var validator: js.UndefOr[js.Function1[/* value */ T, scala.Boolean]] = js.undefined
}

