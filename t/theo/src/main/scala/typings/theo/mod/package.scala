package typings.theo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Aliases = typings.immutable.Immutable.OrderedMap[
    java.lang.String, 
    typings.immutable.Immutable.Map[java.lang.String, java.lang.String | scala.Double]
  ]
  type FormatResultFn = js.Function1[/* result */ typings.theo.mod.ImmutableStyleMap, java.lang.String]
  type Meta = typings.immutable.Immutable.Map[java.lang.String, java.lang.String]
  type Prop = typings.immutable.Immutable.Map[typings.theo.mod.StyleProperty, java.lang.String | scala.Double]
  type Props = typings.immutable.Immutable.List[typings.theo.mod.Prop]
}
