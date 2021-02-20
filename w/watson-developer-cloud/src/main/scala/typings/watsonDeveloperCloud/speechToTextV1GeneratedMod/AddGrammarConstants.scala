package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `addGrammar` operation. */
object AddGrammarConstants {
  
  @js.native
  sealed trait ContentType extends StObject
  /** The format (MIME type) of the grammar file: * `application/srgs` for Augmented Backus-Naur Form (ABNF), which uses a plain-text representation that is similar to traditional BNF grammars. * `application/srgs+xml` for XML Form, which uses XML elements to represent the grammar. */
  @JSImport("watson-developer-cloud/speech-to-text/v1-generated", "AddGrammarConstants.ContentType")
  @js.native
  object ContentType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ContentType with String] = js.native
    
    @js.native
    sealed trait APPLICATION_SRGS extends ContentType
    /* "application/srgs" */ val APPLICATION_SRGS: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddGrammarConstants.ContentType.APPLICATION_SRGS with String = js.native
    
    @js.native
    sealed trait APPLICATION_SRGS_XML extends ContentType
    /* "application/srgs+xml" */ val APPLICATION_SRGS_XML: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddGrammarConstants.ContentType.APPLICATION_SRGS_XML with String = js.native
  }
}
