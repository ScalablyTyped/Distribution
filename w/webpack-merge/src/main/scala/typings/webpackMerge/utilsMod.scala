package typings.webpackMerge

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("webpack-merge/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isFunction(functionToCheck: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(functionToCheck.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def isPlainObject(a: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRegex(o: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegex")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isUndefined(a: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
