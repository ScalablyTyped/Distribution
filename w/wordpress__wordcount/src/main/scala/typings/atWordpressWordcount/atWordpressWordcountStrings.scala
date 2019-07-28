package typings.atWordpressWordcount

import typings.atWordpressWordcount.atWordpressWordcountMod.CountType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atWordpressWordcountStrings {
  @js.native
  sealed trait characters_excluding_spaces extends CountType
  
  @js.native
  sealed trait characters_including_spaces extends CountType
  
  @js.native
  sealed trait words extends CountType
  
  @scala.inline
  def characters_excluding_spaces: characters_excluding_spaces = "characters_excluding_spaces".asInstanceOf[characters_excluding_spaces]
  @scala.inline
  def characters_including_spaces: characters_including_spaces = "characters_including_spaces".asInstanceOf[characters_including_spaces]
  @scala.inline
  def words: words = "words".asInstanceOf[words]
}

