package typings.uirouterCore.resolveInterfaceMod

import typings.uirouterCore.stateInterfaceMod.ResolveTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolvableLiteral extends ResolveTypes {
  
  /** Pre-resolved data. */
  var data: js.UndefOr[js.Any] = js.native
  
  /**
    * The Dependency Injection tokens
    *
    * This is an array of Dependency Injection tokens for the dependencies of the [[resolveFn]].
    *
    * The DI tokens are references to other `Resolvables`, or to other
    * services from the native DI system.
    */
  var deps: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Defines the Resolve Policy
    *
    * A policy that defines when to invoke the resolve,
    * and whether to wait for async and unwrap the data
    */
  var policy: js.UndefOr[ResolvePolicy] = js.native
  
  /**
    * A function which fetches the Resolvable's data
    *
    * A function which returns one of:
    *
    * - The resolved value (synchronously)
    * - A promise for the resolved value
    * - An Observable of the resolved value(s)
    *
    * This function will be provided the dependencies listed in [[deps]] as its arguments.
    * The resolve system will asynchronously fetch the dependencies before invoking this function.
    */
  var resolveFn: js.Function = js.native
  
  /**
    * A Dependency Injection token
    *
    * This Resolvable's DI token.
    * The Resolvable will be injectable elsewhere using the token.
    */
  var token: js.Any = js.native
}
object ResolvableLiteral {
  
  @scala.inline
  def apply(resolveFn: js.Function, token: js.Any): ResolvableLiteral = {
    val __obj = js.Dynamic.literal(resolveFn = resolveFn.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvableLiteral]
  }
  
  @scala.inline
  implicit class ResolvableLiteralOps[Self <: ResolvableLiteral] (val x: Self) extends AnyVal {
    
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
    def setResolveFn(value: js.Function): Self = this.set("resolveFn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: js.Any): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDepsVarargs(value: js.Any*): Self = this.set("deps", js.Array(value :_*))
    
    @scala.inline
    def setDeps(value: js.Array[_]): Self = this.set("deps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeps: Self = this.set("deps", js.undefined)
    
    @scala.inline
    def setPolicy(value: ResolvePolicy): Self = this.set("policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
  }
}
