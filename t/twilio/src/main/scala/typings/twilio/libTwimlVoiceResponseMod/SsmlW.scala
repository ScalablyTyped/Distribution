package typings.twilio.libTwimlVoiceResponseMod

import typings.twilio.libTwimlTwiMLMod.default
import typings.xmlbuilder.mod.XMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio/lib/twiml/VoiceResponse", "SsmlW")
@js.native
open class SsmlW protected () extends default {
  /**
    * Improving Pronunciation by Specifying Parts of Speech in <Say>
    */
  def this(ssmlW: XMLElement) = this()
  
  /**
    * Adding a Pause in <Say>
    *
    * @param attributes - TwiML attributes
    */
  def break(): SsmlBreak = js.native
  def break(attributes: SsmlBreakAttributes): SsmlBreak = js.native
  
  def emphasis(attributes: SsmlEmphasisAttributes, words: String): SsmlEmphasis = js.native
  /**
    * Emphasizing Words in <Say>
    *
    * @param attributes - TwiML attributes
    * @param words - Words to emphasize
    */
  def emphasis(words: String): SsmlEmphasis = js.native
  
  def phoneme(attributes: SsmlPhonemeAttributes, words: String): SsmlPhoneme = js.native
  /**
    * Using Phonetic Pronunciation in <Say>
    *
    * @param attributes - TwiML attributes
    * @param words - Words to speak
    */
  def phoneme(words: String): SsmlPhoneme = js.native
  
  def prosody(attributes: SsmlProsodyAttributes, words: String): SsmlProsody = js.native
  /**
    * Controling Volume, Speaking Rate, and Pitch in <Say>
    *
    * @param attributes - TwiML attributes
    * @param words - Words to speak
    */
  def prosody(words: String): SsmlProsody = js.native
  
  def sayAs(attributes: SsmlSayAsAttributes, words: String): SsmlSayAs = js.native
  /**
    * Controlling How Special Types of Words Are Spoken in <Say>
    *
    * @param attributes - TwiML attributes
    * @param words - Words to be interpreted
    */
  def sayAs(words: String): SsmlSayAs = js.native
  
  var ssmlW: XMLElement = js.native
  
  def sub(attributes: SsmlSubAttributes, words: String): SsmlSub = js.native
  /**
    * Pronouncing Acronyms and Abbreviations in <Say>
    *
    * @param attributes - TwiML attributes
    * @param words - Words to be substituted
    */
  def sub(words: String): SsmlSub = js.native
}
