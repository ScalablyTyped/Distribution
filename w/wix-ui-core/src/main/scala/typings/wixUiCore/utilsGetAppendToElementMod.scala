package typings.wixUiCore

import typings.std.Element
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsGetAppendToElementMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/popover/utils/getAppendToElement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getAppendToElement(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppendToElement")().asInstanceOf[js.Any]
  @scala.inline
  def getAppendToElement(appendTo: Unit, node: Element): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getAppendToElement")(appendTo.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def getAppendToElement(appendTo: Elm): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppendToElement")(appendTo.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def getAppendToElement(appendTo: Elm, node: Element): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getAppendToElement")(appendTo.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def getAppendToElement(appendTo: Predicate): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppendToElement")(appendTo.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def getAppendToElement(appendTo: Predicate, node: Element): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getAppendToElement")(appendTo.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def getAppendToElement(appendTo: Preset): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppendToElement")(appendTo.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def getAppendToElement(appendTo: Preset, node: Element): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getAppendToElement")(appendTo.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  type Elm = HTMLDivElement | Element
  
  type Predicate = js.Function1[/* s */ Element, Boolean]
  
  type Preset = String
}
