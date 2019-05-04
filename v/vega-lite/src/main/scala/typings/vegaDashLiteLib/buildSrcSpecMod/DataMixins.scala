package typings
package vegaDashLiteLib.buildSrcSpecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataMixins extends js.Object {
  /**
    * An object describing the data source
    */
  var data: vegaDashLiteLib.buildSrcDataMod.Data
}

object DataMixins {
  @scala.inline
  def apply(data: vegaDashLiteLib.buildSrcDataMod.Data): DataMixins = {
    val __obj = js.Dynamic.literal(data = data)
  
    __obj.asInstanceOf[DataMixins]
  }
}

