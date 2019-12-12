package typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod

import org.scalablytyped.runtime.TopLevel
import typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.AddGrammarConstants.ContentType
import typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.AddGrammarConstants.ContentType.APPLICATION_SRGS
import typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.AddGrammarConstants.ContentType.APPLICATION_SRGS_XML
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `addGrammar` operation. */
@JSImport("watson-developer-cloud/speech-to-text/v1-generated", "AddGrammarConstants")
@js.native
object AddGrammarConstants extends js.Object {
  @js.native
  sealed trait ContentType extends js.Object
  
  /** The format (MIME type) of the grammar file: * `application/srgs` for Augmented Backus-Naur Form (ABNF), which uses a plain-text representation that is similar to traditional BNF grammars. * `application/srgs+xml` for XML Form, which uses XML elements to represent the grammar. */
  @js.native
  object ContentType extends js.Object {
    @js.native
    sealed trait APPLICATION_SRGS extends ContentType
    
    @js.native
    sealed trait APPLICATION_SRGS_XML extends ContentType
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ContentType with String] = js.native
    /* "application/srgs" */ @js.native
    object APPLICATION_SRGS extends TopLevel[APPLICATION_SRGS with String]
    
    /* "application/srgs+xml" */ @js.native
    object APPLICATION_SRGS_XML extends TopLevel[APPLICATION_SRGS_XML with String]
    
  }
  
}

