package typings.yargs

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonTypesMod {
  
  @JSImport("yargs/build/lib/common-types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assertNotStrictEqual[N, T](actual: N | T, expected: N): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Exclude))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray()), TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(N))),IArray())))*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assertNotStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[/* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Exclude))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray()), TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(N))),IArray())))*/ Boolean]
  inline def assertNotStrictEqual[N, T](actual: N | T, expected: N, message: String): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Exclude))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray()), TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(N))),IArray())))*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assertNotStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Exclude))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray()), TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(N))),IArray())))*/ Boolean]
  inline def assertNotStrictEqual[N, T](actual: N | T, expected: N, message: Error): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Exclude))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray()), TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(N))),IArray())))*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assertNotStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Exclude))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray()), TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(N))),IArray())))*/ Boolean]
  
  inline def assertSingleKey(actual: String): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(string))),IArray())*/ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("assertSingleKey")(actual.asInstanceOf[js.Any]).asInstanceOf[/* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(string))),IArray())*/ Boolean]
  inline def assertSingleKey(actual: js.Array[String]): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(string))),IArray())*/ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("assertSingleKey")(actual.asInstanceOf[js.Any]).asInstanceOf[/* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(string))),IArray())*/ Boolean]
  inline def assertSingleKey(actual: Dictionary[js.Any]): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(string))),IArray())*/ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("assertSingleKey")(actual.asInstanceOf[js.Any]).asInstanceOf[/* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(string))),IArray())*/ Boolean]
  
  inline def objectKeys[T](`object`: T): js.Array[/* keyof T */ String] = ^.asInstanceOf[js.Dynamic].applyDynamic("objectKeys")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Array[/* keyof T */ String]]
  
  type Dictionary[T] = StringDictionary[T]
  
  type DictionaryKeyof[T, U] = Exclude[KeyOf[T, Dictionary[U]], KeyOf[T, js.Array[js.Any]]]
  
  type KeyOf[T, U] = Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends U? K : never}[keyof T] */ js.Any, 
    Unit
  ]
  
  type NotEmptyArray[T] = Array[T]
  
  type ValueOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
}
