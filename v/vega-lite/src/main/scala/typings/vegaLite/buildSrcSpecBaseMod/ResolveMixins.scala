package typings.vegaLite.buildSrcSpecBaseMod

import typings.vegaLite.buildSrcResolveMod.Resolve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolveMixins extends StObject {
  
  /**
    * Scale, axis, and legend resolutions for view composition specifications.
    */
  var resolve: js.UndefOr[Resolve] = js.undefined
}
object ResolveMixins {
  
  inline def apply(): ResolveMixins = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveMixins]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolveMixins] (val x: Self) extends AnyVal {
    
    inline def setResolve(value: Resolve): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    
    inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
  }
}
