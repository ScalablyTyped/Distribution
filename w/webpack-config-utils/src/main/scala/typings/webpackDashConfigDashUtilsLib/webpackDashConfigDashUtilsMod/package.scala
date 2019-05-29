package typings
package webpackDashConfigDashUtilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webpackDashConfigDashUtilsMod {
  type DefinedObjKeys[T] = /* import warning: ImportType.apply Failed type conversion: {[ P in keyof T ]: T[P] extends undefined? never : P}[keyof T] */ js.Any
  /* Rewritten from type alias, can be one of: 
    - webpackDashConfigDashUtilsLib.webpackDashConfigDashUtilsLibNumbers.`false`
    - webpackDashConfigDashUtilsLib.webpackDashConfigDashUtilsLibStrings.Empty
    - webpackDashConfigDashUtilsLib.webpackDashConfigDashUtilsLibStrings.`false`
    - `js.undefined`
    - scala.Nothing
    - scala.Null
    - webpackDashConfigDashUtilsLib.webpackDashConfigDashUtilsLibNumbers.`0`
  */
  type Falsy = js.UndefOr[_Falsy | scala.Null]
  type NonEmptyObject[T, P /* <: DefinedObjKeys[T] */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ PP in P ]: T[PP]}
    */ webpackDashConfigDashUtilsLib.webpackDashConfigDashUtilsLibStrings.NonEmptyObject with T
}
