package typings.uifabricUtilities

import typings.std.Document
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getDocumentMod {
  
  @JSImport("@uifabric/utilities/lib/dom/getDocument", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getDocument(): js.UndefOr[Document] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocument")().asInstanceOf[js.UndefOr[Document]]
  @scala.inline
  def getDocument(rootElement: HTMLElement): js.UndefOr[Document] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocument")(rootElement.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Document]]
}
