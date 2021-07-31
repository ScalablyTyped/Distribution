package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyMerge extends StObject {
  
  // tslint:disable-next-line no-redundant-undefined
  var key: js.UndefOr[String] = js.undefined
  
  // tslint:disable-next-line no-redundant-undefined
  var merge: js.UndefOr[Boolean] = js.undefined
  
  var name: String
  
  // tslint:disable-next-line no-redundant-undefined
  var params: js.UndefOr[js.Object] = js.undefined
}
object KeyMerge {
  
  @scala.inline
  def apply(name: String): KeyMerge = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyMerge]
  }
  
  @scala.inline
  implicit class KeyMergeMutableBuilder[Self <: KeyMerge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setMerge(value: Boolean): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
