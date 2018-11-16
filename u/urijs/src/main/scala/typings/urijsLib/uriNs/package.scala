package typings
package urijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object uriNs {
  type URITemplateCallback = js.Function1[/* keyName */ java.lang.String, URITemplateValue]
  type URITemplateInput = (ScalablyTyped.runtime.StringDictionary[URITemplateValue | URITemplateCallback]) | URITemplateCallback
  type URITemplateLiteral = java.lang.String
  type URITemplatePart = URITemplateLiteral | URITemplateExpression
  type URITemplateValue = js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | ScalablyTyped.runtime.StringDictionary[java.lang.String] | scala.Null
  ]
}
