package typings.stylableCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Namespace extends StObject {
  
  var namespace: String = js.native
  
  var prefix: String = js.native
  
  var stylesheetPath: String = js.native
}
object Namespace {
  
  @scala.inline
  def apply(namespace: String, prefix: String, stylesheetPath: String): Namespace = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], stylesheetPath = stylesheetPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Namespace]
  }
  
  @scala.inline
  implicit class NamespaceMutableBuilder[Self <: Namespace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesheetPath(value: String): Self = StObject.set(x, "stylesheetPath", value.asInstanceOf[js.Any])
  }
}
