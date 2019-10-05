package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiCreateTemplateRenderer")
@js.native
object nlapiCreateTemplateRenderer extends js.Object {
  /**
    * Create a template renderer used to generate various outputs based on a template.
    * @restriction Server SuiteScript only
    * @governance 10 units
    *
    * @param {string} type    media type: pdf|html
    * @param {string} [engineType] [optional]: default is freemarker/html
    * @return {nlobjTemplateRenderer}
    * @return
    */
  def apply(): js.Any = js.native
}

