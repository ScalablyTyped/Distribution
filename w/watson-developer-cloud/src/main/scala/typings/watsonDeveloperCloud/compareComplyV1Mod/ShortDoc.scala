package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Brief information about the input document. */
trait ShortDoc extends StObject {
  
  /** The MD5 hash of the input document. */
  var hash: js.UndefOr[String] = js.undefined
  
  /** The title of the input document, if identified. */
  var title: js.UndefOr[String] = js.undefined
}
object ShortDoc {
  
  inline def apply(): ShortDoc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShortDoc]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShortDoc] (val x: Self) extends AnyVal {
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
