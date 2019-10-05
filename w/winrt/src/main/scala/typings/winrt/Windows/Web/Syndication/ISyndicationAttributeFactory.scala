package typings.winrt.Windows.Web.Syndication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationAttributeFactory extends js.Object {
  def createSyndicationAttribute(attributeName: String, attributeNamespace: String, attributeValue: String): SyndicationAttribute
}

object ISyndicationAttributeFactory {
  @scala.inline
  def apply(createSyndicationAttribute: (String, String, String) => SyndicationAttribute): ISyndicationAttributeFactory = {
    val __obj = js.Dynamic.literal(createSyndicationAttribute = js.Any.fromFunction3(createSyndicationAttribute))
  
    __obj.asInstanceOf[ISyndicationAttributeFactory]
  }
}

