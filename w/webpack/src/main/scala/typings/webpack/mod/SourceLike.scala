package typings.webpack.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceLike extends StObject {
  
  def source(): String | Buffer
}
object SourceLike {
  
  inline def apply(source: () => String | Buffer): SourceLike = {
    val __obj = js.Dynamic.literal(source = js.Any.fromFunction0(source))
    __obj.asInstanceOf[SourceLike]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceLike] (val x: Self) extends AnyVal {
    
    inline def setSource(value: () => String | Buffer): Self = StObject.set(x, "source", js.Any.fromFunction0(value))
  }
}
