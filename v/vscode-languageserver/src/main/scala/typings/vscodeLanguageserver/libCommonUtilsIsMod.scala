package typings.vscodeLanguageserver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonUtilsIsMod {
  
  @JSImport("vscode-languageserver/lib/common/utils/is", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def array[T](value: Any): /* is std.Array<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<T> */ Boolean]
  
  inline def boolean(value: Any): /* is boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("boolean")(value.asInstanceOf[js.Any]).asInstanceOf[/* is boolean */ Boolean]
  
  inline def error(value: Any): /* is std.Error */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Error */ Boolean]
  
  inline def func(value: Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("func")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  inline def number(value: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("number")(value.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def string(value: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("string")(value.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def stringArray(value: Any): /* is std.Array<string> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("stringArray")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<string> */ Boolean]
  
  inline def thenable[T](value: Any): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Thenable<T> * / any */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("thenable")(value.asInstanceOf[js.Any]).asInstanceOf[/* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Thenable<T> * / any */ Boolean]
  
  inline def typedArray[T](value: Any, check: js.Function1[/* value */ Any, Boolean]): /* is std.Array<T> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("typedArray")(value.asInstanceOf[js.Any], check.asInstanceOf[js.Any])).asInstanceOf[/* is std.Array<T> */ Boolean]
}
