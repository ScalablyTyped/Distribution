package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isByteLengthMod {
  
  @JSImport("validator/lib/isByteLength", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Check if the string's length (in UTF-8 bytes) falls in a range.
    *
    * @param [options] - Options
    */
  @scala.inline
  def default(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def default(str: String, options: typings.validator.mod.validator.IsByteLengthOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type IsByteLengthOptions = typings.validator.mod.validator.IsByteLengthOptions
}
