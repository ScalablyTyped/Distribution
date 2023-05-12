package typings.wordpressReduxRoutine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesIsActionMod {
  
  @JSImport("@wordpress/redux-routine/build-types/is-action", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isAction(`object`: Any): /* is redux.redux.AnyAction */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAction")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is redux.redux.AnyAction */ Boolean]
  
  inline def isActionOfType(`object`: Any, expectedType: String): /* is redux.redux.AnyAction */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isActionOfType")(`object`.asInstanceOf[js.Any], expectedType.asInstanceOf[js.Any])).asInstanceOf[/* is redux.redux.AnyAction */ Boolean]
}
