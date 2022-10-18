package typings.twilio.libTwimlVoiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio/lib/twiml/VoiceResponse", "SsmlLang")
@js.native
open class SsmlLang () extends StObject {
  
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
    * Specifying Another Language for Specific Words in <Say>
    *
    * @param attributes - TwiML attributes
    * @param words - Words to speak
    */
  def lang(attributes: SsmlLangAttributes, words: String): SsmlLang = js.native
  /**
    * Specifying Another Language for Specific Words in <Say>
    *
    * @param words - Words to speak
    */
  def lang(words: String): SsmlLang = js.native
  
  /**
    * Adding a Pause Between Paragraphs in <Say>
    *
    * @param attributes - TwiML attributes
    * @param words - Words to speak
    */
  def p(attributes: js.Object, words: String): SsmlP = js.native
  /**
    * Adding a Pause Between Paragraphs in <Say>
    *
    * @param words - Words to speak
    */
  def p(words: String): SsmlP = js.native
  
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
    * Adding A Pause Between Sentences in <Say>
    *
    * @param attributes - TwiML attributes
    * @param words - Words to speak
    */
  def s(attributes: js.Object, words: String): SsmlS = js.native
  /**
    * Adding A Pause Between Sentences in <Say>
    *
    * @param words - Words to speak
    */
  def s(words: String): SsmlS = js.native
  
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
    * Specifying Another Language for Specific Words in <Say>
    *
    * @param attributes - TwiML attributes
    * @param words - Words to speak
    */
  def ssmlLang(attributes: SsmlLangAttributes, words: String): SsmlLang = js.native
  /**
    * Specifying Another Language for Specific Words in <Say>
    *
    * @param words - Words to speak
    */
  def ssmlLang(words: String): SsmlLang = js.native
  
  /**
    * Adding a Pause Between Paragraphs in <Say>
    *
    * @param attributes - TwiML attributes
    * @param words - Words to speak
    */
  def ssmlP(attributes: js.Object, words: String): SsmlP = js.native
  /**
    * Adding a Pause Between Paragraphs in <Say>
    *
    * @param words - Words to speak
    */
  def ssmlP(words: String): SsmlP = js.native
  
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
    * Adding A Pause Between Sentences in <Say>
    *
    * @param attributes - TwiML attributes
    * @param words - Words to speak
    */
  def ssmlS(attributes: js.Object, words: String): SsmlS = js.native
  /**
    * Adding A Pause Between Sentences in <Say>
    *
    * @param words - Words to speak
    */
  def ssmlS(words: String): SsmlS = js.native
  
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
    * Improving Pronunciation by Specifying Parts of Speech in <Say>
    *
    * @param attributes - TwiML attributes
    * @param words - Words to speak
    */
  def ssmlW(attributes: SsmlWAttributes, words: String): SsmlW = js.native
  /**
    * Improving Pronunciation by Specifying Parts of Speech in <Say>
    *
    * @param words - Words to speak
    */
  def ssmlW(words: String): SsmlW = js.native
  
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
  
  /**
    * Improving Pronunciation by Specifying Parts of Speech in <Say>
    *
    * @param attributes - TwiML attributes
    * @param words - Words to speak
    */
  def w(attributes: SsmlWAttributes, words: String): SsmlW = js.native
  /**
    * Improving Pronunciation by Specifying Parts of Speech in <Say>
    *
    * @param words - Words to speak
    */
  def w(words: String): SsmlW = js.native
}
