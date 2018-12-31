package typings
package systemjsLib.systemjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SystemJSLoaderNs {
  type ConfigMap = PackageList[java.lang.String | PackageList[java.lang.String]]
  type ConfigMeta = PackageList[MetaConfig]
  /**
    * The following module formats are supported:
    *
    * - esm: ECMAScript Module (previously referred to as es6)
    * - cjs: CommonJS
    * - amd: Asynchronous Module Definition
    * - global: Global shim module format
    * - register: System.register or System.registerDynamic compatibility module format
    *
    */
  type ModuleFormat = systemjsLib.systemjsLibStrings.esm | systemjsLib.systemjsLibStrings.cjs | systemjsLib.systemjsLibStrings.amd | systemjsLib.systemjsLibStrings.global | systemjsLib.systemjsLibStrings.register
  /**
    * Sets the module name of the transpiler to be used for loading ES6 modules.
    * Represents a module name for System.import that must resolve to either Traceur, Babel or TypeScript.
    * When set to traceur, babel or typescript, loading will be automatically configured as far as possible.
    */
  type Transpiler = systemjsLib.systemjsLibStrings.`plugin-traceur` | systemjsLib.systemjsLibStrings.`plugin-babel` | systemjsLib.systemjsLibStrings.`plugin-typescript` | systemjsLib.systemjsLibStrings.traceur | systemjsLib.systemjsLibStrings.babel | systemjsLib.systemjsLibStrings.typescript | systemjsLib.systemjsLibNumbers.`false`
}
