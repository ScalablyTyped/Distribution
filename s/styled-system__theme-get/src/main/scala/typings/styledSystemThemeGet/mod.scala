package typings.styledSystemThemeGet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@styled-system/theme-get", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def themeGet(path: String): js.Function1[/* props */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("themeGet")(path.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* props */ js.Any, js.Any]]
  @scala.inline
  def themeGet(path: String, fallback: js.Any): js.Function1[/* props */ js.Any, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("themeGet")(path.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* props */ js.Any, js.Any]]
  @scala.inline
  def themeGet(path: js.Array[String | Double]): js.Function1[/* props */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("themeGet")(path.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* props */ js.Any, js.Any]]
  @scala.inline
  def themeGet(path: js.Array[String | Double], fallback: js.Any): js.Function1[/* props */ js.Any, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("themeGet")(path.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* props */ js.Any, js.Any]]
}
