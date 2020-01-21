package typings.teddy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("teddy", JSImport.Namespace)
@js.native
object mod extends js.Object {
  var params: js.Object = js.native
  var renderedTemplates: js.Object = js.native
  var templates: js.Object = js.native
  def cacheRenders(b: Boolean): Unit = js.native
  def compile(template: String): String = js.native
  def compileAtEveryRender(b: Boolean): Unit = js.native
  def flushCache(template: String): Unit = js.native
  def flushCache(template: String, model: js.Object): Unit = js.native
  def minify(b: Boolean): Unit = js.native
  def render(template: String, model: js.Object): String = js.native
  def setCacheBlacklist(templateArray: js.Array[String]): Unit = js.native
  def setCacheWhitelist(o: js.Object): Unit = js.native
  def setDefaultCaches(n: Double): Unit = js.native
  def setDefaultParams(): Unit = js.native
  def setMaxCaches(template: String, n: Double): Unit = js.native
  def setMaxPasses(n: Double): Unit = js.native
  def setTemplateRoot(path: String): Unit = js.native
  def setVerbosity(n: String): Unit = js.native
  def setVerbosity(n: Double): Unit = js.native
}

