package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isRgbColorMod {
  
  /**
    * Check if the string is a rgb or rgba color.
    *
    * @param [includePercentValues=true] - If you don't want to allow to set rgb or rgba values with percents, like rgb(5%,5%,5%), or rgba(90%,90%,90%,.3), then set it to false. (defaults to true)
    */
  @JSImport("validator/lib/isRgbColor", JSImport.Default)
  @js.native
  def default(str: String): Boolean = js.native
  @JSImport("validator/lib/isRgbColor", JSImport.Default)
  @js.native
  def default(str: String, includePercentValues: Boolean): Boolean = js.native
}
