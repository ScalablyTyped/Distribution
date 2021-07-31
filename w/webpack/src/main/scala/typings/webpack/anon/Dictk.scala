package typings.webpack.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictk
  extends StObject
     with /* k */ StringDictionary[js.Any] {
  
  /**
  		 * The context that can be used to configure older loaders
  		 */
  var context: js.UndefOr[String] = js.undefined
}
object Dictk {
  
  @scala.inline
  def apply(): Dictk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictk]
  }
  
  @scala.inline
  implicit class DictkMutableBuilder[Self <: Dictk] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
  }
}
