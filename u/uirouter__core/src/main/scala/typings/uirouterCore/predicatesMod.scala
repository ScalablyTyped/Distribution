package typings.uirouterCore

import typings.uirouterCore.commonCommonMod.Predicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object predicatesMod {
  
  @JSImport("@uirouter/core/lib/common/predicates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isArray(arg: js.Any): /* is std.Array<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<any> */ Boolean]
  
  inline def isDate(x: js.Any): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(x.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]
  
  @JSImport("@uirouter/core/lib/common/predicates", "isDefined")
  @js.native
  val isDefined: Predicate[js.Any] = js.native
  
  inline def isFunction(x: js.Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(x.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  inline def isInjectable(`val`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInjectable")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNull(o: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("@uirouter/core/lib/common/predicates", "isNullOrUndefined")
  @js.native
  val isNullOrUndefined: Predicate[js.Any] = js.native
  
  inline def isNumber(x: js.Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(x.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def isObject(x: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPromise(x: js.Any): /* is std.Promise<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(x.asInstanceOf[js.Any]).asInstanceOf[/* is std.Promise<any> */ Boolean]
  
  inline def isRegExp(x: js.Any): /* is std.RegExp */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegExp")(x.asInstanceOf[js.Any]).asInstanceOf[/* is std.RegExp */ Boolean]
  
  inline def isString(x: js.Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(x.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def isUndefined(x: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
