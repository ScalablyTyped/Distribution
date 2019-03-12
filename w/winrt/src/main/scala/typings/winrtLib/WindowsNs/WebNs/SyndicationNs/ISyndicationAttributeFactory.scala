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
    createSyndicationAttribute: (java.lang.String, java.lang.String, java.lang.String) => SyndicationAttribute
  ): ISyndicationAttributeFactory = {
    val __obj = js.Dynamic.literal(createSyndicationAttribute = js.Any.fromFunction3(createSyndicationAttribute))
  
    __obj.asInstanceOf[ISyndicationAttributeFactory]
  }
}

