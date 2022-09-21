package typings.vscodeLanguageclient.featuresMod

import typings.std.IterableIterator
import typings.vscode.mod.DocumentSelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient/lib/common/features", "DynamicDocumentFeature")
@js.native
abstract class DynamicDocumentFeature[RO, MW, CO] protected ()
  extends StObject
     with DynamicFeature[RO] {
  def this(client: FeatureClient[MW, CO]) = this()
  
  /* protected */ val _client: FeatureClient[MW, CO] = js.native
  
  /* protected */ def getDocumentSelectors(): IterableIterator[DocumentSelector] = js.native
}
