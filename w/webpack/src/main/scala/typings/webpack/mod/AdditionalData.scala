package typings.webpack.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalData
  extends StObject
     with /* index */ StringDictionary[Any] {
  
  var webpackAST: js.Object
}
object AdditionalData {
  
  inline def apply(webpackAST: js.Object): AdditionalData = {
    val __obj = js.Dynamic.literal(webpackAST = webpackAST.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdditionalData] (val x: Self) extends AnyVal {
    
    inline def setWebpackAST(value: js.Object): Self = StObject.set(x, "webpackAST", value.asInstanceOf[js.Any])
  }
}
