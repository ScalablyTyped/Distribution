package typings.typedoc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagMod {
  
  @JSImport("typedoc/dist/lib/models/comments/tag", "CommentTag")
  @js.native
  class CommentTag protected () extends StObject {
    def this(tagName: String) = this()
    def this(tagName: String, paramName: String) = this()
    def this(tagName: String, paramName: String, text: String) = this()
    def this(tagName: String, paramName: Unit, text: String) = this()
    
    var paramName: String = js.native
    
    var tagName: String = js.native
    
    var text: String = js.native
  }
}
