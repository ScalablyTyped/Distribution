package typings.vscodeLanguageclient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient", "LRUCache")
@js.native
open class LRUCache[K, V] protected ()
  extends typings.vscodeLanguageserverProtocol.mod.LRUCache[K, V] {
  def this(limit: Double) = this()
  def this(limit: Double, ratio: Double) = this()
}
