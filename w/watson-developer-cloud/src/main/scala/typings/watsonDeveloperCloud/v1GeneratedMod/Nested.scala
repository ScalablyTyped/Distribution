package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Nested. */
trait Nested extends StObject {
  
  /** The area of the results the aggregation was restricted to. */
  var path: js.UndefOr[String] = js.undefined
}
object Nested {
  
  @scala.inline
  def apply(): Nested = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Nested]
  }
  
  @scala.inline
  implicit class NestedMutableBuilder[Self <: Nested] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
