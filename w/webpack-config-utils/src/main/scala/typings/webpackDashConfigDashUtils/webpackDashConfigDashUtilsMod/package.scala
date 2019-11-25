package typings.webpackDashConfigDashUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webpackDashConfigDashUtilsMod {
  type DefinedObjKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: T[P] extends undefined? never : P}[keyof T] */ js.Any
  /* Rewritten from type alias, can be one of: 
    - typings.webpackDashConfigDashUtils.webpackDashConfigDashUtilsNumbers.`false`
    - typings.webpackDashConfigDashUtils.webpackDashConfigDashUtilsStrings.Empty
    - typings.webpackDashConfigDashUtils.webpackDashConfigDashUtilsStrings.`false`
    - `js.undefined`
    - scala.Nothing
    - scala.Null
    - typings.webpackDashConfigDashUtils.webpackDashConfigDashUtilsNumbers.`0`
  */
  type Falsy = js.UndefOr[_Falsy | Null]
  type NonEmptyObject[T, P /* <: DefinedObjKeys[T] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ PP in P ]: T[PP]}
    */ typings.webpackDashConfigDashUtils.webpackDashConfigDashUtilsStrings.NonEmptyObject with T
}
