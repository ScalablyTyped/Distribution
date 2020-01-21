package typings.urijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object uri {
  type URITemplateCallback = js.Function1[/* keyName */ java.lang.String, typings.urijs.uri.URITemplateValue]
  type URITemplateInput = (org.scalablytyped.runtime.StringDictionary[typings.urijs.uri.URITemplateValue | typings.urijs.uri.URITemplateCallback]) | typings.urijs.uri.URITemplateCallback
  type URITemplateLiteral = java.lang.String
  type URITemplatePart = typings.urijs.uri.URITemplateLiteral | typings.urijs.uri.URITemplateExpression
  type URITemplateValue = js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[java.lang.String] | scala.Null
  ]
}
