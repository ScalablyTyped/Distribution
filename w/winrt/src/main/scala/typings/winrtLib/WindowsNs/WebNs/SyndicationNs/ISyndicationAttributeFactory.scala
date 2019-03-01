package typings
package winrtLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationAttributeFactory extends js.Object {
  def createSyndicationAttribute(
    attributeName: java.lang.String,
    attributeNamespace: java.lang.String,
    attributeValue: java.lang.String
  ): SyndicationAttribute
}

object ISyndicationAttributeFactory {
  @scala.inline
  def apply(
    createSyndicationAttribute: js.Function3[java.lang.String, java.lang.String, java.lang.String, SyndicationAttribute]
  ): ISyndicationAttributeFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createSyndicationAttribute")(createSyndicationAttribute)
    __obj.asInstanceOf[ISyndicationAttributeFactory]
  }
}

