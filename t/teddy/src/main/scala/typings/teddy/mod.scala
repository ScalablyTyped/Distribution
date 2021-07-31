package typings.teddy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("teddy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def cacheRenders(b: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cacheRenders")(b.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def compile(template: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def compileAtEveryRender(b: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("compileAtEveryRender")(b.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def flushCache(template: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flushCache")(template.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def flushCache(template: String, model: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flushCache")(template.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def minify(b: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("minify")(b.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("teddy", "params")
  @js.native
  def params: js.Object = js.native
  @scala.inline
  def params_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("params")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def render(template: String, model: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("teddy", "renderedTemplates")
  @js.native
  def renderedTemplates: js.Object = js.native
  @scala.inline
  def renderedTemplates_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderedTemplates")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def setCacheBlacklist(templateArray: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCacheBlacklist")(templateArray.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setCacheWhitelist(o: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCacheWhitelist")(o.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setDefaultCaches(n: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultCaches")(n.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setDefaultParams(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultParams")().asInstanceOf[Unit]
  
  @scala.inline
  def setMaxCaches(template: String, n: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMaxCaches")(template.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setMaxPasses(n: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMaxPasses")(n.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setTemplateRoot(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTemplateRoot")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setVerbosity(n: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setVerbosity")(n.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def setVerbosity(n: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setVerbosity")(n.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("teddy", "templates")
  @js.native
  def templates: js.Object = js.native
  @scala.inline
  def templates_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("templates")(x.asInstanceOf[js.Any])
}
