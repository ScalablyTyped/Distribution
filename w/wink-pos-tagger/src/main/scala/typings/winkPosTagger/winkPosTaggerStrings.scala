package typings.winkPosTagger

import typings.winkPosTagger.mod.PosTag
import typings.winkPosTagger.mod.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object winkPosTaggerStrings {
  @js.native
  sealed trait DT extends PosTag
  
  @js.native
  sealed trait Dot extends PosTag
  
  @js.native
  sealed trait IN extends PosTag
  
  @js.native
  sealed trait JJ extends PosTag
  
  @js.native
  sealed trait NN extends PosTag
  
  @js.native
  sealed trait PRP extends PosTag
  
  @js.native
  sealed trait VBD extends PosTag
  
  @js.native
  sealed trait VBG extends PosTag
  
  @js.native
  sealed trait alien extends Tag
  
  @js.native
  sealed trait currency extends Tag
  
  @js.native
  sealed trait email extends Tag
  
  @js.native
  sealed trait emoji extends Tag
  
  @js.native
  sealed trait emoticon extends Tag
  
  @js.native
  sealed trait hashtag extends Tag
  
  @js.native
  sealed trait mention extends Tag
  
  @js.native
  sealed trait number extends Tag
  
  @js.native
  sealed trait ordinal extends Tag
  
  @js.native
  sealed trait punctuation extends Tag
  
  @js.native
  sealed trait quoted_phrase extends Tag
  
  @js.native
  sealed trait symbol extends Tag
  
  @js.native
  sealed trait time extends Tag
  
  @js.native
  sealed trait url extends Tag
  
  @js.native
  sealed trait word extends Tag
  
  @scala.inline
  def DT: DT = "DT".asInstanceOf[DT]
  @scala.inline
  def Dot: Dot = ".".asInstanceOf[Dot]
  @scala.inline
  def IN: IN = "IN".asInstanceOf[IN]
  @scala.inline
  def JJ: JJ = "JJ".asInstanceOf[JJ]
  @scala.inline
  def NN: NN = "NN".asInstanceOf[NN]
  @scala.inline
  def PRP: PRP = "PRP".asInstanceOf[PRP]
  @scala.inline
  def VBD: VBD = "VBD".asInstanceOf[VBD]
  @scala.inline
  def VBG: VBG = "VBG".asInstanceOf[VBG]
  @scala.inline
  def alien: alien = "alien".asInstanceOf[alien]
  @scala.inline
  def currency: currency = "currency".asInstanceOf[currency]
  @scala.inline
  def email: email = "email".asInstanceOf[email]
  @scala.inline
  def emoji: emoji = "emoji".asInstanceOf[emoji]
  @scala.inline
  def emoticon: emoticon = "emoticon".asInstanceOf[emoticon]
  @scala.inline
  def hashtag: hashtag = "hashtag".asInstanceOf[hashtag]
  @scala.inline
  def mention: mention = "mention".asInstanceOf[mention]
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  @scala.inline
  def ordinal: ordinal = "ordinal".asInstanceOf[ordinal]
  @scala.inline
  def punctuation: punctuation = "punctuation".asInstanceOf[punctuation]
  @scala.inline
  def quoted_phrase: quoted_phrase = "quoted_phrase".asInstanceOf[quoted_phrase]
  @scala.inline
  def symbol: symbol = "symbol".asInstanceOf[symbol]
  @scala.inline
  def time: time = "time".asInstanceOf[time]
  @scala.inline
  def url: url = "url".asInstanceOf[url]
  @scala.inline
  def word: word = "word".asInstanceOf[word]
}

