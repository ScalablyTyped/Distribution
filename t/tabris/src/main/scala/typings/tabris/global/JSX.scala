package typings.tabris.global

import typings.tabris.JSX.ElementClass
import typings.tabris.mod.JsxProcessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JSX {
  
  @JSGlobal("JSX")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createElement(`type`: String, attributes: js.Object, children: ElementClass*): ElementClass = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ElementClass]
  inline def createElement(`type`: js.Function, attributes: js.Object, children: ElementClass*): ElementClass = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ElementClass]
  
  inline def install(jsxProcessor: JsxProcessor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(jsxProcessor.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSGlobal("JSX.jsxFactory")
  @js.native
  val jsxFactory: js.Symbol = js.native
  
  @JSGlobal("JSX.jsxType")
  @js.native
  val jsxType: js.Symbol = js.native
}
