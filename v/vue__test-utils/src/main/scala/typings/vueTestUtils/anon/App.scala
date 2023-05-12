package typings.vueTestUtils.anon

import typings.std.Element
import typings.std.HTMLDivElement
import typings.std.Record
import typings.vueReactivity.mod.Ref_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait App extends StObject {
  
  var app: typings.vueRuntimeCore.mod.App[Element]
  
  var componentRef: Ref_[Null]
  
  var el: HTMLDivElement
  
  var props: Record[String, Any]
}
object App {
  
  inline def apply(
    app: typings.vueRuntimeCore.mod.App[Element],
    componentRef: Ref_[Null],
    el: HTMLDivElement,
    props: Record[String, Any]
  ): App = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], componentRef = componentRef.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: App] (val x: Self) extends AnyVal {
    
    inline def setApp(value: typings.vueRuntimeCore.mod.App[Element]): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setComponentRef(value: Ref_[Null]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
    
    inline def setEl(value: HTMLDivElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    inline def setProps(value: Record[String, Any]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
