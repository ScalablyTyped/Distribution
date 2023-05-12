package typings.wordpressDom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesUtilsAssertIsDefinedMod {
  
  @JSImport("@wordpress/dom/build-types/utils/assert-is-defined", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assertIsDefined[T](`val`: T, name: String): /* asserts val is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(NonNullable))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())))*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assertIsDefined")(`val`.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[/* asserts val is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(NonNullable))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())))*/ Boolean]
}
