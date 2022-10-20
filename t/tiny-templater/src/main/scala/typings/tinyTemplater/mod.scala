package typings.tinyTemplater

import org.scalablytyped.runtime.StringDictionary
import typings.tinyTemplater.anon.ToString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** Creates a template function with the given template string. */
  inline def apply(thing: String): Template = ^.asInstanceOf[js.Dynamic].apply(thing.asInstanceOf[js.Any]).asInstanceOf[Template]
  inline def apply(thing: ToString): Template = ^.asInstanceOf[js.Dynamic].apply(thing.asInstanceOf[js.Any]).asInstanceOf[Template]
  
  @JSImport("tiny-templater", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** Data passed to a template function for interpolation. */
  trait Data
    extends StObject
       with /* key */ StringDictionary[String | Data]
  object Data {
    
    inline def apply(): Data = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Data]
    }
  }
  
  /** Returns a stored template string, interpolating the given data. */
  type Template = js.Function1[/* obj */ Data, String]
}
