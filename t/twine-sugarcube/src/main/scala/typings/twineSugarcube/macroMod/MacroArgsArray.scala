package typings.twineSugarcube.macroMod

import typings.twineSugarcube.extensionsMod.global.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MacroArgsArray
  extends Array[js.Any] {
  
  /**
    * The current tag's argument string after converting all TwineScript syntax elements into their
    * native JavaScript counterparts. Equivalent in function to <MacroContext>.args.full.
    */
  var full: String = js.native
  
  /**
    * The current tag's unprocessed argument string. Equivalent in function to <MacroContext>.args.raw.
    */
  var raw: String = js.native
}
