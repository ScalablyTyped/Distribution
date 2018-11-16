package typings
package atUifabricMergeDashStylesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libIStyleSetMod {
  type Diff[T /* <: java.lang.String */, U /* <: java.lang.String */] = /* import warning: Failed type conversion: TsTypeLookup(TsTypeIntersect(List(TsTypeObject(List(TsMemberTypeMapped(NoComments,Default,false,TsIdentSimple(P),TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Noop,TsTypeRef(TsQIdent(List(TsIdentSimple(P))),List())))), TsTypeObject(List(TsMemberTypeMapped(NoComments,Default,false,TsIdentSimple(P),TsTypeRef(TsQIdent(List(TsIdentSimple(U))),List()),Noop,TsTypeRef(TsQIdent(List(TsIdentSimple(never))),List())))), TsTypeObject(List(TsMemberIndex(NoComments,false,Default,IndexingDict(TsIdentSimple(x),TsTypeRef(TsQIdent(List(TsIdentSimple(string))),List())),false,TsTypeRef(TsQIdent(List(TsIdentSimple(never))),List())))))),Left(TsIdentSimple(T))) */js.Any
  type IConcatenatedStyleSet[TStyleSet /* <: IStyleSet[TStyleSet] */] = atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.IConcatenatedStyleSet with js.Any with atUifabricMergeDashStylesLib.Anon_SubComponentStyles[TStyleSet]
  type IProcessedStyleSet[TStyleSet /* <: IStyleSet[TStyleSet] */] = atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.IProcessedStyleSet with js.Any with atUifabricMergeDashStylesLib.Anon_SubComponentStylesTStyleSet[TStyleSet]
  type IStyleSet[TStyleSet /* <: js.Object */] = atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.IStyleSet with js.Any with atUifabricMergeDashStylesLib.Anon_SubComponentStylesTStyleSetIStyleFunctionOrObject[TStyleSet]
  type Omit[U, K /* <: java.lang.String */] = stdLib.Pick[U, Diff[java.lang.String, K]]
  type __MapToFunctionType[T] = (stdLib.Extract[T, js.Function]) | (js.Function1[/* repeated */js.Any, stdLib.Partial[T]])
}
