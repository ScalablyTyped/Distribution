package typings.atUifabricUtilities

import typings.react.reactMod.Component
import typings.std.Document
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/dom/getDocument", JSImport.Namespace)
@js.native
object libDomGetDocumentMod extends js.Object {
  def getDocument(): js.UndefOr[Document] = js.native
  def getDocument(rootElement: Component[js.Object, js.Object, _]): js.UndefOr[Document] = js.native
  def getDocument(rootElement: HTMLElement): js.UndefOr[Document] = js.native
}

