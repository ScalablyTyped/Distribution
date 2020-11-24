package typings.wpapi.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterRouteOptions extends js.Object {
  
  var methods: js.UndefOr[js.Array[HTTPMethod]] = js.native
  
  var mixins: js.UndefOr[StringDictionary[js.Function1[/* val */ js.Any, _]]] = js.native
  
  var params: js.UndefOr[js.Array[String]] = js.native
}
object RegisterRouteOptions {
  
  @scala.inline
  def apply(): RegisterRouteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterRouteOptions]
  }
  
  @scala.inline
  implicit class RegisterRouteOptionsOps[Self <: RegisterRouteOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMethodsVarargs(value: HTTPMethod*): Self = this.set("methods", js.Array(value :_*))
    
    @scala.inline
    def setMethods(value: js.Array[HTTPMethod]): Self = this.set("methods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethods: Self = this.set("methods", js.undefined)
    
    @scala.inline
    def setMixins(value: StringDictionary[js.Function1[/* val */ js.Any, _]]): Self = this.set("mixins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMixins: Self = this.set("mixins", js.undefined)
    
    @scala.inline
    def setParamsVarargs(value: String*): Self = this.set("params", js.Array(value :_*))
    
    @scala.inline
    def setParams(value: js.Array[String]): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
  }
}
