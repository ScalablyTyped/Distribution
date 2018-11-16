package typings
package teddyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("teddy", JSImport.Namespace)
@js.native
object teddyMod extends js.Object {
  var params: js.Object = js.native
  var renderedTemplates: js.Object = js.native
  var templates: js.Object = js.native
  def cacheRenders(b: scala.Boolean): scala.Unit = js.native
  def compile(template: java.lang.String): java.lang.String = js.native
  def compileAtEveryRender(b: scala.Boolean): scala.Unit = js.native
  def flushCache(template: java.lang.String): scala.Unit = js.native
  def flushCache(template: java.lang.String, model: js.Object): scala.Unit = js.native
  def minify(b: scala.Boolean): scala.Unit = js.native
  def render(template: java.lang.String, model: js.Object): java.lang.String = js.native
  def setCacheBlacklist(templateArray: js.Array[java.lang.String]): scala.Unit = js.native
  def setCacheWhitelist(o: js.Object): scala.Unit = js.native
  def setDefaultCaches(n: scala.Double): scala.Unit = js.native
  def setDefaultParams(): scala.Unit = js.native
  def setMaxCaches(template: java.lang.String, n: scala.Double): scala.Unit = js.native
  def setMaxPasses(n: scala.Double): scala.Unit = js.native
  def setTemplateRoot(path: java.lang.String): scala.Unit = js.native
  def setVerbosity(n: java.lang.String): scala.Unit = js.native
  def setVerbosity(n: scala.Double): scala.Unit = js.native
}

