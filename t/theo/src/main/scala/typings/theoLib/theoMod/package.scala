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
  type Format = theoLib.theoLibStrings.`custom-propertiesDOTcss` | theoLib.theoLibStrings.cssmodulesDOTcss | theoLib.theoLibStrings.scss | theoLib.theoLibStrings.sass | theoLib.theoLibStrings.less | theoLib.theoLibStrings.styl | theoLib.theoLibStrings.mapDOTcss | theoLib.theoLibStrings.mapDOTvariableDOTscss | theoLib.theoLibStrings.listDOTscss | theoLib.theoLibStrings.moduleDOTjs | theoLib.theoLibStrings.commonDOTjs | theoLib.theoLibStrings.html
  type FormatResultFn = js.Function1[/* result */ ImmutableStyleMap, java.lang.String]
  type Meta = immutableLib.immutableMod.Map[java.lang.String, java.lang.String]
  type Prop = immutableLib.immutableMod.Map[StyleProperty, java.lang.String | scala.Double]
  type Props = immutableLib.immutableMod.List[Prop]
  type StyleProperty = theoLib.theoLibStrings.name | theoLib.theoLibStrings.value | theoLib.theoLibStrings.`type` | theoLib.theoLibStrings.originalValue | theoLib.theoLibStrings.category | theoLib.theoLibStrings.comment | theoLib.theoLibStrings.meta
  type Transform = theoLib.theoLibStrings.raw | theoLib.theoLibStrings.ios | theoLib.theoLibStrings.android | theoLib.theoLibStrings.web
  type ValueTransform = theoLib.theoLibStrings.`color/rgb` | theoLib.theoLibStrings.`color/hex` | theoLib.theoLibStrings.`color/hex8rgba` | theoLib.theoLibStrings.`color/hex8argb` | theoLib.theoLibStrings.`percentage/float` | theoLib.theoLibStrings.`relative/pixel` | theoLib.theoLibStrings.`relative/pixelValue`
}
