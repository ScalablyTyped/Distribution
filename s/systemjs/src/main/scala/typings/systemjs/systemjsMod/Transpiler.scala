package typings.systemjs.systemjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sets the module name of the transpiler to be used for loading ES6 modules.
  * Represents a module name for System.import that must resolve to either Traceur, Babel or TypeScript.
  * When set to traceur, babel or typescript, loading will be automatically configured as far as possible.
  */
/* Rewritten from type alias, can be one of: 
  - typings.systemjs.systemjsStrings.`plugin-traceur`
  - typings.systemjs.systemjsStrings.`plugin-babel`
  - typings.systemjs.systemjsStrings.`plugin-typescript`
  - typings.systemjs.systemjsStrings.traceur
  - typings.systemjs.systemjsStrings.babel
  - typings.systemjs.systemjsStrings.typescript
  - typings.systemjs.systemjsNumbers.`false`
*/
trait Transpiler extends js.Object

