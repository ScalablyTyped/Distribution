package typings
package webpackDashConfigDashUtilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webpackDashConfigDashUtilsMod {
  type DefinedObjKeys[T] = /* import warning: Failed type conversion: TsTypeLookup(TsTypeObject(List(TsMemberTypeMapped(NoComments,Default,false,TsIdentSimple(P),TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())),Noop,TsTypeRef(TsQIdent(List(TsIdentSimple(P))),List())))),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
  type EnvVars = webpackDashConfigDashUtilsLib.webpackDashConfigDashUtilsLibStrings.production | webpackDashConfigDashUtilsLib.webpackDashConfigDashUtilsLibStrings.prod | webpackDashConfigDashUtilsLib.webpackDashConfigDashUtilsLibStrings.test | webpackDashConfigDashUtilsLib.webpackDashConfigDashUtilsLibStrings.development | webpackDashConfigDashUtilsLib.webpackDashConfigDashUtilsLibStrings.dev
  type Falsy = js.UndefOr[
    webpackDashConfigDashUtilsLib.webpackDashConfigDashUtilsLibNumbers.`false` | webpackDashConfigDashUtilsLib.webpackDashConfigDashUtilsLibStrings.Empty | webpackDashConfigDashUtilsLib.webpackDashConfigDashUtilsLibStrings.`false` | scala.Null | webpackDashConfigDashUtilsLib.webpackDashConfigDashUtilsLibNumbers.`0`
  ]
  type NonEmptyObject[T, P /* <: DefinedObjKeys[T] */] = webpackDashConfigDashUtilsLib.webpackDashConfigDashUtilsLibStrings.NonEmptyObject with T
}
