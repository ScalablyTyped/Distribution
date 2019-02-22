package typings
package swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialMod.BaseSchema because var conflicts: description. Inlined format, title, default, multipleOf, maximum, exclusiveMaximum, minimum, exclusiveMinimum, maxLength, minLength, pattern, maxItems, minItems, uniqueItems, maxProperties, minProperties, enum, `type`, items */ trait PathParameter extends BaseParameter {
  var default: js.UndefOr[java.lang.String | scala.Boolean | scala.Double | js.Object] = js.undefined
  var enum: js.UndefOr[js.Array[java.lang.String | scala.Boolean | scala.Double | js.Object]] = js.undefined
  var exclusiveMaximum: js.UndefOr[scala.Boolean] = js.undefined
  var exclusiveMinimum: js.UndefOr[scala.Boolean] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  @JSName("in")
  var in_PathParameter: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.path
  var items: js.UndefOr[Schema | js.Array[Schema]] = js.undefined
  var maxItems: js.UndefOr[scala.Double] = js.undefined
  var maxLength: js.UndefOr[scala.Double] = js.undefined
  var maxProperties: js.UndefOr[scala.Double] = js.undefined
  var maximum: js.UndefOr[scala.Double] = js.undefined
  var minItems: js.UndefOr[scala.Double] = js.undefined
  var minLength: js.UndefOr[scala.Double] = js.undefined
  var minProperties: js.UndefOr[scala.Double] = js.undefined
  var minimum: js.UndefOr[scala.Double] = js.undefined
  var multipleOf: js.UndefOr[scala.Double] = js.undefined
  var pattern: js.UndefOr[java.lang.String] = js.undefined
  @JSName("required")
  var required_PathParameter: scala.Boolean
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String | js.UndefOr[java.lang.String]
  var uniqueItems: js.UndefOr[scala.Boolean] = js.undefined
}

