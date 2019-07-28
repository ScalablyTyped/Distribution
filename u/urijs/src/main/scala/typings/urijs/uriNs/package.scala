package typings.urijs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object uriNs {
  type URITemplateCallback = js.Function1[/* keyName */ String, URITemplateValue]
  type URITemplateInput = (StringDictionary[URITemplateValue | URITemplateCallback]) | URITemplateCallback
  type URITemplateLiteral = String
  type URITemplatePart = URITemplateLiteral | URITemplateExpression
  type URITemplateValue = js.UndefOr[String | js.Array[String] | StringDictionary[String] | Null]
}
