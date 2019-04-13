package typings
package victoryLib.victoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Common properties for all data components
  */
trait VictoryDatableProps extends js.Object {
  /**
    * The categories prop specifies how categorical data for a chart should be ordered.
    * This prop should be given as an array of string values, or an object with
    * these arrays of values specified for x and y. If this prop is not set,
    * categorical data will be plotted in the order it was given in the data array
    * @example ["dogs", "cats", "mice"]
    */
  var categories: js.UndefOr[CategoryPropType] = js.undefined
  /**
    * The data prop specifies the data to be plotted. Data should be in the form of an array
    * of data points, or an array of arrays of data points for multiple datasets.
    * Each data point may be any format you wish (depending on the `x` and `y` accessor props),
    * but by default, an object with x and y properties is expected.
    * @example [{x: 1, y: 2}, {x: 2, y: 3}], [[1, 2], [2, 3]],
    * [[{x: "a", y: 1}, {x: "b", y: 2}], [{x: "a", y: 2}, {x: "b", y: 3}]]
    */
  var data: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * The dataComponent prop takes an entire component which will be used to create an area.
    * The new element created from the passed dataComponent will be provided with the
    * following properties calculated by VictoryArea: a scale, style, events, interpolation,
    * and an array of modified data objects (including x, y, and calculated y0 and y1).
    * Any of these props may be overridden by passing in props to the supplied component,
    * or modified or ignored within the custom component itself. If a dataComponent is
    * not provided, VictoryArea will use its default Area component.
    * @default <Area/>
    */
  var dataComponent: js.UndefOr[reactLib.reactMod.ReactElement[_]] = js.undefined
  /**
    * The domain prop describes the range of values your chart will cover. This prop can be
    * given as a array of the minimum and maximum expected values for your bar chart,
    * or as an object that specifies separate arrays for x and y.
    * If this prop is not provided, a domain will be calculated from data, or other
    * available information.
    * @example [-1, 1], {x: [0, 100], y: [0, 1]}
    */
  var domain: js.UndefOr[DomainPropType] = js.undefined
  /**
    * The x prop specifies how to access the X value of each data point.
    * If given as a function, it will be run on each data point, and returned value will be used.
    * If given as an integer, it will be used as an array index for array-type data points.
    * If given as a string, it will be used as a property key for object-type data points.
    * If given as an array of strings, or a string containing dots or brackets,
    * it will be used as a nested object property path (for details see Lodash docs for _.get).
    * If `null` or `undefined`, the data value will be used as is (identity function/pass-through).
    * @example 0, 'x', 'x.value.nested.1.thing', 'x[2].also.nested', null, d => Math.sin(d)
    * @default "x"
    */
  var x: js.UndefOr[DataGetterPropType] = js.undefined
  /**
    * The y prop specifies how to access the Y value of each data point.
    * If given as a function, it will be run on each data point, and returned value will be used.
    * If given as an integer, it will be used as an array index for array-type data points.
    * If given as a string, it will be used as a property key for object-type data points.
    * If given as an array of strings, or a string containing dots or brackets,
    * it will be used as a nested object property path (for details see Lodash docs for _.get).
    * If `null` or `undefined`, the data value will be used as is (identity function/pass-through).
    * @example 0, 'y', 'y.value.nested.1.thing', 'y[2].also.nested', null, d => Math.sin(d)
    * @default "y"
    */
  var y: js.UndefOr[DataGetterPropType] = js.undefined
}

object VictoryDatableProps {
  @scala.inline
  def apply(
    categories: CategoryPropType = null,
    data: js.Array[_] = null,
    dataComponent: reactLib.reactMod.ReactElement[_] = null,
    domain: DomainPropType = null,
    x: DataGetterPropType = null,
    y: DataGetterPropType = null
  ): VictoryDatableProps = {
    val __obj = js.Dynamic.literal()
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (dataComponent != null) __obj.updateDynamic("dataComponent")(dataComponent)
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[VictoryDatableProps]
  }
}

