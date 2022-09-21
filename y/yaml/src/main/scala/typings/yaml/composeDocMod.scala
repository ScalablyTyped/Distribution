package typings.yaml

import typings.yaml.composerMod.ComposeErrorHandler
import typings.yaml.cstMod.Document
import typings.yaml.directivesMod.Directives
import typings.yaml.documentMod.Document.Parsed
import typings.yaml.nodeMod.ParsedNode
import typings.yaml.optionsMod.DocumentOptions
import typings.yaml.optionsMod.ParseOptions
import typings.yaml.optionsMod.SchemaOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object composeDocMod {
  
  @JSImport("yaml/dist/compose/compose-doc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def composeDoc(
    options: ParseOptions & DocumentOptions & SchemaOptions,
    directives: Directives,
    hasOffsetStartValueEnd: Document,
    onError: ComposeErrorHandler
  ): Parsed[ParsedNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeDoc")(options.asInstanceOf[js.Any], directives.asInstanceOf[js.Any], hasOffsetStartValueEnd.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Parsed[ParsedNode]]
}
