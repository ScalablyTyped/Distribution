package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.routersTypesMod.PartialState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  key :string,   name :string}> & std.Readonly<{  params :object | undefined}> & {  state :std.Readonly<any> | tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.PartialState<std.Readonly<any>> | undefined} */
@js.native
trait Readonlykeystringnamestri extends StObject {
  
  val key: String = js.native
  
  val name: String = js.native
  
  val params: js.UndefOr[js.Object] = js.native
  
  // tslint:disable-next-line no-redundant-undefined
  var state: js.UndefOr[js.Any | PartialState[_]] = js.native
}
object Readonlykeystringnamestri {
  
  @scala.inline
  def apply(key: String, name: String): Readonlykeystringnamestri = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlykeystringnamestri]
  }
  
  @scala.inline
  implicit class ReadonlykeystringnamestriMutableBuilder[Self <: Readonlykeystringnamestri] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setState(value: js.Any | PartialState[_]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
