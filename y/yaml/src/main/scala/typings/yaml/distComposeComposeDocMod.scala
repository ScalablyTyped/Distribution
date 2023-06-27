package typings.yaml

import typings.yaml.distComposeComposerMod.ComposeErrorHandler
import typings.yaml.distDocDirectivesMod.Directives
import typings.yaml.distDocDocumentMod.Document.Parsed
import typings.yaml.distNodesNodeMod.ParsedNode
import typings.yaml.distOptionsMod.DocumentOptions
import typings.yaml.distOptionsMod.ParseOptions
import typings.yaml.distOptionsMod.SchemaOptions
import typings.yaml.distParseCstMod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComposeComposeDocMod {
  
  @JSImport("yaml/dist/compose/compose-doc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def composeDoc[Contents /* <: ParsedNode */, Strict /* <: Boolean */](
    options: ParseOptions & DocumentOptions & SchemaOptions,
    directives: Directives,
    param2: Document,
    onError: ComposeErrorHandler
  ): Parsed[Contents, Strict] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeDoc")(options.asInstanceOf[js.Any], directives.asInstanceOf[js.Any], param2.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Parsed[Contents, Strict]]
}
