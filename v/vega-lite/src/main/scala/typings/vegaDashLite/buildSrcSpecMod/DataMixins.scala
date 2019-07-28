package typings.vegaDashLite.buildSrcSpecMod

import typings.vegaDashLite.buildSrcDataMod.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataMixins extends js.Object {
  /**
    * An object describing the data source
    */
  var data: Data
}

object DataMixins {
  @scala.inline
  def apply(data: Data): DataMixins = {
    val __obj = js.Dynamic.literal(data = data)
  
    __obj.asInstanceOf[DataMixins]
  }
}

