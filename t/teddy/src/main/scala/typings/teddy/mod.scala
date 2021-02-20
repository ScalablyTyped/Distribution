package typings.teddy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("teddy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("teddy", "cacheRenders")
  @js.native
  def cacheRenders(b: Boolean): Unit = js.native
  
  @JSImport("teddy", "compile")
  @js.native
  def compile(template: String): String = js.native
  
  @JSImport("teddy", "compileAtEveryRender")
  @js.native
  def compileAtEveryRender(b: Boolean): Unit = js.native
  
  @JSImport("teddy", "flushCache")
  @js.native
  def flushCache(template: String): Unit = js.native
  @JSImport("teddy", "flushCache")
  @js.native
  def flushCache(template: String, model: js.Object): Unit = js.native
  
  @JSImport("teddy", "minify")
  @js.native
  def minify(b: Boolean): Unit = js.native
  
  @JSImport("teddy", "params")
  @js.native
  def params: js.Object = js.native
  @scala.inline
  def params_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("params")(x.asInstanceOf[js.Any])
  
  @JSImport("teddy", "render")
  @js.native
  def render(template: String, model: js.Object): String = js.native
  
  @JSImport("teddy", "renderedTemplates")
  @js.native
  def renderedTemplates: js.Object = js.native
  @scala.inline
  def renderedTemplates_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderedTemplates")(x.asInstanceOf[js.Any])
  
  @JSImport("teddy", "setCacheBlacklist")
  @js.native
  def setCacheBlacklist(templateArray: js.Array[String]): Unit = js.native
  
  @JSImport("teddy", "setCacheWhitelist")
  @js.native
  def setCacheWhitelist(o: js.Object): Unit = js.native
  
  @JSImport("teddy", "setDefaultCaches")
  @js.native
  def setDefaultCaches(n: Double): Unit = js.native
  
  @JSImport("teddy", "setDefaultParams")
  @js.native
  def setDefaultParams(): Unit = js.native
  
  @JSImport("teddy", "setMaxCaches")
  @js.native
  def setMaxCaches(template: String, n: Double): Unit = js.native
  
  @JSImport("teddy", "setMaxPasses")
  @js.native
  def setMaxPasses(n: Double): Unit = js.native
  
  @JSImport("teddy", "setTemplateRoot")
  @js.native
  def setTemplateRoot(path: String): Unit = js.native
  
  @JSImport("teddy", "setVerbosity")
  @js.native
  def setVerbosity(n: String): Unit = js.native
  @JSImport("teddy", "setVerbosity")
  @js.native
  def setVerbosity(n: Double): Unit = js.native
  
  @JSImport("teddy", "templates")
  @js.native
  def templates: js.Object = js.native
  @scala.inline
  def templates_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("templates")(x.asInstanceOf[js.Any])
}
