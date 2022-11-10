package typings.webix.global.webix

import typings.webix.mod.WebixCallback
import typings.webix.mod.obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalbox {
  
  inline def apply(text: obj | typings.webix.webix.obj): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def apply(text: obj | typings.webix.webix.obj, `type`: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def apply(text: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def apply(text: String, `type`: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def apply(text: String, `type`: String, callback: WebixCallback): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def apply(text: String, `type`: String, callback: typings.webix.webix.WebixCallback): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def apply(text: String, `type`: Unit, callback: WebixCallback): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def apply(text: String, `type`: Unit, callback: typings.webix.webix.WebixCallback): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def apply(text: String, `type`: WebixCallback): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def apply(text: String, `type`: WebixCallback, callback: WebixCallback): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def apply(text: String, `type`: typings.webix.webix.WebixCallback): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def apply(
    text: String,
    `type`: typings.webix.webix.WebixCallback,
    callback: typings.webix.webix.WebixCallback
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def apply(text: obj, `type`: String, callback: WebixCallback): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def apply(text: obj, `type`: Unit, callback: WebixCallback): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def apply(text: obj, `type`: WebixCallback): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def apply(text: obj, `type`: WebixCallback, callback: WebixCallback): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def apply(text: typings.webix.webix.obj, `type`: String, callback: typings.webix.webix.WebixCallback): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def apply(text: typings.webix.webix.obj, `type`: Unit, callback: typings.webix.webix.WebixCallback): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def apply(text: typings.webix.webix.obj, `type`: typings.webix.webix.WebixCallback): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def apply(
    text: typings.webix.webix.obj,
    `type`: typings.webix.webix.WebixCallback,
    callback: typings.webix.webix.WebixCallback
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  @JSGlobal("webix.modalbox")
  @js.native
  val ^ : js.Any = js.native
  
  inline def hide(content: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")(content.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def hideAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideAll")().asInstanceOf[Unit]
  
  @JSGlobal("webix.modalbox.order")
  @js.native
  val order: js.Array[String] = js.native
  
  @JSGlobal("webix.modalbox.pull")
  @js.native
  val pull: obj & typings.webix.webix.obj = js.native
}
