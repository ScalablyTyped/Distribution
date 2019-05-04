package typings
package vegaDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataDescription extends js.Object {
  /**
    * An object describing the data source
    */
  var data: js.UndefOr[vegaDashLiteLib.buildSrcDataMod.Data] = js.undefined
  /**
    * Description of this mark for commenting purpose.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name of the visualization for later reference.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Title for the plot.
    */
  var title: js.UndefOr[java.lang.String | vegaDashLiteLib.buildSrcTitleMod.TitleParams] = js.undefined
  /**
    * An array of data transformations such as filter and new field calculation.
    */
  var transform: js.UndefOr[js.Array[vegaDashLiteLib.buildSrcTransformMod.Transform]] = js.undefined
}

object Anon_DataDescription {
  @scala.inline
  def apply(
    data: vegaDashLiteLib.buildSrcDataMod.Data = null,
    description: java.lang.String = null,
    name: java.lang.String = null,
    title: java.lang.String | vegaDashLiteLib.buildSrcTitleMod.TitleParams = null,
    transform: js.Array[vegaDashLiteLib.buildSrcTransformMod.Transform] = null
  ): Anon_DataDescription = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (description != null) __obj.updateDynamic("description")(description)
    if (name != null) __obj.updateDynamic("name")(name)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[Anon_DataDescription]
  }
}

