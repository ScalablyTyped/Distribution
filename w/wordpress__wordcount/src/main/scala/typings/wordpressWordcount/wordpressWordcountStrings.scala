package typings.wordpressWordcount

import typings.wordpressWordcount.mod.CountType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wordpressWordcountStrings {
  
  @js.native
  sealed trait characters_excluding_spaces
    extends StObject
       with CountType
  @scala.inline
  def characters_excluding_spaces: characters_excluding_spaces = "characters_excluding_spaces".asInstanceOf[characters_excluding_spaces]
  
  @js.native
  sealed trait characters_including_spaces
    extends StObject
       with CountType
  @scala.inline
  def characters_including_spaces: characters_including_spaces = "characters_including_spaces".asInstanceOf[characters_including_spaces]
  
  @js.native
  sealed trait words
    extends StObject
       with CountType
  @scala.inline
  def words: words = "words".asInstanceOf[words]
}
