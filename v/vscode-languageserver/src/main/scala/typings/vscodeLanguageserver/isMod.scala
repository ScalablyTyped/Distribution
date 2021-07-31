package typings.vscodeLanguageserver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isMod {
  
  @JSImport("vscode-languageserver/lib/utils/is", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def array[T](value: js.Any): /* is std.Array<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<T> */ Boolean]
  
  @scala.inline
  def boolean(value: js.Any): /* is boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("boolean")(value.asInstanceOf[js.Any]).asInstanceOf[/* is boolean */ Boolean]
  
  @scala.inline
  def error(value: js.Any): /* is std.Error */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Error */ Boolean]
  
  @scala.inline
  def func(value: js.Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("func")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  @scala.inline
  def number(value: js.Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("number")(value.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  @scala.inline
  def string(value: js.Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("string")(value.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  @scala.inline
  def stringArray(value: js.Any): /* is std.Array<string> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("stringArray")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<string> */ Boolean]
  
  @scala.inline
  def thenable[T](value: js.Any): /* is vscode-languageserver.Thenable<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("thenable")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver.Thenable<T> */ Boolean]
  
  @scala.inline
  def typedArray[T](value: js.Any, check: js.Function1[/* value */ js.Any, Boolean]): /* is std.Array<T> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("typedArray")(value.asInstanceOf[js.Any], check.asInstanceOf[js.Any])).asInstanceOf[/* is std.Array<T> */ Boolean]
}
