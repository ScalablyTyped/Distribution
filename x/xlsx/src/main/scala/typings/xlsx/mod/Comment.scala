package typings.xlsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Comment extends StObject {
  
  /** Author of the comment block */
  var a: js.UndefOr[String] = js.undefined
  
  /** Plaintext of the comment */
  var t: String
}
object Comment {
  
  @scala.inline
  def apply(t: String): Comment = {
    val __obj = js.Dynamic.literal(t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
  
  @scala.inline
  implicit class CommentMutableBuilder[Self <: Comment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setA(value: String): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAUndefined: Self = StObject.set(x, "a", js.undefined)
    
    @scala.inline
    def setT(value: String): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}
