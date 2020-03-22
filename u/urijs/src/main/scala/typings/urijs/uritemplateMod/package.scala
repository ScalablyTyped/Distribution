package typings.urijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object uritemplateMod {
  type URITemplateCallback = js.Function1[/* keyName */ java.lang.String, typings.urijs.uritemplateMod.URITemplateValue]
  type URITemplateInput = (org.scalablytyped.runtime.StringDictionary[
    typings.urijs.uritemplateMod.URITemplateValue | typings.urijs.uritemplateMod.URITemplateCallback
  ]) | typings.urijs.uritemplateMod.URITemplateCallback
  type URITemplateLiteral = java.lang.String
  type URITemplatePart = typings.urijs.uritemplateMod.URITemplateLiteral | typings.urijs.uritemplateMod.URITemplateExpression
  type URITemplateValue = js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[java.lang.String] | scala.Null
  ]
}
