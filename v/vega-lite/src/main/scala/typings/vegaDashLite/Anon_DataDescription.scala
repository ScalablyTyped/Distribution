package typings.vegaDashLite

import typings.vegaDashLite.buildSrcDataMod.Data
import typings.vegaDashLite.buildSrcTitleMod.TitleParams
import typings.vegaDashLite.buildSrcTransformMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataDescription extends js.Object {
  /**
    * An object describing the data source
    */
  var data: js.UndefOr[Data] = js.undefined
  /**
    * Description of this mark for commenting purpose.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Name of the visualization for later reference.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Title for the plot.
    */
  var title: js.UndefOr[String | TitleParams] = js.undefined
  /**
    * An array of data transformations such as filter and new field calculation.
    */
  var transform: js.UndefOr[js.Array[Transform]] = js.undefined
}

object Anon_DataDescription {
  @scala.inline
  def apply(
    data: Data = null,
    description: String = null,
    name: String = null,
    title: String | TitleParams = null,
    transform: js.Array[Transform] = null
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

