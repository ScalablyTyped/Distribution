package typings.termSize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("term-size", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
  Reliably get the terminal window size.
  @example
  ```
  import terminalSize = require('term-size');
  terminalSize();
  //=> {columns: 143, rows: 24}
  ```
  */
  def apply(): Size = js.native
}
