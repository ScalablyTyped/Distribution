package typings.twilio.libTwimlVoiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio/lib/twiml/VoiceResponse", "SsmlW")
@js.native
open class SsmlW () extends StObject {
  
  /**
    * Adding a Pause in <Say>
    *
    * @param attributes - TwiML attributes
    */
  def break_(): Unit = js.native
  def break_(attributes: SsmlBreakAttributes): Unit = js.native
  
  /**
    * Emphasizing Words in <Say>
    *
    * @param attributes - TwiML attributes
    * @param words - Words to emphasize
    */
  def emphasis(attributes: SsmlEmphasisAttributes, words: String): SsmlEmphasis = js.native
  /**
    * Emphasizing Words in <Say>
    *
    * @param words - Words to emphasize
    */
  def emphasis(words: String): SsmlEmphasis = js.native
  
  /**
    * Using Phonetic Pronunciation in <Say>
    *
    * @param attributes - TwiML attributes
    * @param words - Words to speak
    */
  def phoneme(attributes: SsmlPhonemeAttributes, words: String): Unit = js.native
  /**
    * Using Phonetic Pronunciation in <Say>
    *
    * @param words - Words to speak
    */
  def phoneme(words: String): Unit = js.native
  
  /**
    * Controling Volume, Speaking Rate, and Pitch in <Say>
    *
    * @param attributes - TwiML attributes
    * @param words - Words to speak
    */
  def prosody(attributes: SsmlProsodyAttributes, words: String): SsmlProsody = js.native
  /**
    * Controling Volume, Speaking Rate, and Pitch in <Say>
    *
    * @param words - Words to speak
    */
  def prosody(words: String): SsmlProsody = js.native
  
  /**
    * Controlling How Special Types of Words Are Spoken in <Say>
    *
    * @param attributes - TwiML attributes
    * @param words - Words to be interpreted
    */
  def sayAs(attributes: SsmlSayAsAttributes, words: String): Unit = js.native
  /**
    * Controlling How Special Types of Words Are Spoken in <Say>
    *
    * @param words - Words to be interpreted
    */
  def sayAs(words: String): Unit = js.native
  
  /**
    * Adding a Pause in <Say>
    *
    * @param attributes - TwiML attributes
    */
  def ssmlBreak(): Unit = js.native
  def ssmlBreak(attributes: SsmlBreakAttributes): Unit = js.native
  
  /**
    * Emphasizing Words in <Say>
    *
    * @param attributes - TwiML attributes
    * @param words - Words to emphasize
    */
  def ssmlEmphasis(attributes: SsmlEmphasisAttributes, words: String): SsmlEmphasis = js.native
  /**
    * Emphasizing Words in <Say>
    *
    * @param words - Words to emphasize
    */
  def ssmlEmphasis(words: String): SsmlEmphasis = js.native
  
  /**
    * Using Phonetic Pronunciation in <Say>
    *
    * @param attributes - TwiML attributes
    * @param words - Words to speak
    */
  def ssmlPhoneme(attributes: SsmlPhonemeAttributes, words: String): Unit = js.native
  /**
    * Using Phonetic Pronunciation in <Say>
    *
    * @param words - Words to speak
    */
  def ssmlPhoneme(words: String): Unit = js.native
  
  /**
    * Controling Volume, Speaking Rate, and Pitch in <Say>
    *
    * @param attributes - TwiML attributes
    * @param words - Words to speak
    */
  def ssmlProsody(attributes: SsmlProsodyAttributes, words: String): SsmlProsody = js.native
  /**
    * Controling Volume, Speaking Rate, and Pitch in <Say>
    *
    * @param words - Words to speak
    */
  def ssmlProsody(words: String): SsmlProsody = js.native
  
  /**
    * Controlling How Special Types of Words Are Spoken in <Say>
    *
    * @param attributes - TwiML attributes
    * @param words - Words to be interpreted
    */
  def ssmlSayAs(attributes: SsmlSayAsAttributes, words: String): Unit = js.native
  /**
    * Controlling How Special Types of Words Are Spoken in <Say>
    *
    * @param words - Words to be interpreted
    */
  def ssmlSayAs(words: String): Unit = js.native
  
  /**
    * Pronouncing Acronyms and Abbreviations in <Say>
    *
    * @param attributes - TwiML attributes
    * @param words - Words to be substituted
    */
  def ssmlSub(attributes: SsmlSubAttributes, words: String): Unit = js.native
  /**
    * Pronouncing Acronyms and Abbreviations in <Say>
    *
    * @param words - Words to be substituted
    */
  def ssmlSub(words: String): Unit = js.native
  
  /**
    * Pronouncing Acronyms and Abbreviations in <Say>
    *
    * @param attributes - TwiML attributes
    * @param words - Words to be substituted
    */
  def sub(attributes: SsmlSubAttributes, words: String): Unit = js.native
  /**
    * Pronouncing Acronyms and Abbreviations in <Say>
    *
    * @param words - Words to be substituted
    */
  def sub(words: String): Unit = js.native
}
