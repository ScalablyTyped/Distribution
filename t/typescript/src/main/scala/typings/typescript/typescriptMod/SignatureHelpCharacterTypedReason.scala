package typings.typescript.typescriptMod

import typings.typescript.typescriptStrings.characterTyped
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Signals that the signature help request came from a user typing a character.
  * Depending on the character and the syntactic context, the request may or may not be served a result.
  */
trait SignatureHelpCharacterTypedReason extends SignatureHelpTriggerReason {
  var kind: characterTyped
  /**
    * Character that was responsible for triggering signature help.
    */
  var triggerCharacter: SignatureHelpTriggerCharacter
}

object SignatureHelpCharacterTypedReason {
  @scala.inline
  def apply(kind: characterTyped, triggerCharacter: SignatureHelpTriggerCharacter): SignatureHelpCharacterTypedReason = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], triggerCharacter = triggerCharacter.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SignatureHelpCharacterTypedReason]
  }
}

