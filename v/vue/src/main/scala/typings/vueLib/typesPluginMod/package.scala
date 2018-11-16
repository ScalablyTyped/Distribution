package typings
package vueLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesPluginMod {
  type PluginFunction[T] = js.Function2[
    /* Vue */ vueLib.typesVueMod.VueConstructor[vueLib.typesVueMod.Vue], 
    /* options */ js.UndefOr[T], 
    scala.Unit
  ]
}
