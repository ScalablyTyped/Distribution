package typings.theo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object theoMod {
  import typings.immutable.immutableMod.List
  import typings.immutable.immutableMod.Map
  import typings.immutable.immutableMod.OrderedMap

  type Aliases = OrderedMap[String, Map[String, String | Double]]
  type FormatResultFn = js.Function1[/* result */ ImmutableStyleMap, String]
  type Meta = Map[String, String]
  type Prop = Map[StyleProperty, String | Double]
  type Props = List[Prop]
}
