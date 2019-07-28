package typings.theo

import typings.immutable.immutableMod.List
import typings.immutable.immutableMod.Map
import typings.immutable.immutableMod.OrderedMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object theoMod {
  type Aliases = OrderedMap[String, Map[String, String | Double]]
  type FormatResultFn = js.Function1[/* result */ ImmutableStyleMap, String]
  type Meta = Map[String, String]
  type Prop = Map[StyleProperty, String | Double]
  type Props = List[Prop]
}
