package typings.wordpressBlocks

import typings.wordpressBlocks.mod.Block
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validationMod {
  
  @JSImport("@wordpress/blocks/api/validation", "isValidBlockContent")
  @js.native
  def isValidBlockContent[T](blockTypeOrName: String, attributes: T, originalBlockContent: String): Boolean = js.native
  @JSImport("@wordpress/blocks/api/validation", "isValidBlockContent")
  @js.native
  def isValidBlockContent[T](blockTypeOrName: Block[T], attributes: T, originalBlockContent: String): Boolean = js.native
}
