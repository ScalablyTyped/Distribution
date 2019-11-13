package typings.vegaDashTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesSpecConfigMod {
  import typings.std.Record
  import typings.vegaDashTypings.typesSpecAxisMod.BaseAxis
  import typings.vegaDashTypings.typesSpecProjectionMod.BaseProjection
  import typings.vegaDashTypings.typesSpecStreamMod.EventType
  import typings.vegaDashTypings.typesSpecTitleMod.BaseTitle
  import typings.vegaDashTypings.vegaDashTypingsStrings.allow
  import typings.vegaDashTypings.vegaDashTypingsStrings.mark
  import typings.vegaDashTypings.vegaDashTypingsStrings.prevent

  type AxisConfig = BaseAxis
  type DefaultsConfig = Record[prevent | allow, Boolean | js.Array[EventType]]
  type MarkConfigKeys = mark | (/* import warning: ImportType.apply Failed type conversion: vega-typings.vega-typings/types/spec/mark.Mark['type'] */ js.Any)
  type ProjectionConfig = BaseProjection
  type TitleConfig = BaseTitle
}
