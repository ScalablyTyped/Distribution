package typings.webdriverio

import typings.std.HTMLElement
import typings.std.Record
import typings.webdriverio.anon.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resqMod {
  
  @JSImport("webdriverio/build/scripts/resq", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def react(selector: String, props: js.Array[Any], state: Record[String, Any], reactElement: HTMLElement): HTMLElement | Message | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("react$")(selector.asInstanceOf[js.Any], props.asInstanceOf[js.Any], state.asInstanceOf[js.Any], reactElement.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Message | Null]
  
  inline def react$(selector: String, props: js.Array[Any], state: Record[String, String], reactElement: HTMLElement): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("react$$")(selector.asInstanceOf[js.Any], props.asInstanceOf[js.Any], state.asInstanceOf[js.Any], reactElement.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]
  
  inline def waitToLoadReact(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("waitToLoadReact")().asInstanceOf[Unit]
}
