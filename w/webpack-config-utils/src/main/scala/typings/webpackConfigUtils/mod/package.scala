package typings.webpackConfigUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DefinedObjKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: T[P] extends undefined? never : P}[keyof T] */ js.Any
  /* Rewritten from type alias, can be one of: 
    - typings.webpackConfigUtils.webpackConfigUtilsBooleans.`false`
    - typings.webpackConfigUtils.webpackConfigUtilsStrings._empty
    - typings.webpackConfigUtils.webpackConfigUtilsStrings.`false`
    - `js.undefined`
    - scala.Null
    - typings.webpackConfigUtils.webpackConfigUtilsNumbers.`0`
  */
  type Falsy = js.UndefOr[typings.webpackConfigUtils.mod._Falsy | scala.Null]
  type NonEmptyObject[T, P /* <: typings.webpackConfigUtils.mod.DefinedObjKeys[T] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ PP in P ]: T[PP]}
    */ typings.webpackConfigUtils.webpackConfigUtilsStrings.NonEmptyObject with T
}
