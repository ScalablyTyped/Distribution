package typings.tabris.mod

import typings.tabris.AnonFont
import typings.tabris.AnonWidth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "SizeMeasurement")
@js.native
class SizeMeasurement_ protected () extends NativeObject {
  /**
    * Measures the given text. The method returns a `Promise` which resolves to an array of `{width:
    * number, height: number}`.
    * @param configs The text configurations to measure. A text configuration has to provide at least a `text` and `fontSize` property.
    * @provisional
    */
  def measureTexts(configs: js.Array[AnonFont]): js.Promise[AnonWidth] = js.native
  /**
    * Measures the given text. The method returns an array of `{width: number, height: number}`.
    * @param configs The text configurations to measure. A text configuration has to provide at least a `text` and `fontSize` property.
    * @provisional
    */
  def measureTextsSync(configs: js.Array[AnonFont]): js.Array[AnonWidth] = js.native
}

