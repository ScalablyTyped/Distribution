package typings.theo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object theoMod {
  import typings.immutable.Immutable.List
  import typings.immutable.Immutable.Map
  import typings.immutable.Immutable.OrderedMap

  type Aliases = OrderedMap[String, Map[String, String | Double]]
  type FormatResultFn = js.Function1[/* result */ ImmutableStyleMap, String]
  type Meta = Map[String, String]
  type Prop = Map[StyleProperty, String | Double]
  type Props = List[Prop]
}
