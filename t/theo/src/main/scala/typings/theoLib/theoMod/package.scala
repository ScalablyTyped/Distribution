package typings
package theoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object theoMod {
  type Aliases = immutableLib.immutableMod.OrderedMap[
    java.lang.String, 
    immutableLib.immutableMod.Map[java.lang.String, java.lang.String | scala.Double]
  ]
  type FormatResultFn = js.Function1[/* result */ ImmutableStyleMap, java.lang.String]
  type Meta = immutableLib.immutableMod.Map[java.lang.String, java.lang.String]
  type Prop = immutableLib.immutableMod.Map[StyleProperty, java.lang.String | scala.Double]
  type Props = immutableLib.immutableMod.List[Prop]
}
