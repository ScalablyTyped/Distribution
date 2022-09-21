package typings.wordpressAdmin.anon

import typings.lodash.mod.TemplateExecutor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassName extends StObject {
  
  var className: String
  
  def hide(): Unit
  
  def initialize(): Unit
  
  var options: Uploader
  
  def ready(): Unit
  
  def refresh(): Unit
  
  def show(): Unit
  
  var tagName: String
  
  def template(): String
  def template(data: js.Object): String
  @JSName("template")
  var template_Original: TemplateExecutor
}
object ClassName {
  
  inline def apply(
    className: String,
    hide: () => Unit,
    initialize: () => Unit,
    options: Uploader,
    ready: () => Unit,
    refresh: () => Unit,
    show: () => Unit,
    tagName: String,
    template: TemplateExecutor
  ): ClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), initialize = js.Any.fromFunction0(initialize), options = options.asInstanceOf[js.Any], ready = js.Any.fromFunction0(ready), refresh = js.Any.fromFunction0(refresh), show = js.Any.fromFunction0(show), tagName = tagName.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName]
  }
  
  extension [Self <: ClassName](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    inline def setInitialize(value: () => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction0(value))
    
    inline def setOptions(value: Uploader): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setReady(value: () => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
    
    inline def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
    
    inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    
    inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    inline def setTemplate(value: TemplateExecutor): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
  }
}
