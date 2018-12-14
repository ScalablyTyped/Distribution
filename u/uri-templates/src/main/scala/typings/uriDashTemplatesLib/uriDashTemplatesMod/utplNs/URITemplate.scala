package typings
package uriDashTemplatesLib.uriDashTemplatesMod.utplNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait URITemplate extends js.Object {
  var template: java.lang.String = js.native
  var varNames: js.Array[java.lang.String] = js.native
  def fill(callback: js.Function1[/* varName */ java.lang.String, java.lang.String]): java.lang.String = js.native
  def fill(vars: org.scalablytyped.runtime.StringDictionary[java.lang.String]): java.lang.String = js.native
  def fillFromObject(vars: org.scalablytyped.runtime.StringDictionary[java.lang.String]): java.lang.String = js.native
  def fromUri(uri: java.lang.String): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
}

