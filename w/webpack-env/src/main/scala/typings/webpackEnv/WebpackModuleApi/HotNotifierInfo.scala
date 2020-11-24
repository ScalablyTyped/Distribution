package typings.webpackEnv.WebpackModuleApi

import org.scalablytyped.runtime.NumberDictionary
import typings.std.Error
import typings.webpackEnv.webpackEnvStrings.`accept-errored`
import typings.webpackEnv.webpackEnvStrings.`self-accept-error-handler-errored`
import typings.webpackEnv.webpackEnvStrings.`self-accept-errored`
import typings.webpackEnv.webpackEnvStrings.`self-declined`
import typings.webpackEnv.webpackEnvStrings.accepted
import typings.webpackEnv.webpackEnvStrings.declined
import typings.webpackEnv.webpackEnvStrings.disposed
import typings.webpackEnv.webpackEnvStrings.unaccepted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HotNotifierInfo extends js.Object {
  
  /**
    * For declined/accepted/unaccepted: the chain from where the update was propagated.
    */
  var chain: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * For errors: the module id owning the accept handler.
    */
  var dependencyId: js.UndefOr[Double] = js.native
  
  /**
    * For errors: the thrown error
    */
  var error: js.UndefOr[Error] = js.native
  
  /**
    * The module in question.
    */
  var moduleId: Double = js.native
  
  /**
    * For self-accept-error-handler-errored: the error thrown by the module
    * before the error handler tried to handle it.
    */
  var originalError: js.UndefOr[Error] = js.native
  
  /**
    * For accepted: The location of accept handlers that will handle the update
    */
  var outdatedDependencies: js.UndefOr[NumberDictionary[js.Array[Double]]] = js.native
  
  /**
    * For accepted: the modules that are outdated and will be disposed
    */
  var outdatedModules: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * For declined: the module id of the declining parent
    */
  var parentId: js.UndefOr[Double] = js.native
  
  var `type`: `self-declined` | declined | unaccepted | accepted | disposed | `accept-errored` | `self-accept-errored` | `self-accept-error-handler-errored` = js.native
}
object HotNotifierInfo {
  
  @scala.inline
  def apply(
    moduleId: Double,
    `type`: `self-declined` | declined | unaccepted | accepted | disposed | `accept-errored` | `self-accept-errored` | `self-accept-error-handler-errored`
  ): HotNotifierInfo = {
    val __obj = js.Dynamic.literal(moduleId = moduleId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HotNotifierInfo]
  }
  
  @scala.inline
  implicit class HotNotifierInfoOps[Self <: HotNotifierInfo] (val x: Self) extends AnyVal {
    
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
    def setModuleId(value: Double): Self = this.set("moduleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(
      value: `self-declined` | declined | unaccepted | accepted | disposed | `accept-errored` | `self-accept-errored` | `self-accept-error-handler-errored`
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChainVarargs(value: Double*): Self = this.set("chain", js.Array(value :_*))
    
    @scala.inline
    def setChain(value: js.Array[Double]): Self = this.set("chain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChain: Self = this.set("chain", js.undefined)
    
    @scala.inline
    def setDependencyId(value: Double): Self = this.set("dependencyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDependencyId: Self = this.set("dependencyId", js.undefined)
    
    @scala.inline
    def setError(value: Error): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setOriginalError(value: Error): Self = this.set("originalError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalError: Self = this.set("originalError", js.undefined)
    
    @scala.inline
    def setOutdatedDependencies(value: NumberDictionary[js.Array[Double]]): Self = this.set("outdatedDependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutdatedDependencies: Self = this.set("outdatedDependencies", js.undefined)
    
    @scala.inline
    def setOutdatedModulesVarargs(value: Double*): Self = this.set("outdatedModules", js.Array(value :_*))
    
    @scala.inline
    def setOutdatedModules(value: js.Array[Double]): Self = this.set("outdatedModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutdatedModules: Self = this.set("outdatedModules", js.undefined)
    
    @scala.inline
    def setParentId(value: Double): Self = this.set("parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentId: Self = this.set("parentId", js.undefined)
  }
}
