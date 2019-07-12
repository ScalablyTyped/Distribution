package typings
package atWordpressWordcountLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atWordpressWordcountLibStrings {
  @js.native
  sealed trait characters_excluding_spaces
    extends atWordpressWordcountLib.atWordpressWordcountMod.CountType
  
  @js.native
  sealed trait characters_including_spaces
    extends atWordpressWordcountLib.atWordpressWordcountMod.CountType
  
  @js.native
  sealed trait words
    extends atWordpressWordcountLib.atWordpressWordcountMod.CountType
  
  @scala.inline
  def characters_excluding_spaces: characters_excluding_spaces = "characters_excluding_spaces".asInstanceOf[characters_excluding_spaces]
  @scala.inline
  def characters_including_spaces: characters_including_spaces = "characters_including_spaces".asInstanceOf[characters_including_spaces]
  @scala.inline
  def words: words = "words".asInstanceOf[words]
}

