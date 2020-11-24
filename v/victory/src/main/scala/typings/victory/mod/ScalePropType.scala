package typings.victory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Acceptable scale types
  */
/* Rewritten from type alias, can be one of: 
  - typings.victory.victoryStrings.linear
  - typings.victory.victoryStrings.time
  - typings.victory.victoryStrings.log
  - typings.victory.victoryStrings.sqrt
*/
trait ScalePropType extends js.Object
object ScalePropType {
  
  @scala.inline
  def linear: typings.victory.victoryStrings.linear = "linear".asInstanceOf[typings.victory.victoryStrings.linear]
  
  @scala.inline
  def log: typings.victory.victoryStrings.log = "log".asInstanceOf[typings.victory.victoryStrings.log]
  
  @scala.inline
  def sqrt: typings.victory.victoryStrings.sqrt = "sqrt".asInstanceOf[typings.victory.victoryStrings.sqrt]
  
  @scala.inline
  def time: typings.victory.victoryStrings.time = "time".asInstanceOf[typings.victory.victoryStrings.time]
}
