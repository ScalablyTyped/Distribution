package typings.ts3NodejsLibrary.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ts3-nodejs-library.ts3-nodejs-library/lib/util/Permission.Permission.PermType> */
trait PartialPermType extends StObject {
  
  var permname: js.UndefOr[String | Double] = js.undefined
  
  var permnegated: js.UndefOr[Boolean] = js.undefined
  
  var permskip: js.UndefOr[Boolean] = js.undefined
  
  var permvalue: js.UndefOr[Double] = js.undefined
}
object PartialPermType {
  
  @scala.inline
  def apply(): PartialPermType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPermType]
  }
  
  @scala.inline
  implicit class PartialPermTypeMutableBuilder[Self <: PartialPermType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermname(value: String | Double): Self = StObject.set(x, "permname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermnameUndefined: Self = StObject.set(x, "permname", js.undefined)
    
    @scala.inline
    def setPermnegated(value: Boolean): Self = StObject.set(x, "permnegated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermnegatedUndefined: Self = StObject.set(x, "permnegated", js.undefined)
    
    @scala.inline
    def setPermskip(value: Boolean): Self = StObject.set(x, "permskip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermskipUndefined: Self = StObject.set(x, "permskip", js.undefined)
    
    @scala.inline
    def setPermvalue(value: Double): Self = StObject.set(x, "permvalue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermvalueUndefined: Self = StObject.set(x, "permvalue", js.undefined)
  }
}
