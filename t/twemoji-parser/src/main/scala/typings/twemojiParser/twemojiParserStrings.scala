package typings.twemojiParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object twemojiParserStrings {
  @js.native
  sealed trait emoji extends js.Object
  
  @js.native
  sealed trait png extends js.Object
  
  @js.native
  sealed trait svg extends js.Object
  
  @scala.inline
  def emoji: emoji = "emoji".asInstanceOf[emoji]
  @scala.inline
  def png: png = "png".asInstanceOf[png]
  @scala.inline
  def svg: svg = "svg".asInstanceOf[svg]
}

