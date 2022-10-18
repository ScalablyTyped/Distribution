package typings.wixc3ResolveDirectoryContext

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLanguageHelpersMod {
  
  @JSImport("@wixc3/resolve-directory-context/dist/language-helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def concatIterables[T](iterables: js.Iterable[T]*): js.Iterable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatIterables")(iterables.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Iterable[T]]
  
  inline def flattenTree[T](root: T, children: js.Function1[/* node */ T, js.Iterable[T]]): Set[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenTree")(root.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Set[T]]
  inline def flattenTree[T](
    root: T,
    children: js.Function1[/* node */ T, js.Iterable[T]],
    predicate: js.Function1[/* node */ T, Boolean]
  ): Set[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenTree")(root.asInstanceOf[js.Any], children.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Set[T]]
  
  inline def isPlainObject(value: Any): /* is object */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(value.asInstanceOf[js.Any]).asInstanceOf[/* is object */ Boolean]
  
  inline def isString(value: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(value.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
}
