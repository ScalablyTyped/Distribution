package typings
package systemjsLib.systemjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sets the module name of the transpiler to be used for loading ES6 modules.
  * Represents a module name for System.import that must resolve to either Traceur, Babel or TypeScript.
  * When set to traceur, babel or typescript, loading will be automatically configured as far as possible.
  */
/* Rewritten from type alias, can be one of: 
  - systemjsLib.systemjsLibStrings.`plugin-traceur`
  - systemjsLib.systemjsLibStrings.`plugin-babel`
  - systemjsLib.systemjsLibStrings.`plugin-typescript`
  - systemjsLib.systemjsLibStrings.traceur
  - systemjsLib.systemjsLibStrings.babel
  - systemjsLib.systemjsLibStrings.typescript
  - systemjsLib.systemjsLibNumbers.`false`
*/
trait Transpiler extends js.Object

